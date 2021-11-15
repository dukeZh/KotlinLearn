package com.example.mylibrary.kotlin1115

class MagicBox4 <T:Human>(item:T){
    var available =  false
    private var subject:T = item

    //返回一个可null 得类型
    fun fetch(): T? {
        return subject.takeIf { available }
    }

    //业务 ，把元素进行修改
    //魔盒里面放得是男孩，取出来得时候，我给他改成一个男人
    //return ->R
    fun <R> fetch(subjectModFunction:(T) -> R):R?{
        return subjectModFunction(subject).takeIf { available }
    }
}

class Dog4(val weight:Int)

class Boy4(val name:String, age:Int):Human(age)

class Man4(val name:String, age:Int):Human(age)

open class Human(val age:Int)

