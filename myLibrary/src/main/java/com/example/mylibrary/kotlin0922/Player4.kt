package com.example.mylibrary.kotlin0922

class Player4 {
    lateinit var equipment:String
    fun ready(){
        equipment = "sharp knife"
    }

    fun battle(){
        //判断equipment 是否初始化
        if (::equipment.isInitialized)
        println(equipment)
    }
}

