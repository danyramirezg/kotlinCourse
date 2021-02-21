package functions

import java.util.*

// Function no parameters, no return value

fun hello() {
    println("Hello Dany!")
}

// Function receives 1 parameter, no return value

fun stringWithSpaces(text: String) {
    for (char in text) {
        print("$char ")
    }
    println()
}

// No receive parameters, returns Date

fun getCurrentDate(): Date {
    return Date()
}

// No receive parameters, no return value
fun getDate() {
    var date = Date()
    println(date)
}

// Receives 2 parameter, returns an integer

fun min(a: Int, b: Int): Int {
    if (a <= b) {
        return a
    } else {
        return b
    }
}

/*
 Main function takes one parameter called "args" for arguments and that is
 an array of string (Multiple strings).
 Those strings can be used whenever you run the program from the command line
 */

fun main(args: Array<String>) {
    hello()
    stringWithSpaces("I like Kotlin so much!")
    println(getCurrentDate())
    getDate()
    println(min(15, 17))
}