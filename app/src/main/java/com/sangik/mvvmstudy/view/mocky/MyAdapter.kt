package com.sangik.mvvmstudy.view.mocky

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sangik.mvvmstudy.data.dto.MockUser
import com.sangik.mvvmstudy.databinding.MockyItemBinding

class MyAdapter() : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    private var userList = mutableListOf<MockUser>()
    inner class MyViewHolder(private val binding: MockyItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(mockUser : MockUser){
            binding.user = mockUser
        }
    }

    // 어떤 xml로 View Holder를 생성할지 지정
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val binding = MockyItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    // 뷰 홀더에 데이터 바인딩
    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        holder.bind(userList[position])
    }

    // 뷰 홀더의 개수 리턴
    override fun getItemCount(): Int { return userList.size }

    fun setData(data : ArrayList<MockUser>){
        userList = data
        notifyDataSetChanged()
    }

}

