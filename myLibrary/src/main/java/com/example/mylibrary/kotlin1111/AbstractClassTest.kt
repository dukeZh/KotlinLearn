package com.example.mylibrary.kotlin1111

abstract class Gun(val range:Int) {
    abstract fun pullTrigger():String
}

//多重继承
//接口跟抽象类区别
// 抽象类可以有未实现得方法，也可以有现实得方法
// 接口只有未实现得方法得方法
class Ak47(val price:Int):Gun(range = 500){

    override fun pullTrigger(): String {
        TODO("Not yet implemented")
    }
}