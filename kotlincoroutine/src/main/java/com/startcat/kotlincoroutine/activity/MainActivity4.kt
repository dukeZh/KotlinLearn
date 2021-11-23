package com.startcat.kotlincoroutine.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.startcat.kotlincoroutine.R
import com.startcat.kotlincoroutine.api.User
import com.startcat.kotlincoroutine.api.userServiceApi
import kotlinx.coroutines.*

class MainActivity4 : AppCompatActivity() {
    private var textView: TextView? = null

    @DelicateCoroutinesApi
    @SuppressLint("StaticFieldLeak")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button).also {
            it.setOnClickListener {
                //异步逻辑同步化，杜绝地域回调
                GlobalScope.launch(Dispatchers.Main) {
                   //挂起  当前线程没有停止，还在做其他事情
                    delay(12000)
                    Log.d("kotlin_learn","${Thread.currentThread().name}:after delay.")

                    //阻塞 当前线程停止，啥都不做
                    Thread.sleep(12000)
                    Log.d("kotlin_learn","${Thread.currentThread().name}:after sleep.")
                }
            }
        }
    }
}