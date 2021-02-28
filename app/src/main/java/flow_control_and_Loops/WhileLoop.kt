package flow_control_and_Loops

fun main() {

    var puzzlePieces = 20
    var piecesPlaced = 0

    while (piecesPlaced < puzzlePieces) {
        piecesPlaced++
        println("Placed piece $piecesPlaced")
    }

    var i = 0
    while (i < 10) {
        i++
        val hello = "Hello $i!"
        println(hello)
    }

    var cats = listOf("Tigger", "Sassy", "Sammy")
    var index = 0
    while (index < cats.size) {
        println("Hello ${cats[index]}")
        index++
    }

    // Function to prints the factorial of a number

    var factorial = 5

    // The variable has to start with 1, otherwise multiply by 0 is 0
    var j = 1
    var result = 1L

    while(j <= factorial){
        result *= j
        j++
    }
    println("The factorial of the number $factorial! is $result")
}