package org.signal.core.util.concurrent

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable

/**
 * A lifecycle-aware [Disposable] that, after being bound to a lifecycle, will automatically dispose all contained disposables at the proper time.
 */
//class này có tính năng là quản lý vòng đời các Activity khác
class LifecycleDisposable : DefaultLifecycleObserver {
  val disposables: CompositeDisposable = CompositeDisposable()

  fun bindTo(lifecycleOwner: LifecycleOwner): LifecycleDisposable {
    Log.d("CHUNG", "CHUNG LifecycleDisposable -> bindTo() ${lifecycleOwner.javaClass.simpleName}")
    Log.d("CHUNG", "CHUNG LifecycleDisposable -> bindTo() $this")


    return bindTo(lifecycleOwner.lifecycle)
  }

  fun bindTo(lifecycle: Lifecycle): LifecycleDisposable {
    //cái này là code dùng để gắn addObserver vào cho lifecycle, và trả ra object của chính class LifecycleDisposable
    lifecycle.addObserver(this)
    return this
  }

  fun add(disposable: Disposable): LifecycleDisposable {
    disposables.add(disposable)
    return this
  }

  fun addAll(vararg disposable: Disposable): LifecycleDisposable {
    disposables.addAll(*disposable)
    return this
  }

  fun clear() {
    disposables.clear()
  }

  override fun onDestroy(owner: LifecycleOwner) {
    owner.lifecycle.removeObserver(this)
    disposables.clear()
  }

  operator fun plusAssign(disposable: Disposable) {
    add(disposable)
  }
}

fun Disposable.addTo(lifecycleDisposable: LifecycleDisposable): Disposable = apply { lifecycleDisposable.add(this) }
