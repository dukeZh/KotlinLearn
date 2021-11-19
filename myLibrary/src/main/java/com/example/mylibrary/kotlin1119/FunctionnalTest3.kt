package com.example.mylibrary.kotlin1119

//过滤函数 - filter
fun main() {
    val result = listOf("Jack", "Jimmy", "Rose", "Tom")
        .filter { it.contains("J") }
    println(result)

    val item = listOf(
        listOf("red apple", "green apple", "blue apple"),
        listOf("red fish", "blue fish"),
        listOf("yellow banana", "teal banana")
    )

    val redItems = item.flatMap {
            it -> it.filter { it.contains("red") } }
    println(redItems)
}