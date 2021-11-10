package com.example.mylibrary.kotlin1110

data class Coordinate(var x:Int,var y:Int) {
    var isInBounds = x>0 && y>0
}
