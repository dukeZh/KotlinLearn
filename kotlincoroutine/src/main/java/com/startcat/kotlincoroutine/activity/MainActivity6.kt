package com.startcat.kotlincoroutine.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.startcat.kotlincoroutine.R
import com.startcat.kotlincoroutine.api.userServiceApi
import kotlinx.coroutines.*
import java.lang.Exception
import kotlin.coroutines.*

/**
 * MainScope 使用
 */
class MainActivity6 : AppCompatActivity(), CoroutineScope by MainScope() {

    // private var mainScope = MainScope()
    private var textView: TextView? = null

    @DelicateCoroutinesApi
    @SuppressLint("StaticFieldLeak")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button).also {
            it.setOnClickListener {
                /*mainScope.launch {
                   val user = userServiceApi.getUser()
                        textView?.text = user.toString()
//                    try {
//                        delay(10000)
//                    } catch (e: Exception) {
//                        e.printStackTrace()
//                    }
                }*/
                launch {
                    val user = userServiceApi.getUser()
                    textView?.text = user.toString()
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
//        mainScope.cancel()
        cancel()
    }
}