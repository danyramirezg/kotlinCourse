package flow_control

fun main() {
    for (i in 1..5) {
        for (j in 1..5) {
            print("$i,$j \t")
        }
        println("\n")
    }

    println("Another matrix with the Diagonal word")

    val matrixSize = 6
    for (i in 0..matrixSize) {
        for (j in 0..matrixSize) {
            if (i == j) {
                print("Diagonal\t")
            } else {
                print("$i, $j  \t\t")
            }
        }
        println()
    }

    // print a triangle with happy faces:
    println("\nprinting a triangle with happy faces:")

    for (i in 1..10) {
        for (j in 1..i) {
            print(":D")
        }
        println()
    }

/*

    Exercise: Extended for loops
    Ask the user for a number.

    Print out a square matrix of the size indicated by the number.

    Inside each cell, print out 1 emoji

    :) If the row*column is divisible by 3
    🤨:D If the row*column % 3 is 1
    ;) If the row*column % 3 is 2

 */

    println("Please enter a matrix size: ")
    val input = readLine() ?: "0"
    var number = input.toInt()

    for (i in 1..number) {
        for (j in 1..number) {
            when (i * j % 3) {
                0 -> print(":)\t")
                1 -> print(":D\t")
                2 -> print(";)\t")
            }
        }
        println()
    }
}