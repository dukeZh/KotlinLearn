package com.example.mylibrary.kotlin0922

class Player0 {
    //可空类型
    var name:String = "jack"
    get() = field.capitalize()
    set(value){
        field = value.trim()
    }
}

