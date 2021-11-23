package com.startcat.kotlincoroutine2

import kotlinx.coroutines.*
import org.junit.Test

class CoroutineTest01 {

    //runBlocking 会把主线程变成主协程
    @Test
    fun `test coroutine builder`(): Unit = runBlocking {
        val job1 = launch {
            delay(200)
            println("job1 finished.")
        }

        val job2 = async {
            delay(200)
            println("job2 finished.")
            "job2 result"
        }
        println(job2.await())

        //21
    }
}