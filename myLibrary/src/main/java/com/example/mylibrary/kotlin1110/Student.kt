package com.example.mylibrary.kotlin1110

data class Student(var _name: String, val age: Int) {
    private val hobby = "music"
    val subject: String
   // var score = 0

    init {
        println("initializing student..")
        subject = "math"
    }

    constructor(_name: String) : this(_name, 10){
       // score = 10
    }

    override fun toString(): String {
        return "Student(_name='$_name', age=$age, hobby='$hobby', subject='$subject')"
    }


}
