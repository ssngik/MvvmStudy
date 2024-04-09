package com.sangik.mvvmstudy.data.source

import com.sangik.mvvmstudy.data.dto.MockUser
import retrofit2.Call
import retrofit2.http.GET

interface MockyService {
    @GET("/v3/75415645-1764-4a7d-b7c9-e68cb24568a4")
    fun getUsers(): Call<List<MockUser>>
}