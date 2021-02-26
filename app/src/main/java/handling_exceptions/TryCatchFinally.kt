package handling_exceptions

import java.lang.Exception

/*
    Exercise: Try catch finally
    A customer will tell the program what product they want to buy.

    Then, they will tell the program how many products they require.

    Assume the price of the product is 9.99

    What is the total?

    Handle any exceptions that might occur.

 */

fun main(args: Array<String>) {

    println("Which product do you want to buy: Milk or bread?: ")
    val input = readLine()

    println("How many would you like to buy?")
    val amount = readLine()
    val product = 9.99


    try {
        val result = amount?.toInt()
        println("The total is: ${result?.times(product)}")

    } catch (e: Exception) {
        println("Please introduce a number")
        e.printStackTrace()
    } finally {
        println("The transaction has finished!")
    }
}