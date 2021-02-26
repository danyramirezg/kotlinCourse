package collections

/*
    - Array list are mutable, I can add and remove elements
    - Tip: If the list contain duplicate elements, the remove function only removes the first element
    - I can add a list and remove a list to an Array list

 */

fun main() {
    var colors: ArrayList<String> = arrayListOf("blue", "red")
    println(colors)

    var noColors = ArrayList<String>()
    println(noColors) // []

    // Adding elements:
    colors.add("yellow")
    println(colors)

    // Adding another collection:
    val moreColors = arrayListOf("pink", "white")
    colors.addAll(moreColors)
    println(colors) // [blue, red, yellow, pink, white]

    // Remove an element and remove at position (index)
    colors.remove("blue")
    println(colors)

    colors.removeAt(1)
    println(colors)

    // Remove all elements of a collection
    colors.removeAll(moreColors)
    println(colors)


}