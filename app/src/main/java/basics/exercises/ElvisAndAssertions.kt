package basics.exercises

import kotlin.time.times

/*
    Exercise: Elvis and assertions

    A product costs 29.99.

    Ask a user at the console how many products they want to buy.

    If the read value is null, use the default of one.

    Print the total of the purchase.
 */

fun main() {
    println("This product costs 29.99, how many would you like buying?")

    val product = 29.99
    val input = readLine()
    val purchase = input?.toInt()?:1 // I used 1 as a default value

    println("The total is ${product * purchase }")
}