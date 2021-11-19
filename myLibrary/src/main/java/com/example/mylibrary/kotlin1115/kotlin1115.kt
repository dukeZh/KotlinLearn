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

//out 协变 in 逆变 (主要用来提高程序得扩展性)
//参考out和in 图片 理解
//fun main() {
//    //赋值
//    val foodStore:Production<Food> = FoodStore()
//    //子类泛型对象可以赋值给父类泛型对象，用 out
//    // GenericTypeTest 查看类型转换规则 因为有out 所以可以用Food
//    //子类转父类
//    val fastFoodStore:Production<Food> = FastFoodStore()
//    val burgerStore:Production<Food> = BurgerStore()
//
//    //父类泛型对象可以赋值给子类泛型对象，用 in
//    //父类转子类
//    val consumer:Consumer<Burger> = EveryBody()
//    consumer.consume(Burger())
//    val modernPeople:Consumer<Burger> = ModernPeople()
//    modernPeople.consume(Burger())
//    val american:Consumer<Burger> = American()
//    american.consume(Burger())
//}

//reified 关键字
//fun main() {
//    val  box1:MagicBox7<Man7> = MagicBox7()
//    //由 backup 推断出T类型
//    val items = listOf(
//        Boy7("jack", 20),
//        Man7("John", 35)
//    )
//    val subject = box1.randomOrBackup (backup = {
//        Man7("Jimmy", 38)
//    }, items = items)
//    println(subject.toString())
//}

//定义扩展函数
//fun main() {
//    println("1111".addExt(3))
//    println("2222")
//}

//超类上定义扩展函数
//fun main() {
//    "abc".easyPrint()
//    15.easyPrint()
//}

//泛型扩展函数
//fun main() {
//    "abc".easyPrint2().addExt(2).easyPrint2()
//}

//标准函数与泛型扩展函数
//fun main() {
//    val let = "abc".let {
//        50
//    }
//    println(let)
//}

//扩展属性
//fun main() {
//    "The people's Republic of China".numVowels.easyPrint()
//}

//可空类扩展
//fun main() {
//    val nullableString:String? = null
//    val nullableString1 = "efg"
//    nullableString.printWithDefault("abc")
//    nullableString1.printWithDefault("abc")
//}

//infix 关键字
//fun main() {
//    val nullableString: String? = null
//    nullableString printWithDefault2 "abc"
////    "jack".to(16)
////    mapOf("jack" to 19)
//}

//定义扩展文件 (可以把函数写在其他包中通过导入的方式调用)
//重命名扩展
import com.example.mylibrary.kotlin1115.randomTake as randomizer  //randomizer作为别名调用
//fun main() {
//    val list = listOf("json", "jack", "tom")
//    val set = setOf("json", "jack", "tom")
//    list.randomizer()
//}

//apply 函数详解
//Unit 相当于java 中void
import java.io.File

//为什么要传一个扩展函数(泛型，泛型是了支持更多的)，而不是一个普通的匿名函数？
// T.() -> Unit 就是泛型扩展函数 等价于下面
//fun <T> T.easyPrint2():Unit =  println(this)
//扩展函数里自带了接收者对象的this的隐私调用
//为什么是泛型扩展函数？

//匿名函数，也可以是扩展函数
//普通的匿名函数
//() -> Unit
//匿名函数内部this指向一个File 对象，隐私调用
//File.() -> Unit

public inline fun <T> T.applyTest(block: T.() -> Unit): T {
    block()
    return this
}

/*public inline fun File.applyTest(block: File.() -> Unit): File {
    block()
    return this
}*/

//fun main() {
//    //"abcd".addExt2().easyPrint()
//
//    //applyTest 就是模拟apply 函数
//    File("").applyTest {
//        setReadable(true)
//    }
//
//    File("").apply {
//        setReadable(true)
//    }
//    //这里分解一下
//    //1.定义扩展函数
//    fun File.ext(): Unit {
//        setReadable(true)
//    }
//    //2.给block变量赋值
//    val block = File::ext
//    //3.传入apply 函数
//    File("").apply { block }
//}

//DSL
//apply 这种函数编写方式叫做DSL
