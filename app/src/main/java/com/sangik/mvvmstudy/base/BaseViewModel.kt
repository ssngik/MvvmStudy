package com.sangik.mvvmstudy.base

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

open class BaseViewModel : ViewModel(){
    // 메모리 누수 방지
    private val compositeDisposable = CompositeDisposable()

    fun addDisposable(disposable: Disposable){ compositeDisposable.add(disposable) }

    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }
}