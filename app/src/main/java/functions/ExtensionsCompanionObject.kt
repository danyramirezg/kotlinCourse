package functions

/*
    Exercise: Companion object extensions
    Add a companion object function to the Double class that prints out the class name.

    Call the companion object extension function.
 */

fun main() {
    Double.getClassName()
}

fun Double.Companion.getClassName() {
    println("The class is a double")
}