package flow_control

/*
    Shorthand if statement:

    Curly brackets can be omitted if there is only one expression
    An if statement can return a result
 */

fun main() {

    var number = 40

    val isEven = if (number % 2 == 0) "Number is even" else "Number is odd"

    println(isEven)

    /*
    Exercise:
        Read an integer from the console
        if it has a single digit, print out a message
        Otherwise, print out a different message
        Use the shorthand if statement
     */

    println("Please, write a single digit: ")
    val numb = readLine() ?: ""
    var input = numb.toInt()
    println(input::class.java)

    val result = if (input in 0..9) "This is the number $input" else "The number has to be a single digit"

    println(result)
}