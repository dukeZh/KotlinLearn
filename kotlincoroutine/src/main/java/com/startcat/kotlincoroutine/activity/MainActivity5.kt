package com.startcat.kotlincoroutine.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.startcat.kotlincoroutine.R
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlin.coroutines.*

/**
 * 源码编写一个协程
 */
class MainActivity5 : AppCompatActivity() {
    @DelicateCoroutinesApi
    @SuppressLint("StaticFieldLeak")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //协程体
        val continuation = suspend {
            5
        }.createCoroutine(object : Continuation<Int> {
            override val context: CoroutineContext = EmptyCoroutineContext

            override fun resumeWith(result: Result<Int>) {
                println("Coroutine End:$result")
            }

        })
        continuation.resume(Unit)
    }
}