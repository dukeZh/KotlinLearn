package com.example.mylibrary

import kotlin.math.absoluteValue

//临时变量 _ 开头
class Player(
    _name: String,
    _age:Int,
    _isNormal:Boolean
){
    var name = _name
        get() = field.capitalize()
        //加上 private 表示只可以读
        set(value){
            field = value.trim()
        }

    var age = _age
    var isNormal = _isNormal
}




