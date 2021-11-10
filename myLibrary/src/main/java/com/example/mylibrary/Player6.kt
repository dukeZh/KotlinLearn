package com.example.mylibrary

class Player6 {
    val blood = 100
    init {
        val bloodBonus = blood.times(4)
    }
 //   val blood = 100  kotlin从上往下运行，init代码块中blood 没有初始化
}