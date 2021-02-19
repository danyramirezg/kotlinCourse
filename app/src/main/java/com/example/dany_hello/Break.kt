package com.example.dany_hello

fun main() {

    // Break function

    for (p in "python") {
        if (p == 'o') {
            break
        }
        println(p)
    }

    // Continue function

    val list = listOf("Java", "Python", "kotlin")
    for (str in list) {
        if (!str.contains('n')) {
            continue
        }
        println(str)
    }

    // Naming loops

    outer@ for (i in 1..10){
        for (j in 1..10){
            if (i - j == 5){
                break@outer
            }
            println("$i - $j")
        }
    }
}