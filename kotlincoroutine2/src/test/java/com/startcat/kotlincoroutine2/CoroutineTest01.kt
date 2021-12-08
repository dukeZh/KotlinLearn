package com.startcat.kotlincoroutine2

import kotlinx.coroutines.*
import org.junit.Test
import java.lang.IllegalArgumentException
import kotlin.system.measureTimeMillis

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
    }


    @Test
    fun `test coroutines join`(): Unit = runBlocking {
        val job1 = launch {
            delay(2000)
            println("one")
        }
        job1.join()

        val job2 = launch {
            delay(200)
            println("two")
        }

        val job3 = launch {
            delay(200)
            println("three")
        }
    }

    @Test
    fun `test coroutines awit`(): Unit = runBlocking {
        val job1 = async {
            delay(2000)
            println("one")
        }
        job1.await()

        val job2 = async {
            delay(200)
            println("two")
        }

        val job3 = async {
            delay(200)
            println("three")
        }
    }


    @Test
    fun `test asnc`(): Unit = runBlocking {
        val measureTimeMillis = measureTimeMillis {
            val one = doOne()
            val two = doTwo()
            println("The result:${one.plus(two)}")
        }
        println("completed in $measureTimeMillis ms")
    }


    @Test
    fun `test combine async`(): Unit = runBlocking {
        val measureTimeMillis = measureTimeMillis {
            val one = async { doOne() }
            val two = async { doTwo() }
            println("The result:${one.await()+two.await()}")
//            val one = async { doOne() }.await()
//            val two = async { doTwo() }.await()
//            println("The result:${one+two}")
        }
        println("completed in $measureTimeMillis ms")
    }

    private suspend fun doOne():Int{
        delay(1000)
        return 14
    }

    private suspend fun doTwo():Int{
        delay(1000)
        return 25
    }


    @Test
    fun `test start mode`(): Unit = runBlocking {
/*       val job = launch(start = CoroutineStart.DEFAULT) {
            //....
           delay(10000)
           println("job finished")
       }
        delay(1000)*/
       // job.cancel()

/*        val job = async (start = CoroutineStart.LAZY){
            29
        }
        //....计算
        job.await()*/

        val job = async (context = Dispatchers.IO, start = CoroutineStart.UNDISPATCHED){
            //UNDISPATCHED 依旧在主线程，DEFAULT 子线程
           println("thread:"+Thread.currentThread().name)
        }
    }


    @Test
    fun `test supervisor scope builder`(): Unit = runBlocking {
        //supervisorScope 当job2 出现异常，job1 不会被取消
        //一个协程失败了，不影响其他兄弟协程
        supervisorScope {
            val job1 = launch {
                delay(400)
                println("job1 finished")
            }

            val job2 = async {
                delay(200)
                println("job2 finished")
                "job2 result"
                throw IllegalArgumentException()
            }
        }
    }

    @Test
    fun `test coroutine scope builder`(): Unit = runBlocking {
        //coroutineScope 当job2 出现异常，job1 也会被取消
        //一个协程失败了，所有其他兄弟协程也会被取消
        coroutineScope {
            val job1 = launch {
                delay(400)
                println("job1 finished")
            }

            val job2 = async {
                delay(200)
                println("job2 finished")
                "job2 result"
                throw IllegalArgumentException()
            }
        }
    }
}