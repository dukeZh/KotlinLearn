package com.example.mylibrary

import android.os.Build

//59->  0920 学习记录
fun main() {
    //list 创建与元素获取
    //getOrElse getOrNull
//    val list = listOf("Json", "Jack", "Jacky")
//    //println(list[3])
//    println(list.getOrElse(3){ "Unknown" })
//    println(list.getOrNull(3)?:"null")

    //可变列表
    //内容修改的列表叫可变列表，使用mutableListOf函数
    //list 支持使用toList 和toMutableList 函数动态实现只读列表和可变列表的相护转换
//        val mutableList = mutableListOf("Json", "Jack", "Jacky")
//        mutableList.add("Jimmy")
//        println(mutableList)
//        mutableList.remove("Json")
//        println(mutableList)

//    //不可变->可变
//    listOf("Json", "Jack", "Jacky").toMutableList()
//    //可变->不可变
//    mutableListOf("Json", "Jack", "Jacky").toList()

    //mutator 函数
//    val mutableList = mutableListOf("Json", "Jack", "Jacky")
//    mutableList += "Jimmy"
//    println(mutableList)
//    mutableList -= "Json"
//    println(mutableList)


//    val mutableList = mutableListOf("Json", "Jack", "Jacky")
//    mutableList.removeIf{
//        it.contains("Jack")
//    }
//    println(mutableList)

    //集合遍历
//    val mutableList = mutableListOf("Json", "Jack", "Jacky")
//    for (a in mutableList){
//        println(a)
//    }
//
//    mutableList.forEach {
//        println(it)
//    }
//
//    mutableList.forEachIndexed{
//        index, item ->
//        println("$index,$item")
//    }

    //练习 用; 拼接集合中得数据
    val mutableList = mutableListOf("Json", "Jack", "Jacky")
    var imagesUrls = ""
    mutableList.forEachIndexed { index, item ->
//        val item2 = item.takeIf { index < mutableList.size - 1 }
//        val let = item2?.let { item.plus(";") }
//        imagesUrls = imagesUrls.plus(let?:item)

        imagesUrls = imagesUrls.plus(item.takeIf { index < mutableList.size - 1 }
            ?.plus(";") ?: item)
    }
    println(imagesUrls)


}