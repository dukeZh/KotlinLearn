package com.example.mylibrary.kotlin1115

//vararg 可变参数
class MagicBox5 <T:Human>(vararg item:T){
    var available =  false
    private var subject: Array<out T> = item

    //返回一个可null 得类型
    fun fetch(index:Int): T? {
        return subject[index].takeIf { available }
    }

    //业务 ，把元素进行修改
    //魔盒里面放得是男孩，取出来得时候，我给他改成一个男人
    //return ->R
    fun <R> fetch(index: Int,subjectModFunction:(T) -> R):R?{
        return subjectModFunction(subject[index]).takeIf { available }
    }
}

class Dog5(val weight:Int)

class Boy5(val name:String, age:Int):Human(age)

class Man5(val name:String, age:Int):Human(age)

open class Human5(val age:Int)

