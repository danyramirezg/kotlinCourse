package functions

import kotlin.math.E

/*

Extension functions:

    Can add functions to classes that we don't own or cannot modify
    Can access the object using the 'this' reference

Exercise:
    Add an extension function to the ArrayList class that returns a message saying how many
    elements the list contains.

    Create an ArrayList and print out the extension function message.
 */

fun main() {
    var list = arrayListOf("Caro", "Dani", "Dan")
    println(list.getElements())
}

fun ArrayList<String>.getElements() = "The list contains $size elements"

// Output: The list contains 3 elements
