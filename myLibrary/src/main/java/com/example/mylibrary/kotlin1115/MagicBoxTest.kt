package com.example.mylibrary.kotlin1115

class MagicBox <T>(item:T){
    private var subject:T = item
}
//A、T 一样，T 约定熟成
//class MagicBox <A>(item:A){
//    private var subject:A = item
//}


class Boy(val name:String,val age:Int)

class Dog(val weight:Int)

