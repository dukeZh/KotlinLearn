package com.example.mylibrary

import java.io.File
import kotlin.math.roundToInt

//44->  0919 学习记录

const val NAME ="Jimmy's friend"
const val NAMES= "jack,jacky,jason"
fun main() {
    //字符串的操作
//    val index = NAME.indexOf('\'')
//   // var str = NAME.substring(0,index)
//    var str = NAME.substring(0 until index)
//    print(str)

    //split 返回集合
//   val data = NAMES.split(",")
//    //data[0]
//
//    val (origin,dest,proxy) = NAMES.split(",")
//    println("$origin $dest $proxy")

    //replace
//    val str1 = "The people's Republic of China"
//    val str2 = str1.replace(Regex("[aeiou]")){
//        println(it.value)
//        when(it.value){
//            "a"->"8"
//            "e"->"6"
//            "i"->"9"
//            "o"->"1"
//            "u"->"3"
//            else -> it.value
//        }
//    }
//    println(str1)
//    println(str2)


    //== 与 ===
    //== 对象引用  === 地址引用
//    val str1 ="Json"
//    val str2 ="Json"
//  //此时jvm 中只有一个json ,所以str1跟str2 指向同一个地方
//    println(str1 == str2)
//    println(str1 === str2)


//    val str1 ="Json"
//    //capitalize() 变成Json 需要开辟地方存放，此时地址就不同
//    val str2 ="json".capitalize()
//    println(str1 == str2)
//    println(str1 === str2)

    //字符串遍历
//    "The people's Republic of China".forEach {
//        print("$it *")
//    }

    //安全转换函数
    //val number = "8.98".toInt()  //抛出异常
//    val number = "8.98".toIntOrNull()
//    println(number)
//    println(8.96.toInt()) //只要整数
//    println(8.96.roundToInt()) //四舍五入
//    println("%.2f".format(8.9622234)) //取小数点两位

    //标准库函数
    //apply  配置函数
//    val file1 = File("E:\\text.txt")
//    file1.setReadable(true)
//    file1.setWritable(true)
//    file1.setExecutable(false)
//
//    val file2 = File("E:\\text.txt").apply {
//        //this 就是File 对象->file2 隐式调用
//        this.setReadable(true)
//        setWritable(true)
//        setExecutable(false)
//    }

    //let 函数 使某个变量作用于其lambda 表达式，让it 关键字引用它
    //let 与 apply 比较，let会把接收者传给lambda，apply什么都不传，
    // 执行完成apply 返回当前接受者，let会返回lambda的最后一行
//   val  result = listOf(3,2,1).first().let {
//        it*it
//    }
//    println(result)

//    val firstNumber = listOf(3,2,1).first()
//    val result2 = firstNumber*firstNumber
//    println(result2)

//    println(formatGreeting(null))
//    println(formatGreeting("jack"))
//
//    println(formatGreeting2(null))
//    println(formatGreeting2("jack"))

    //run 函数 支持链式调用
    // 跟apply 差不多，但不同的是接收者，run返回的是lambda结果，也就是true或者false
    // run 用来执行函数的引用
//    var file = File("E:\\text.txt")
//    val result = file.run {
//        readText().contains("great") //最后一行时，输出Boolean
//        "xxxx"//最后一行时，输出string
//    }
//    println(result)



//    val  result = "The people's Republic of China".run(::isLong)
//    println(result)
//
//    "The people's Republic of China"
//        .run(::isLong)
//        .run(::showMessage)
//        .run(::println)


    //with 是run的变体，功能行为一样，但with 的调用方式不同，调用with时
    //需要值参作为其中第一个参数传入
//    val result1 = "The people's Republic of China".run {
//        length>10
//    }
//    println(result1)
//
//    val result2 = with("The people's Republic of China"){
//        length>10
//    }
//    println(result2)

    //also 和let函数功能相似，和let 一样，also也是把接收者作为参传给lambda
    //但有一点不同，also返回接收者对象，而let返回lambda结果，因为这个差异
    //also尤其合适针对同一原始对象，利用副作用做事，既然also返回的是接收者对象，
    // 你就可以基于原始接收者对象执行额外的链式调用
//    var  fileContents:List<String>
//    val file = File("E:\\text.txt").also {
//        println(it.name)
//    }.also {
//        fileContents = it.readLines()
//    }
//    println(fileContents)


    //takeIf
    //takeIf 函数需要判断lambda 中提供的条件表达式，给出true或false结果
    //如果判断结果是true ，从takeIf函数返回接收者对象
    //如果是false ，返回null
    //如果需要判断某个条件是否满足，再决定是否可以赋值变量或执行某项任务
    //takeIf 非常好用，概念上讲，takeIf函数类似于if语句，但它的优势是可以直接在对象实列上调用
    //避免了临时变量赋值的麻烦
//    val result = File("E:\\text.txt")
//        //it.exists() && it.canRead() == true 返回file ，false 返回null
//        .takeIf { it.exists() && it.canRead() }
//        ?.readText()
//    println(result)

    //takeUnless 辅助函数，只有判断你给定的条件结果是false,
    //takeUnless才会返回原始接收对象
//    val result = File("E:\\text.txt")
//        //it.exists() && it.canRead() == true 返回file ，false 返回null
//        .takeUnless { it.isHidden }
//        ?.readText()
//    println(result)



}

fun showMessage(isLong: Boolean): String {
    return if (isLong){
        "Name is too long"
    }else{
        "please rename"
    }
}

fun isLong(name:String) = name.length >= 10


fun formatGreeting(guestName: String?):String{
    return  guestName?.let {
        "welcome,$it"
    }?:"what's your name?"
}
fun formatGreeting2(guestName: String?):String{
    return  if (guestName != null){
        "welcome,$guestName"
    }else{
        "what's your name?"
    }
}