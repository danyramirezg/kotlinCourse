package basics

fun main(args: Array<String>) {

    var cats = 5
    cats++
    println("I have $cats cats")

    // If I want to increment from the function I have to put ++ in the beginning of the variable
    var dogs = 2
    println("I have ${++dogs} dogs")

    /*
    OPERATORS - RESULT TYPE:

    The type of the result of an operation is the same as the type of the largest operand
	in terms of size in memory:

    **** Byte < Short < Int < Long < Float < Double

     */

    val numb1: Long = 8900077997
    val numb2: Float = 34.7F

    val result = numb1/numb2
    println("The largest operand is the type ${result::class.java}")
    //       The largest operand is the type float

}