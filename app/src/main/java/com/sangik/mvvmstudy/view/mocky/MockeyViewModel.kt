package com.sangik.mvvmstudy.view.mocky

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.sangik.mvvmstudy.base.BaseViewModel
import com.sangik.mvvmstudy.data.dto.MockUser
import com.sangik.mvvmstudy.data.source.MockyService
import com.sangik.mvvmstudy.util.RetrofitService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MockeyViewModel : BaseViewModel(){
    // 수정 가능
    private val _userList = MutableLiveData<ArrayList<MockUser>>()
    // 외부에서 수정 불가, 읽기 전용
    val userList : LiveData<ArrayList<MockUser>>
        get() = _userList

    fun getMockyApi(){
        val retrofit = RetrofitService.getInstance().create(MockyService::class.java)

        retrofit.also {
            it.getUsers()
                .enqueue(object : Callback<List<MockUser>>{
                    override fun onResponse(
                        call: Call<List<MockUser>>, response: Response<List<MockUser>>
                    ) {
                        val fetchUserList = response.body()
                        if (fetchUserList!=null){
                            _userList.postValue(fetchUserList as ArrayList<MockUser>)
                        }else{
                            Log.d("mocky", "Error Fetching data")
                        }
                    }
                    override fun onFailure(call: Call<List<MockUser>>, t: Throwable) {
                        Log.d("Mocky","onFailure Mocky!")
                    }
                })
        }
    }

}


