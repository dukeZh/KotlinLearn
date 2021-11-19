package com.example.mylibrary.kotlin1119

//合并函数 -zip
//合并两个集合，返回一个包含键值对的新集合
fun main() {
    val employees = listOf("Jack","Jason","Tommy")
    val ages = listOf(18,20)
    val employeeAges = employees.zip(ages) // 返回集合
    println(employeeAges)
    println(employeeAges[0])
    val employeeAgesMap = employees.zip(ages).toMap() // 返回map
    println(employeeAgesMap)
    println(employeeAgesMap["Jack"])

    //对照FunctionnalTest.java 理解为啥要用函数式编程
    val list = employeeAgesMap.map { "${it.key},age:${it.value}" }
    println(list)
}