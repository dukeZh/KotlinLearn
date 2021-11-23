package com.startcat.kotlincoroutine.activity

import android.annotation.SuppressLint
import android.app.Activity
import android.app.ActivityManager
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.startcat.kotlincoroutine.R
import com.startcat.kotlincoroutine.api.userServiceApi
import com.startcat.kotlincoroutine.databinding.ActivityMainBinding
import com.startcat.kotlincoroutine.viewmodel.MainViewModel
import kotlinx.coroutines.*
import java.lang.Exception
import kotlin.coroutines.*

/**
 * MainScope 使用
 */
class MainActivity7 : AppCompatActivity() {

    //coroutineScope 协程作用域参考 协程作用域.png
    private val mainViewModel:MainViewModel by viewModels()
    @DelicateCoroutinesApi
    @SuppressLint("StaticFieldLeak")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val contentView = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        contentView.viewModel = mainViewModel
        contentView.lifecycleOwner = this
            contentView.button.setOnClickListener {
                mainViewModel.getUser()
            }
    }
}