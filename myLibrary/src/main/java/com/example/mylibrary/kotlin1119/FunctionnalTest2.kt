package com.example.mylibrary.kotlin1119

//变换函数 - flatmap
fun main() {
    val result = listOf(listOf(1, 2, 3), listOf(4, 5, 6))
        .flatMap { it }
    println(result)
}