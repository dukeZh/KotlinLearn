package com.example.mylibrary.kotlin1115

class MagicBox2 <T>(item:T){
    var available =  false
    private var subject:T = item

    //返回一个可null 得类型
    fun fetch(): T? {
        return subject.takeIf { available }
    }
}
class Boy2(val name:String,val age:Int)

class Dog2(val weight:Int)

