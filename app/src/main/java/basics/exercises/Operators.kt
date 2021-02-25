package basics.exercises

import android.widget.ArrayAdapter

/*
    Exercise: Operators
    Read from the console the amount the user has in their bank account.

    The interest on that account is 5.5% per year.

    How much would that user have in 5 years?

 */

fun main(args: Array<String>) {

    println("Please enter the amount in your bank account")
    val account = readLine() ?: ""
    val amount = account.toDouble()
    val result = amount * 1.055 * 1.055 * 1.055 * 1.055 * 1.055

    println("You will have $result in 5 years")
}