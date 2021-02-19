package com.example.dany_hello

// For loop

fun main() {

    for (i in 1..10) {
        println("i")
    }
    var sum = 0
    for (i in 1..10) {
        sum += i
        println(sum)
    }
    println(sum)

    val list = listOf("kotlin", "python", "Java")
    for (element in list) {
        println(element)
    }
    for ((index, value) in list.withIndex()) {
        println("Element at $index is $value")
    }

    println("While loops")

    var x = 9
    while (x >= 0) {
        println(x)
        x--
    }
}


