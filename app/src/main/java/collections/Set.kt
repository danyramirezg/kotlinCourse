package collections

/*
    - Set: Stores unique elements, the order is undefined

    - Are immutable. I can't add or remove elements

    - If we create an empty set, we must specify the type

    - A set can contain ONLY one null element

 */

fun main(args: Array<String>) {
    val numbers = setOf(5, 64, 7)

    // Empty set, must specify the type
    val numbers2 = setOf<Int>()
}