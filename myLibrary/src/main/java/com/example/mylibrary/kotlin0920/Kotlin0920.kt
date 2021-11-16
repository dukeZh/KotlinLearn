package com.example.mylibrary.kotlin0920

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

//练习 用; 拼接List集合中得数据
//    val mutableList = mutableListOf("Json", "Jack", "Jacky")
//    var imagesUrls = ""
//    mutableList.forEachIndexed { index, item ->
////        val item2 = item.takeIf { index < mutableList.size - 1 }
////        val let = item2?.let { item.plus(";") }
////        imagesUrls = imagesUrls.plus(let?:item)
//
//        imagesUrls = imagesUrls.plus(item.takeIf { index < mutableList.size - 1 }
//            ?.plus(";") ?: item)
//    }
//    println(imagesUrls)

//    //解构 一次性通过集合给多个元素赋值
//    val list = listOf("Json", "Jack", "Jacky")
//
//    //"_" 表示不需要这个值，省略
//    val (origin,_,proxy) = list

//Set 创建与元素获取（元素不可重复）
//    val set = setOf("Json", "Jack", "Jacky", "Json")
//    println(set.elementAt(2))

//可变set集合
//    val mutableSet = mutableSetOf("Json", "Jack", "Jacky", "Json")
//    mutableSet += "Jimmy"

//集合转换与快捷函数
//    val list = listOf("Json", "Jack", "Jacky","Jack")
//        .toSet()
//        .toList()
//    println(list)

//distinct 去重
//    println(listOf("Json", "Jack", "Jacky","Jack").distinct())

//数组类型  引用类型，可以编译成java基本数据类型
//    val intArray = intArrayOf(10, 30, 40)
//    listOf(10,30,40).toIntArray()
//    val arrayOf = arrayOf(File("xxx"), File("yyy"))

//map 的创建 (元素不可以重复，重复及覆盖)
//    val mapOf = mapOf("Jack" to 20, "Jason" to 18, "Jack" to 30)
//
//    val mapOf1 = mapOf(Pair("Jimmy", 20), Pair("Jack", 20))

//读取map的值
//    val map = mapOf("Jack" to 20, "Jason" to 18, "Jack" to 30)
//    println(map["Jack"])
//    println(map.getValue("Jack"))
//    println(map.getOrElse("Rose"){"Unknown"})
//    println(map.getOrDefault("Rose",0))

//遍历map
//    val map = mapOf("Jack" to 20, "Jason" to 18, "Jack" to 30)
//    map.forEach{
//        println("${it.key},${it.value}")
//    }
//    map.forEach{ (key:String,value:Int) ->
//        println("$key,$value")
//    }

//可变map 集合
    val mutableMapOf = mutableMapOf("Jack" to 20, "Jason" to 18, "Jack" to 30)
    mutableMapOf += "Jimmy" to 30

//等价于map.put()
// mutableMapOf["Jimmy"] = 31

//添加Rose，如果没有就添加
// mutableMapOf.getOrPut("Rose"){ 18 }
    println(mutableMapOf)

}