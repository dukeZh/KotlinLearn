package com.startcat.kotlincoroutine.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.startcat.kotlincoroutine.R
import com.startcat.kotlincoroutine.api.userServiceApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("StaticFieldLeak")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button).also {
            it.setOnClickListener {
                //异步逻辑同步化，杜绝地域回调
                GlobalScope.launch(Dispatchers.Main) {
                    val user = withContext(Dispatchers.IO) {
                        userServiceApi.getUser()
                    }
                    textView.text = user.toString()
                }
            }
        }
    }
}