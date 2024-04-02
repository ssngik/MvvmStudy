package com.sangik.mvvmstudy

import android.os.Bundle

interface BaseViewInterface {
    fun initDataBinding()
    fun init(savedInstanceState: Bundle?)
    fun initListener()
}