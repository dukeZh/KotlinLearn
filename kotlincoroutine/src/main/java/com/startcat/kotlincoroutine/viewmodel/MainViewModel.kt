package com.startcat.kotlincoroutine.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.startcat.kotlincoroutine.api.User
import com.startcat.kotlincoroutine.repository.UserRepository
import kotlinx.coroutines.launch

class MainViewModel :ViewModel(){
    val userLiveData = MutableLiveData<User>()

    private val userRepository = UserRepository()

    fun getUser(){
        viewModelScope.launch {
           val user = userRepository.getUser()
            if (user.errorCode == 200){
                userLiveData.value = user
            }
        }
    }
}