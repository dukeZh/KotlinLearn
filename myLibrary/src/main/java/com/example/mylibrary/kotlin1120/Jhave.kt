//@JvmName 使用
@file:JvmName("Hero")

package com.example.mylibrary.kotlin1120

import java.io.IOException
import java.lang.Exception
import kotlin.jvm.Throws

fun main() {
    //kotlin java 交互

    //Kotlin 调用 java
   // kotlinUseJava()

    //java 调用 Kotlin
    javaUseKotlin()
}

fun javaUseKotlin() {
    val adversary = Jhava()
    adversary.javaUseKotlin()
}

private fun kotlinUseJava() {

    val adversary = Jhava()
    println(adversary.utterGreeting())
    //平台类型
    val level = adversary.determineFriendShipLevel()
    level?.toLowerCase()

    //  println(adversary.hitPoints.javaClass)

    adversary.hitPoints = 5

    println(adversary.hitPoints)

    handOverFood("iphone")

    //kotlin 直接调用伴生对象
    // Spellbook.MAX_SPELL_COUNT

    //kotlin 异常捕捉@Throws 用法
    try {
        adversary.extendHandInFriendShip()
    } catch (e: Exception) {
        println("Begone, foul beast")
    }
}

fun makeProclamation() = "Greetings,world"

//调用者可以指定英雄左手或者右手拿什么食物，
// 或者使用默认的配置--左手拿浆果，右手拿牛肉

@JvmOverloads
fun handOverFood(leftHand: String = "berries", rightHand: String = "beef") {
    println("Man,you hand over $leftHand and $rightHand")
}

@Throws(IOException::class)
fun acceptApology(){
    throw IOException()
}

//添加一个translator 的函数类型，接收一个字符串
//将其改为小写字母，再大写第一个字母，最后输出
//其实就是定义一个名为translator 的函数,这个函数类型就是(String) -> Unit
val translator:(String) -> Unit = {
    utterance:String ->
    println(utterance.toLowerCase().capitalize())
}