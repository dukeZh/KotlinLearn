package com.example.mylibrary.kotlin1120

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

//携程 Coroutine
fun main() {
    // startOneThread()
    // startMoreThread(4)
    startMoreCoroutineThread(4)

}

fun startMoreCoroutineThread(number: Int) {
    repeat(number) {
        GlobalScope.launch {
            println("Hi from ${Thread.currentThread()}")
        }
    }
}

private fun startMoreThread(number: Int) {
    val states = arrayOf("Starting", "Doing Task 1", "Doing Task 2", "Ending")
    repeat(number) {
        Thread {
            println("${Thread.currentThread()} has started")
            for (i in states) {
                println("${Thread.currentThread()} - $i")
                Thread.sleep(50)
            }
        }.start()
    }
}

fun startOneThread() {
    val thread = Thread {
        println("${Thread.currentThread()} has run.")
    }
    thread.start()
}
