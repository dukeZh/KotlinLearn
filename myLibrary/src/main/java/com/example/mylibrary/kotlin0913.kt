package com.example.mylibrary


//1->33 0913 学习记录



const val MAX = 200
fun main(args: Array<String>) {

    //定义常量
//    val age:Int = 5
//    println(age)


    //range 表达式
//    val age = 4
//    if (age in 0..3){
//        print("1")
//    }else if (age in 3..7){
//        print("2")
//    }else{
//        print("3")
//    }


    //when 表达式
//    val school = "小学1"
//    val level: Any = when(school){
//        "小学" -> "幼儿"
//        "小学2" -> "幼儿2"
//        else -> {
//            println("未知")
//        }
//    }
//    print(level)


    //String 模板
//    val name ="startCat"
//    val age = 26
//    println("my name is $name,my age is $age")
//
//    val flag = true
//    println("answer is ${if (flag) "true" else "false"}")


    //函数头和参数
//    println(getName("111",true))
//    println(getName("1111"))
//    println(getName())
//    println(getName(tag =false ,name = ""))


    //Nothing 类型
    //    TODO("NOTHING")


    //Unit函数  没有返回值的函数返回类型就是Unit
    //    println("nothing")



    //引用java 中is 方法
    //TestClass0913.`is`()
    //反引号中的函数名
    //`--***mmmmmm11 ane`()


    //匿名函数
//    val total ="Mississippi".count()
//    val totals = "Mississippi".count({
//            letter-> letter == 's'
//    })
//    println(total)
//    println(totals)


    //变量的类型是个匿名函数
//    val blessingFunction:()->String
//    blessingFunction = {
//        val holiday = "New Year."
//        "Happy $holiday"
//    }
//    println(blessingFunction())


    //无参传入，返回String
//    val blessingFunction:()->String = {
//        val holiday = "New Year."
//        "Happy $holiday"
//    }
//    println(blessingFunction())


    //传入String，返回String
//    val blessingFunction:(String) ->String = {
//        name-> val holiday = "New Year."
//        "$name,Happy $holiday"
//    }
//    println(blessingFunction("jack"))


    //it 关键字
//        val blessingFunction:(String) ->String = {
//         val holiday = "New Year."
//        "$it,Happy $holiday"
//    }
//    println(blessingFunction("jack"))


    //类型推断
//        val blessingFunction = {
//        val holiday = "New Year."
//        "Happy $holiday"
//    }
//    println(blessingFunction())

//    val blessingFunction: (String, Int) -> String ={
//        name,year ->
//        val holiday = "New Year."
//        "$name,Happy $holiday $year"
//    }
//    println(blessingFunction("Jack",2027))

//    val blessingFunction = {name:String,year:Int ->
//        val holiday = "New Year."
//        "$name,Happy $holiday $year"
//    }
//    println(blessingFunction("Jack",2027))



    //lambda 我们将匿名函数称为lambda，将它的定义称为lambda 表达式
//返回数据称为lambda 结果
    //定义参数是函数的函数
//       val getDiscountWords = {
//       goodName:String,hour:Int->
//       val currentYear = 2017
//       "$currentYear 年，双十一$goodName 促销倒计时：$hour 小时"
//   }
//    showOnBoard("卫生纸",getDiscountWords)



    //简略写法
//函数内联 定义的lambda 已对象形式存在，jvm 分配内存，产生内存开销
//    val total = "Mississippi".count()
//    val totals = "Mississippi".count {
//        it == 's'
//    }


//   val getDiscountWords = {
//       goodName:String,hour:Int->
//       val currentYear = 2017
//       "$currentYear 年，双十一$goodName 促销倒计时：$hour 小时"
//   }
//    showOnBoard("卫生纸",getDiscountWords)


//    showOnBoard("卫生纸",{ goodName:String,hour:Int->
//        val currentYear = 2017
//        "$currentYear 年，双十一$goodName 促销倒计时：$hour 小时"
//    })

//    showOnBoard("卫生纸") { goodName: String, hour: Int ->
//        val currentYear = 2017
//        "$currentYear 年，双十一$goodName 促销倒计时：$hour 小时"
//    }
    
}

fun getName(name:String ="1111", tag:Boolean = false):String{
    return if (tag){
       "startCat+$tag"
    }else{
        "other+$tag"
    }
}

fun `--***mmmmmm11 ane`() {
    print("11111")
}


//具名函数 （完成写法，不进行简写）
fun showOnBoard(goodsName:String,getDiscountWord:(String,Int)->String){
    val hour: Int = (1..24).shuffled().last()
    println(getDiscountWord(goodsName,hour))
}



////inline 转成java 变成一步一步执行
inline fun  showOnBoard3(goodsName: String, getDiscountWord: (String, Int) -> String) {
    val hour: Int = (1..24).shuffled().last()
    println(getDiscountWord(goodsName, hour))
}










