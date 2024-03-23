package com.sangik.mvvmstudy.view.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.sangik.mvvmstudy.R
import com.sangik.mvvmstudy.ViewInterface
import com.sangik.mvvmstudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), ViewInterface {
    // Main : Binding 연결과 ViewModel 선언
    private lateinit var binding : ActivityMainBinding
    private val model: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        init(savedInstanceState)
    }

    override fun init(savedInstanceState: Bundle?) {
        initDataBinding()
        initListener()
    }

    override fun initDataBinding() {
        // Layout과 데이터 바인딩
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // LiveData를 활용하기 위한 LifecycleOwner 설정
        binding.lifecycleOwner = this

        // viewModel과 레이아웃 바인딩
        binding.vmMain = model
    }

    override fun initListener()
    {
        Toast.makeText(this@MainActivity, "initListener!", Toast.LENGTH_SHORT).show()
    }
}