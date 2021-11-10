package com.example.mylibrary.kotlin1110

import java.io.File

open class ConfigMap {

    companion object{
        private const val PAth = "xxx"

        fun load() = File(PAth).readBytes()
    }

}
