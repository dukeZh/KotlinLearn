package com.example.mylibrary.kotlin1115

class MagicBox3 <T>(item:T){
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
class Boy3(val name:String,val age:Int)

class Dog3(val weight:Int)

class Man(val name:String,val age:Int)

