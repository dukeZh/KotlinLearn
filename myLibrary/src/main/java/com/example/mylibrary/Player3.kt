package com.example.mylibrary

//临时变量 _ 开头
class Player3(
    _name: String,
    var age:Int = 20,
    var isNormal:Boolean
){
    var name = _name
        get() = field.capitalize()
        //加上 private 表示只可以读
        set(value){
            field = value.trim()
        }
    constructor(name:String):this(name,age = 10, isNormal = false)

    constructor(name:String,age: Int):this(name,age = 10, isNormal = false){
        this.name = name.toUpperCase()
    }

    init {
        require(age > 0){ "age must be positive" }
        require(name.isNotBlank()){"player must have a name"}
    }
}




