package com.sangik.mvvmstudy.view.naver

import android.os.Bundle
import android.widget.Toast
import com.sangik.mvvmstudy.BR
import com.sangik.mvvmstudy.R
import com.sangik.mvvmstudy.base.BaseActivity
import com.sangik.mvvmstudy.databinding.ActivityNaverBinding

class NaverApiActivity : BaseActivity<ActivityNaverBinding, NaverApiViewModel> (
    resourceId = R.layout.activity_naver,
    clazz = NaverApiViewModel::class,
    viewModelId = BR.vmNaver

){
    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState) }

    override fun init(savedInstanceState: Bundle?) { super.init(savedInstanceState) }

    override fun initListener() {
        viewDataBinding.tvNaver.setOnClickListener {
            Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show()
        }
    }
}
