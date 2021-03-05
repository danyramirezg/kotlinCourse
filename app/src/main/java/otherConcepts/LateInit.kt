package otherConcepts

/*
    lateinit:

    Allows us to create non null, non initialized variables
    Need to initialize the variable before using it
    Accessing it before initializing it throws an exception
    Can be used only on var variables
    Use .isInitialized to check initialization


    Exercise: lateinit
    Define a variable message as a String. Then define a list of prime numbers.

    A function takes the list of integers and randomly returns one of them. Use it to initialize
    the message variable with a message including the returned prime number.

    Print out the message. *

    * This exercise can easily be solved in a way that doesn’t use lateinit var.
    For the sake of practice, please use it in this case.

 */

fun main() {
    lateinit var message: String
    val primeNumbers = listOf<Int>(2, 3, 5, 7, 11)
    message = "The random prime number is ${getPrimeNum(primeNumbers)}"
    println(message)
}

fun getPrimeNum(prime: List<Int>): Int {
    return prime.random()
}
