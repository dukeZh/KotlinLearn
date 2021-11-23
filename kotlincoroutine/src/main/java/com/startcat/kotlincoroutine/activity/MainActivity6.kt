package com.startcat.kotlincoroutine.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.startcat.kotlincoroutine.R
import kotlinx.coroutines.*
import kotlin.coroutines.*

/**
 * MainScope 使用
 */
class MainActivity6 : AppCompatActivity() {
    private var textView: TextView? = null

    @DelicateCoroutinesApi
    @SuppressLint("StaticFieldLeak")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button).also {
            it.setOnClickListener {

            }
        }
    }
}