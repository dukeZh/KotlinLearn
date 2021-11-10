package com.example.mylibrary.kotlin1110

class PlayerScore(var experience:Int,var level: Int) {
    operator fun component1() = experience
    operator fun component2() = level

}
