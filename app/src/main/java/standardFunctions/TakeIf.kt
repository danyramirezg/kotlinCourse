package standardFunctions

/*
    Exercise:
    You have a list of numbers
    Print out the list that contains ony the even numbers
 */

fun main() {
    val numbers = listOf(5, 67, 57, 74, 0, 393, 98, 23)
    println(numbers)
    val newNumbers = arrayListOf<Int>()

    for (num in numbers) {
        num.takeIf { it % 2 == 0 }
                // If is not null, use the let function to add to the new list
                ?.let { newNumbers.add(it) }
    }
    println(newNumbers) // [74, 0, 98]
}