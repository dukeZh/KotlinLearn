package com.example.mylibrary.kotlin1115

//out
interface Production<out T>{
    fun product():T
}

//in
interface Consumer<in T>{
    fun consume(item:T)
}

//不变
interface ProductionConsumer<T>{
    fun product():T
    fun consume(item:T)
}

open class Food

open class FastFood:Food()

class Burger:FastFood()

//生产者
//食品商店
class FoodStore:Production<Food> {
    override fun product(): Food {
        println("Produce food.")
        return Food()
    }
}

//快餐商店
class FastFoodStore:Production<FastFood> {
    override fun product(): FastFood {
        println("Produce FastFood.")
        return FastFood()
    }
}

//汉堡商店
class BurgerStore:Production<Burger> {
    override fun product(): Burger {
        println("Produce Burger.")
        return Burger()
    }
}

