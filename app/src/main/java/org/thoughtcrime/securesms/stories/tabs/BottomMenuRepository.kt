package org.thoughtcrime.securesms.stories.tabs

import io.reactivex.rxjava3.core.Flowable
import org.thoughtcrime.securesms.database.RxDatabaseObserver
import org.thoughtcrime.securesms.database.SignalDatabase
import org.thoughtcrime.securesms.recipients.Recipient


//class này chuyên xữ lý lấy từ Database ra các số liệu về unreal message, storie....
class BottomMenuRepository {

  //tạo 1 flowable để lấy dữ liệu từ database, trả ra 1 flowable , mà flowable này nó phải được tạo ra từ việc tạo 1 Threads bắn vào database lấy data ra xong hết.
  fun getNumberOfUnreadMessages(): Flowable<Long> {
    return RxDatabaseObserver.conversationList.map { SignalDatabase.threads.getUnreadMessageCount() }
  }

  //cho nên ta mới có class RxDatabaseObserver, cái tên noí lên tác dụng của nó
  fun getNumberOfUnseenStories(): Flowable<Long> {
    return RxDatabaseObserver.conversationList.map {
      SignalDatabase
        .messages
        .getUnreadStoryThreadRecipientIds()
        .map { Recipient.resolved(it) }
        .filterNot { it.shouldHideStory }
        .size
        .toLong()
    }
  }

  fun getHasFailedOutgoingStories(): Flowable<Boolean> {
    return RxDatabaseObserver.conversationList.map { SignalDatabase.messages.hasFailedOutgoingStory() }
  }

  fun getNumberOfUnseenCalls(): Flowable<Long> {
    return RxDatabaseObserver.conversationList.map { SignalDatabase.calls.getUnreadMissedCallCount() }
  }
}
