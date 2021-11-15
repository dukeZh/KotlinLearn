package com.example.mylibrary.kotlin1115

//定义泛型
//fun main() {
//    val box1:MagicBox<Boy> = MagicBox(Boy("Jack",20))
//    val box2:MagicBox<Dog> = MagicBox(Dog(20))
//}

//泛型函数
//fun main() {
//    val box1:MagicBox2<Boy2> = MagicBox2(Boy2("Jack",20))
//    val box2:MagicBox2<Dog2> = MagicBox2(Dog2(20))
//    box1.available = true
//    box1.fetch()?.run {
//        println("you find $name")
//    }
//}

//多泛型参数
//fun main() {
//    val box1:MagicBox3<Boy3> = MagicBox3(Boy3("Jack",20))
//    val box2:MagicBox3<Dog3> = MagicBox3(Dog3(20))
//    box1.available = true
//    box1.fetch()?.run {
//        println("you find $name")
//    }
//    val man = box1.fetch {
//        Man(it.name, it.age.plus(15))
//    }
//}

//泛型类型约束
//fun main() {
//    val box1:MagicBox4<Boy4> = MagicBox4(Boy4("Jack",20))
////    val box2:MagicBox4<Man4> = MagicBox4(Man4("Jack",20))
//}

//vararg 关键字和get 函数
//fun main() {
//    val box1:MagicBox5<Boy5> = MagicBox5(
//        Boy5("Jack",20),
//        Boy5("Jacky",16),
//        Boy5("John",26)
//    )
//    box1.available = true
//
//    box1.fetch(1)?.run {
//        println("you find $name")
//    }
//    val man = box1.fetch(2) {
//        Man5(it.name, it.age.plus(15))
//    }
//}

//[]操作符

//fun main() {
//    val box1:MagicBox6<Boy6> = MagicBox6(
//        Boy6("Jack",20),
//        Boy6("Jacky",16),
//        Boy6("John",26)
//    )
//    box1.available = true
//
//    box1.fetch(1)?.run {
//        println("you find $name")
//    }
//    val man = box1.fetch(2) {
//        Man6(it.name, it.age.plus(15))
//    }
//    box1[0]
//}

//out 协变 in 逆变
fun main() {
    //赋值
    val foodStore:Production<Food> = FoodStore()
    //子类泛型对象可以赋值给父类泛型对象，用out
    // GenericTypeTest 查看类型转换规则 因为有out 所以可以用Food
    val fastFoodStore:Production<Food> = FastFoodStore()
    // 114
}