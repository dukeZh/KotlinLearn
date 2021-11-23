package com.startcat.kotlincoroutine.repository

import com.startcat.kotlincoroutine.api.User
import com.startcat.kotlincoroutine.api.userServiceApi

class UserRepository {
    suspend fun getUser():User{
        return userServiceApi.getUser()
    }
}