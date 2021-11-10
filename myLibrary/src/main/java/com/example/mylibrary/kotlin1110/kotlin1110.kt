package com.example.mylibrary.kotlin1110

//继承
//类默认都是封闭的，加上open 才可以被继承
//fun main() {
//    val p: Product = LuxuryProduct()
//    println(p.load())
//
//    println(p is Product)
//    println(p is LuxuryProduct)
//    println(p is File)
//
////    if (p is LuxuryProduct) {
////        //as 类型转换
////        println((p as LuxuryProduct).special())
////    }
//    println((p as LuxuryProduct).special())
//    // p 在之前已经转换类型，无需再转，可直接用
//    println(p.special())
//
//    println(p is Any)
//    println(p.toString())
//}

// object 只能产生一个单例对象
//fun main() {
//    //既是类名，实例名  （单例）
//    ApplicationConfig.doSomething()
//    println(ApplicationConfig)
//    println(ApplicationConfig)
//}

//对象表达式
//fun main() {
//    val p = object :Player(){
//        override fun load() = "anonymous nothing..."
//    }
//    println(p.load())
//}

//伴生对象
//fun main() {
//    //ConfigMap 调用load()方法  ConfigMap 就成单例
//    ConfigMap.load()
//}

//嵌套类
//fun main() {
//    Player2.Rquipment("sharp knife").show()
//}

//数据类
//fun main() {
//    println(Coordinate(10,20))
//    // == 比较的是内容 equals，Any 默认实现===，比较引用
//    // === 比较的是引用
//
//    //当Coordinate 为class 的时候 表示两个对象 false
//    //当Coordinate 为data class 的时候 Coordinate重写equals，hashmap 表示两个值 返回ture
//    println(Coordinate(10,20) == Coordinate(10,20))
//
//    //数据类自带解构语法
//    val (x,y) = Coordinate(10,20)
//    println("$x,$y")
//}

//copy
//fun main() {
//    val s = Student("Jack")
//    val copy = s.copy("Rose")
//    println(s)
//    println(copy)
//}

//解构声明
//fun main() {
//    val (x,y) = PlayerScore(10, 20)
//    println("$x,$y")
//}

//运算符重载
//fun main() {
//    //+  plus
//    //+= plusAssign
//    //== equals
//    //> compareTo
//    //[] get
//    //in contains
//    val c1 = Coordinate2(10, 20)
//    val c2 = Coordinate2(10, 20)
//    println(c1 + c2)
//}

//枚举类
//fun main() {
//    println(Direction.EAST)
//    println(Direction.EAST is Direction)
//}

//枚举类定义函数
//fun main() {
//    println(Direction2.EAST.updateCoordinate(Coordinate(10,20)))
//}

//代数数据类型
//可以用来表示一组子类型的闭集，枚举类就是一种简单的ADT
//fun main() {
//    println(Driver(LicenseStatus.QUALIFIED).checkLicenseStatus())
//}

//密封类
fun main() {
//    val status = LicenseStatus2.Learning
//    val driver = Driver2(status)
//    println(driver.checkLicenseStatus())

    val status = LicenseStatus2.Qualified("12345")
    val driver = Driver2(status)
    println(driver.checkLicenseStatus())
}



