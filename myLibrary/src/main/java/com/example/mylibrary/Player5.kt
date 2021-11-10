package com.example.mylibrary

class Player5(_name:String) {
    var name = _name

//    val config by lazy {
//        loadConfig()
//    }

    val config = loadConfig()

    private fun loadConfig(): String {
        println("loading")
        return "xxx"
    }
}