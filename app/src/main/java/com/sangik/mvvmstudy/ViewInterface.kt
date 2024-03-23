package com.sangik.mvvmstudy

import android.os.Bundle

interface ViewInterface {
    fun initDataBinding()
    fun init(savedInstanceState: Bundle?)
    fun initListener()
}