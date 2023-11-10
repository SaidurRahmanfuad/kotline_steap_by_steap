package com.saidur.mykotline.network

import com.google.gson.GsonBuilder
import com.saidur.mykotline.utils.Const
import okhttp3.Interceptor
import okhttp3.OkHttp
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitInstance {
    companion object {
     /*   val BASE_URL = "https://shomadhan.top/admin/api"
        private val okhttp = OkHttpClient.Builder()
        private val builder = Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okhttp.build())

        private val retrofit = builder.build()

        fun getInstance(): Retrofit {
            return Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okhttp.build())
                .build().create()
        }

        fun makeRetrofitService(): RetrofitInstance {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(RetrofitInstance::class.java)
        }*/


        private val retrofit by lazy {
            val login =HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
            val client=OkHttpClient.Builder()
                        .addInterceptor(login)
                        .build()
            Retrofit.Builder()
                .baseUrl(Const.BaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
        }
        private val api by lazy {
            retrofit.create(Api::class.java)
        }

    }
}

