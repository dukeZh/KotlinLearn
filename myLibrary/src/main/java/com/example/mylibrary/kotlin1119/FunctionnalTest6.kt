package com.example.mylibrary.kotlin1119

//合并函数 -fold
//可以用来合并值的合并类函数是fold，这个合并函数接受一个
//初始累加器值，随后会根据匿名函数的结果更新
fun main() {
    val fold = listOf(1, 2, 3, 4).fold(2) { accmulator, item ->
        println("Accmulator value $accmulator")
        accmulator + item * 3
    }
    println(fold)

    //137
}

