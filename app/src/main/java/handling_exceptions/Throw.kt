package handling_exceptions

/*
    Throw is a way to generate my own exceptions.
    - Can be used if you detected a state in your program that you can't recover from

    Example:
    throw illegalStateException("I don't like this input")

 */

fun main(args: Array<String>) {

    println("Please type somethings")
    var state = readLine()
    throw IllegalAccessError("This is an example how throw works")
}