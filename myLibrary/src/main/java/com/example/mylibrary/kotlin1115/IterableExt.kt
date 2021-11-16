package com.example.mylibrary.kotlin1115

fun <T> Iterable<T>.randomTake():T = this.shuffled().first()