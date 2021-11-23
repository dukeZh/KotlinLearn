package com.startcat.kotlincoroutine.api

import android.util.Log
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

data class User(
    val `data`: List<Data>,
    val errorCode: Int,
    val errorMsg: String
)

data class Data(
    val desc: String,
    val id: Int,
    val imagePath: String,
    val isVisible: Int,
    val order: Int,
    val title: String,
    val type: Int,
    val url: String
)

val userServiceApi: UserServiceApi by lazy {
    val retrofit = Retrofit.Builder()
        .client(OkHttpClient.Builder().addInterceptor {
            it.proceed(it.request().apply {
                Log.d("kotlin_learn", "request：${this.url}")
            })
        }.build())
        .baseUrl(Config.BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
    retrofit.create(UserServiceApi::class.java)
}

interface UserServiceApi {
    @GET("banner/json")
    fun loadUser(): Call<User>

    @GET("banner/json")
   suspend fun getUser(): User
}