package com.example.mylibrary.kotlin1119

//给Int 类型添加isPrime方法判断int 是否是素数
fun Int.isPrime():Boolean{
    if (this == 1){
        return true
    }
    if (this == 2){
        return false
    }
    (2 until this).map {
        if (this % it == 0){
            return false
        }
    }
    return true
}
//序列 generateSequence
// 使用序列差找素数
fun main() {
    //你想产生头1000个素数
    //假定0-5000 有1000个素数
    val toList = (1..5000).toList()
        .filter { it.isPrime() } //满足条件放进集合
        .take(1000)
    println(toList)
    println(toList.size)

    // generateSequence(2)  代表从2开始
    val oneThousandPrimes = generateSequence(2) { value -> value + 1 }
        .filter { it.isPrime() }
        .take(1000)
    println(oneThousandPrimes.toList().size)
}

