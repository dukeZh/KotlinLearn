package com.example.mylibrary.kotlin1115

//给字符串添加扩展函数
fun String.addExt(amount:Int = 1) =  this +"!".repeat(amount)

fun String.addExt2() =  "!".repeat(this.count())

//给任何类添加扩展函数
//如果当前为private 只在当前文件有效
fun Any.easyPrint() = println(this)

fun <T> T.easyPrint2():T{
    println(this)
    return this
}

val String.numVowels
get() = count { "aeiou".contains(it) }


fun String?.printWithDefault(default:String) = print(this?:default)

infix fun String?.printWithDefault2(default:String) = print(this?:default)

