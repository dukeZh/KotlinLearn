package com.example.mylibrary

class Player7 {
    val name:String
    fun firstLetter() = name[0]

    init {
        name = "jack"
        println(firstLetter())
     //   name = "jack"
    }
}
