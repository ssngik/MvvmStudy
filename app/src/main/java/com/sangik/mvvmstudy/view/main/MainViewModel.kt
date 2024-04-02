package com.sangik.mvvmstudy.view.main

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sangik.mvvmstudy.base.BaseViewModel

class MainViewModel : BaseViewModel(){
    // 현재 카운트 관리 LiveData
    val countResult = MutableLiveData<Int>()

    init {
        countResult.value = 0
    }

    fun increase()
    {
        countResult.value = countResult.value?.plus(1)
    }

    fun decrease()
    {
        countResult.value = countResult.value?.minus(1)
    }


}