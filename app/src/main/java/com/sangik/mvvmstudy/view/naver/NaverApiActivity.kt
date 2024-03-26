package com.sangik.mvvmstudy.view.naver

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sangik.mvvmstudy.ViewInterface
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.sangik.mvvmstudy.R
import com.sangik.mvvmstudy.databinding.ActivityNaverBinding

class NaverApiActivity : AppCompatActivity(), ViewInterface{
    private lateinit var binding : ActivityNaverBinding
    private val model: NaverApiViewModel by viewModels()
    // TODO: API 호출 종류 선택 후 구현
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init(savedInstanceState)
    }
    override fun init(savedInstanceState: Bundle?) {
        initDataBinding()
    }
    override fun initDataBinding() {
        // Layout과 데이터 바인딩
        binding = DataBindingUtil.setContentView(this, R.layout.activity_naver)

        // LiveData를 활용하기 위한 LifecycleOwner 설정
        binding.lifecycleOwner = this

        // viewModel과 레이아웃 바인딩
        binding.vmNaver = model
    }
    override fun initListener() { TODO("Not yet implemented") }
}
