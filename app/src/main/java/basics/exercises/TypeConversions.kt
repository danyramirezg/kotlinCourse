package basics.exercises

/*
Exercise: Type conversions
Ask the user to input a number of type double.

Multiply it by pi

var pi = 4.14159

Print the type of the resulting variable.

Print the result.

 */

fun main() {

    println("Please, enter a number of type double: ")
    val double = readLine()?:""
    val convert = double.toDouble()
    val pi = 3.14159
    val doubleByPy = (convert * pi)
    println("The type is: ${doubleByPy::class.java}")
    println("The result is: $doubleByPy")
}