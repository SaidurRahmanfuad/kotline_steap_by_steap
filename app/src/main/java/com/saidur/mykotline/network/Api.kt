package com.saidur.mykotline.network

import com.saidur.mykotline.network.response.ResponseLogin
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

interface Api {
    @POST("/Api/Login/Mobile")
    suspend fun getLogin(): Call<ResponseLogin>

    @GET("/posts")
    suspend fun getUser(): Response<ResponseLogin>
}