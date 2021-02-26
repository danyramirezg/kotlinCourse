package collections

import java.nio.file.Files.size

/*
    - list is an ordered collection that can contain duplicate elements
    - The empty list must specify the element type:
        var colors = listOf<String>()

    - The list are immutable, we can't add and remove elements

     - We can access throw the index and get:
        colors[0]

    - Retrieve the size of the list
        colors.size

    - The list can contain null elements
 */

fun main() {

    // The list can contain null elements:
    val colors = listOf("Yellow", "blue", "red", null, null)
    println(colors) // [Yellow, blue, red, null, null]

    // Accessing to the elements, throw the index and get
    println(colors[0])
    println(colors.get(1))

    // Retrieve the size of the list
    println(colors.size)

}