package com.example.mylibrary

class Player0 {
    //可空类型
    var name:String = "jack"
    get() = field.capitalize()
    set(value){
        field = value.trim()
    }
}

