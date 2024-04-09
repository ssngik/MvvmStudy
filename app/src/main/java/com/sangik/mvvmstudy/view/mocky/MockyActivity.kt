package com.sangik.mvvmstudy.view.mocky

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.sangik.mvvmstudy.BR
import com.sangik.mvvmstudy.R
import com.sangik.mvvmstudy.base.BaseActivity
import com.sangik.mvvmstudy.databinding.ActivityMockyBinding

class MockyActivity : BaseActivity<ActivityMockyBinding, MockeyViewModel> (
    resourceId = R.layout.activity_mocky,
    clazz = MockeyViewModel::class,
    viewModelId = BR.vmMocky

){
    private lateinit var myAdapter : MyAdapter
    override fun init(savedInstanceState: Bundle?) {
        super.init(savedInstanceState)
        initRecyclerView()
        initObserver()
        viewModel.getMockyApi()
    }
    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState) }

    private fun initObserver() {
        viewModel.userList.observe(this, Observer {
            // 데이터 변경시 처리
            myAdapter.setData(it)
        })
    }

    private fun initRecyclerView() {
        myAdapter = MyAdapter()
        viewDataBinding.recyclerview.adapter = myAdapter
        viewDataBinding.recyclerview.layoutManager = LinearLayoutManager(this)
    }

    override fun initListener() {
        viewDataBinding.tvMocky.setOnClickListener { Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show() }
    }
}
