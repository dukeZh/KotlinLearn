package com.example.mylibrary.kotlin1115

//vararg 可变参数
class MagicBox6 <T:Human>(vararg item:T){
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

    operator fun get(index: Int):T? =subject[index]?.takeIf { available }
}

class Dog6(val weight:Int)

class Boy6(val name:String, age:Int):Human(age)

class Man6(val name:String, age:Int):Human(age)

open class Human6(val age:Int)

