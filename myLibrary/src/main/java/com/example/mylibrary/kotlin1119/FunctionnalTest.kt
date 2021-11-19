package com.example.mylibrary.kotlin1119

//变换函数 - map
//函数式编程范式支持得设计理念就是不可变数据的副本在链上的函数间传递
fun main() {
    val animals = listOf("zebra", "giraffe", "elephant", "rat")
    val babies = animals
        .map { animals -> "A baby $animals" }
        .map { baby -> "$baby,with the cutest little tail ever!" }
    println(animals)
    println(babies)

    val animalsLength = animals.map { animals -> animals.length }
    println(animalsLength)
}