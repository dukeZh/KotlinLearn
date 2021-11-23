package com.startcat.kotlincoroutine.activity

import android.annotation.SuppressLint
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.startcat.kotlincoroutine.R
import com.startcat.kotlincoroutine.api.User
import com.startcat.kotlincoroutine.api.userServiceApi

class MainActivity : AppCompatActivity() {
    @SuppressLint("StaticFieldLeak")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button).also {
            it.setOnClickListener {
               object :AsyncTask<Void,Void,User>(){
                   override fun doInBackground(vararg params: Void?): User? {
                      return userServiceApi.loadUser().execute().body()
                   }

                   override fun onPostExecute(result: User?) {
                       textView.text = result.toString()
                   }
               }.execute()
            }
        }
    }
}