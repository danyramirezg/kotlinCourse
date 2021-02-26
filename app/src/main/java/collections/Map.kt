package collections

/*
    A map is NOT a collection!!

    A map is a set of key-value pairs.
    - Keys are unique, values can be duplicates

    A map is similar to a dictionary

    If create an empty map, you must specify the key and value types

 */

fun main() {

    // If create an empty map, you must specify the key and value types
    val noCount = mapOf<Int, String>()
    println(noCount) // {}

    val count = mapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    println(count) // {1=one, 2=two, 3=three

    // To access to the value, through the key:
    println(count[2]) // two

    // To get the keys:
    println("Getting keys: ${count.keys}") // [one, two, three]

    // To get the values:
    println("Getting values: ${count.values}") // [one, two, three]

}