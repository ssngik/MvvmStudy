package com.sangik.mvvmstudy.view.main

import android.os.Bundle
import com.sangik.mvvmstudy.R
import com.sangik.mvvmstudy.BR
import com.sangik.mvvmstudy.base.BaseActivity
import com.sangik.mvvmstudy.databinding.ActivityMainBinding
import com.sangik.mvvmstudy.util.ActivityUtil

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(
    resourceId = R.layout.activity_main,
    clazz = MainViewModel::class,
    viewModelId = BR.vmMain
){
    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState) }
    override fun init(savedInstanceState: Bundle?) { super.init(savedInstanceState) }

    override fun initListener() {
        viewDataBinding.btnMove.setOnClickListener {
            val activityUtil = ActivityUtil()
            activityUtil.startMockyActivity(this)
        }
    }
}