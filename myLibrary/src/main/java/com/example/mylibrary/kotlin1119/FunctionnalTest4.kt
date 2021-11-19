package com.example.mylibrary.kotlin1119

//组合使用filter 和 map 找素数
fun main() {
    //取模等于0 说明可以整除，如果没有等于0，说明素数
    val primes = listOf(7, 4, 8, 4, 3, 22, 18, 11).filter { number ->
        (2 until number).map {
            number % it
        }.none {
            it == 0
        }
    }
    println(primes)
}