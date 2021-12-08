package com.startcat.kotlincoroutine.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.startcat.kotlincoroutine.R
import com.startcat.kotlincoroutine.api.User
import com.startcat.kotlincoroutine.api.userServiceApi
import kotlinx.coroutines.*

class MainActivity3 : AppCompatActivity() {
    private var textView: TextView? = null

    @SuppressLint("StaticFieldLeak")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button).also {
            it.setOnClickListener {
                //异步逻辑同步化，杜绝地域回调
                GlobalScope.launch(Dispatchers.Main) {
                    getUser()
                }
            }
        }
    }

    private suspend fun getUser() {
        val user = get()
        show(user)
    }

    private fun show(user: User) {
        textView?.text = user.toString()
    }

    private suspend fun get(): User = withContext(Dispatchers.IO) {
        userServiceApi.getUser()
    }
}