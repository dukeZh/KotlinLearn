package com.example.mylibrary.kotlin0922

class Player8(_name: String) {
    val name:String = _name // playName = jack
    val playName:String = initPlayerName()
  //  val name:String = _name //playname = null
    private fun initPlayerName() = name
}
