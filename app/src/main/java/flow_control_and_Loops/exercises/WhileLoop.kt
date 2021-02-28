package flow_control_and_Loops.exercises

/*
    Exercise: While loop
    Ask the user to input a large integer.

    Print out all the numbers that are divisible by 7, that are less than the user’s number.
 */

fun main() {

    println("Please write a large integer")
    val input = readLine() ?: ""
    var longNumber = input.toInt()
    var divisibleBy7 = 0

    while (divisibleBy7 < longNumber) {
        if (divisibleBy7 % 7 == 0)
            println("$divisibleBy7 is divisible by 7")
        divisibleBy7++
    }
}