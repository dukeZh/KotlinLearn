package com.example.mylibrary


fun main() {
    //定义类与field关键字
    // val player = Player0()
    // println(player.name)

    //对象初始化
    //主构造函数
    // val player1 = Player("", 20, true)
    // player1.name = "Rose"

    //主构造函数参数赋值
    // val player  = Player2("", 20, true)

    //次构造函数
    //   val player  = Player2("")

    //   val player  = Player2("jack",20)
    //   println(player.name)

    //默认参数
    // val player3 = Player3(_name = "Jack", isNormal = false)

    //初始化块  可以设置变量或值，
    // 执行有效性检查，如检查给某构造函数得值是否有效
    //会在构造类实列时执行
    // Player3(isNormal = false,_name = "")

    // Player3(isNormal = false,_name = "Jack")

    //初始化顺序
    //主构造函数里声明的属性
    //类级别的属性赋值
    //init 初始化块里的属性赋值和函数调用
    //次构造函数里的属性赋值和函数调用
    //Student()


}