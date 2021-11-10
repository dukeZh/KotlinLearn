package com.example.mylibrary.kotlin1110

open class Product(val name:String) {
    fun description() = "Product: $name"

   open  fun load() = "Nothing..."
}

class LuxuryProduct : Product("Luxury"){
    override fun load(): String = "LuxuryProduct loading..."

    fun special() = "LuxuryProduct special function"
}
