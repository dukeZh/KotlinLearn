package com.example.mylibrary.kotlin1110

data class Coordinate2(var x:Int, var y:Int) {
    var isInBounds = x>0 && y>0

    operator fun plus(other:Coordinate2) = Coordinate2(x+other.x,y+other.y)
}
