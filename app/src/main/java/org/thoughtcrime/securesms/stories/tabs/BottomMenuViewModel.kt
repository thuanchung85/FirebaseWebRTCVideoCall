package org.thoughtcrime.securesms.stories.tabs

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.kotlin.plusAssign
import io.reactivex.rxjava3.subjects.PublishSubject
import io.reactivex.rxjava3.subjects.Subject
import org.thoughtcrime.securesms.stories.Stories
import org.thoughtcrime.securesms.util.rx.RxStore

class BottomMenuViewModel(repository: BottomMenuRepository) : ViewModel() {
  private val store = RxStore(BottomMenuState())

  val stateSnapshot: BottomMenuState
    get() = store.state

  val state: Flowable<BottomMenuState> = store.stateFlowable.distinctUntilChanged().observeOn(AndroidSchedulers.mainThread())
  val disposables = CompositeDisposable()

  private val internalTabClickEvents: Subject<BottomMenuEnum> = PublishSubject.create()
  val tabClickEvents: Observable<BottomMenuEnum> = internalTabClickEvents.filter { Stories.isFeatureEnabled() }

  init {
    disposables += performStoreUpdate(repository.getNumberOfUnreadMessages()) { unreadChats, state ->
      state.copy(unreadMessagesCount = unreadChats)
    }

    disposables += performStoreUpdate(repository.getNumberOfUnseenCalls()) { unseenCalls, state ->
      state.copy(unreadCallsCount = unseenCalls)
    }

    disposables += performStoreUpdate(repository.getNumberOfUnseenStories()) { unseenStories, state ->
      state.copy(unreadStoriesCount = unseenStories)
    }

    disposables += performStoreUpdate(repository.getHasFailedOutgoingStories()) { hasFailedStories, state ->
      state.copy(hasFailedStory = hasFailedStories)
    }
  }

  override fun onCleared() {
    disposables.clear()
  }

  fun onChatsSelected() {
    Log.d("CHUNG", "BottomMenuViewModel -> onChatsSelected: ")
    internalTabClickEvents.onNext(BottomMenuEnum.CHATS)
    performStoreUpdate { it.copy(tab = BottomMenuEnum.CHATS) }
  }

  fun onCallsSelected() {
    Log.d("CHUNG", "BottomMenuViewModel -> onCallsSelected: ")
    internalTabClickEvents.onNext(BottomMenuEnum.CALLS)
    performStoreUpdate { it.copy(tab = BottomMenuEnum.CALLS) }
  }

  fun onStoriesSelected() {
    Log.d("CHUNG", "BottomMenuViewModel -> onStoriesSelected: ")
    internalTabClickEvents.onNext(BottomMenuEnum.STORIES)
    performStoreUpdate { it.copy(tab = BottomMenuEnum.STORIES) }
  }

  fun onSearchOpened() {
    performStoreUpdate { it.copy(visibilityState = it.visibilityState.copy(isSearchOpen = true)) }
  }

  fun onSearchClosed() {
    performStoreUpdate { it.copy(visibilityState = it.visibilityState.copy(isSearchOpen = false)) }
  }

  fun onMultiSelectStarted() {
    performStoreUpdate { it.copy(visibilityState = it.visibilityState.copy(isMultiSelectOpen = true)) }
  }

  fun onMultiSelectFinished() {
    performStoreUpdate { it.copy(visibilityState = it.visibilityState.copy(isMultiSelectOpen = false)) }
  }

  fun isShowingArchived(isShowingArchived: Boolean) {
    performStoreUpdate { it.copy(visibilityState = it.visibilityState.copy(isShowingArchived = isShowingArchived)) }
  }

  private fun performStoreUpdate(fn: (BottomMenuState) -> BottomMenuState) {
    store.update {
      fn(it.copy(prevTab = it.tab))
    }
  }

  private fun <T : Any> performStoreUpdate(flowable: Flowable<T>, fn: (T, BottomMenuState) -> BottomMenuState): Disposable {
    return store.update(flowable) { t, state ->
      fn(t, state.copy(prevTab = state.tab))
    }
  }



  //cái calss Factory này nó kế thừa Factory interface của ViewModelProvider, mục tiêu là tạo ra 1 viewModel của class truyền vào  hàm create. và tạo xong thi return viewmodel đó ra ngoài
  class Factory(private val repository: BottomMenuRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
      return modelClass.cast(BottomMenuViewModel(repository)) as T
    }
  }
}
