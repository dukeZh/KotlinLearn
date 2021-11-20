package com.example.mylibrary.kotlin1120

class Spellbook {

    @JvmField
    val spells = listOf("Magic Ms.L", "Lay on Hans")

    //伴生对象
    companion object {
         // @JvmField
        val MAX_SPELL_COUNT = 10

         // @JvmStatic
        fun getSpellBookGreeting() = println("I am the Great Grimoire!")
    }
}