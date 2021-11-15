package com.example.mylibrary.kotlin1111

interface Movable2{
    var maxSpeed:Int
    get() = (1..500).shuffled().last()
        set(value) {}
    var wheels:Int

    fun move(movable:Movable):String
}
class Car2 (name:String, override var wheels: Int = 4):Movable2{
    override var maxSpeed: Int
        get() = super.maxSpeed
        set(value) {}

    override fun move(movable: Movable): String {
        TODO("Not yet implemented")
    }

}
