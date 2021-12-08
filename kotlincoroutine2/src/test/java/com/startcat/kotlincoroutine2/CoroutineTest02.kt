package com.startcat.kotlincoroutine2

import kotlinx.coroutines.*
import org.junit.Test
import java.lang.Exception
import java.lang.IllegalArgumentException
import kotlin.system.measureTimeMillis

class CoroutineTest02 {

    //runBlocking 会把主线程变成主协程
    @Test
    fun `test coroutine cancel`() = runBlocking<Unit>{
        val scope = CoroutineScope(Dispatchers.Default)
        scope.launch {
            delay(1000)
            println("job1")
        }

        scope.launch {
            delay(1000)
            println("job2")
        }
        delay(1000)
        scope.cancel()
        delay(2000)
    }


    @Test
    fun `test brother cancel`() = runBlocking<Unit>{
        val scope = CoroutineScope(Dispatchers.Default)
        val job1 =  scope.launch {
            delay(1000)
            println("job1")
        }

        val job2 =   scope.launch {
            delay(1000)
            println("job2")
        }
        delay(100)
        job1.cancel()
        delay(2000)
    }


    @Test
    fun `test CancellationException`() = runBlocking<Unit>{
        val job1 = GlobalScope.launch {
            try {
                delay(1000)
                println("job1")
            }catch (e:Exception){
                e.printStackTrace()
            }
        }
        delay(100)
//        job1.cancel(CancellationException("取消"))
//        job1.join()
        job1.cancelAndJoin()
    }


    @Test
    fun `test cancel cpu task by is Active`() = runBlocking<Unit>{
        val startTime = System.currentTimeMillis()
        val job = launch (Dispatchers.Default){
            var nextPrintTime = startTime
            var i = 0
            while (i<5 && isActive){
                if (System.currentTimeMillis() >= nextPrintTime){
                    println("job: I'm sleeping ${i++}...")
                    nextPrintTime += 500
                }
            }
        }
        delay(1300)
        println("main: I'm tried of waiting")
        job.cancelAndJoin()
        println("main: Now I can quit")
    }

    @Test
    fun `test cancel cpu task by ensureActive`() = runBlocking<Unit>{
        val startTime = System.currentTimeMillis()
        val job = launch (Dispatchers.Default){
            var nextPrintTime = startTime
            var i = 0
            while (i<5 ){
                ensureActive()
                if (System.currentTimeMillis() >= nextPrintTime){
                    println("job: I'm sleeping ${i++}...")
                    nextPrintTime += 500
                }
            }
        }
        delay(1300)
        println("main: I'm tried of waiting")
        job.cancelAndJoin()
        println("main: Now I can quit")

        //31
    }
}