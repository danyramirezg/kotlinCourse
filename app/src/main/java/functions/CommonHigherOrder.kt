package functions

/*

    Exercise: Common Higher Order Functions

    Given a collection of random integers.
    If a number is odd, double it.
    If a number is even, half it.

    Print out a subset of the collection that has numbers greater than 25.
 */

fun main() {

    val numbers = listOf(3, 4, 345, 90, 7, 30, 62)
    val subset= numbers.map{
        if (it % 2 == 0)
            it / 2
        else
            it * 2
    }
       .filter { it > 25 }
    println(subset)
}