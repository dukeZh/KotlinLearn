package com.example.mylibrary

import java.lang.Exception
import java.lang.IllegalArgumentException

fun main() {
    //函数引用
//showOnBoard2("牙膏",::getDiscountWords)

//函数类型作为返回类型
//    val getConfigDiscountWords = configDiscountWords()
//    println(getConfigDiscountWords("沐浴露"))


    //kotlin 的可空性
//    //str 加上问号代表可null 类型 ，可以赋值null
//    var str:String? = "butterfly"
//     str = null
//    //安全调用操作符  "?."
//    print(str?.capitalize())  // = null


//    var str:String? = "butterfly"
//    str = ""
//    //使用let安全调用  let的返回结果为最后一行代码
//    str = str?.let {
//        //非空白的字符串
//        if (it.isNotBlank()){
//            it.capitalize()
//        }else{
//            "butterfly"
//        }
//    }
//    println(str)


//使用非空断言操作符  !! 又称为感叹号操作符，当null，抛出空指针异常
//    var str:String? = "butterfly"
//    println(str!!.capitalize()) //如果str null 抛出异常

    //对比使用java中if 判空情况
//    var str:String? = "butterfly"
//    if (str != null){
//        str =  str.capitalize()
//    }else{
//        str = "为空"
//    }
//    print(str)

    //链式调用  省去if 判null
//    var str:String? = "butterfly"
//    str = str?.capitalize()?.plus(" is great")//.plus() 添加
//    print(str)

//    var str:String? = "butterfly"
//    str = null
//    //使用空合并操作符
//    println(str?:"jack")  //三元表达式，str 为空返回jack，不为空返回str


//    var str:String? = "butterfly"
//    str = "rose"
//    //使用空合并操作符
//    println(str?:"jack")


//    var str:String? = "butterfly"
//    str = null
//    str = str?.let { it.capitalize() }?:"butterfly"
//    print(str)


//    var str:String? = "butterfly"
//    str = "jack"
//    str = str?.let { it.capitalize() }?:"butterfly"
//    print(str)


//异常
//    val number :Int?= null
//    try {
//        checkOperation(number)
//        number!!.plus(1)
//    }catch(e:Exception){
//        println(e)
//    }

}

//具名函数
private fun getDiscountWords(goodsName:String, hour:Int):String{
    val currentYear:Int = 2017
    return "$currentYear 年，双十一$goodsName 促销倒计时：$hour 小时"
}
//具名函数
private fun showOnBoard2(goodsName: String, getDiscountWord: (String, Int) -> String) {
    val hour: Int = (1..24).shuffled().last()
    println(getDiscountWord(goodsName, hour))
}

//对比TestClass0914 中接口调用体验java 函数的传递

//闭包  闭包就是lambda lambda 就是闭包  闭包 A 函数包含B 函数，B函数可以引用操作A函数中定义的方法，值
 //{ goodsName: String -> "$currentYear 年，双十一$goodsName 促销倒计时：$hour 小时" } 就是闭包
fun configDiscountWords():(String)->String{
    val currentYear = 2017
    val hour: Int = (1..24).shuffled().last()
    return { goodsName: String -> "$currentYear 年，双十一$goodsName 促销倒计时：$hour 小时" }
}

fun checkOperation(number: Int?) {
    //手动抛出
  //  number?: throw UnSkilledException()

    //先决条件函数
    checkNotNull(number,{
        "something is not good"
    })
}
class UnSkilledException : IllegalArgumentException("操作不当")





