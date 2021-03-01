package flow_control_and_Loops

fun main() {

    /*
    Ask the user to input a number multiple times, until they input
    a number larger than 100

    */
    var finished = true

    do {
        println("Please write a number")
        val input = readLine() ?: ""
        var number = input.toInt()
        if (number > 100) {
            println("Thanks")
            finished = false
        } else {
            println("The number $number is not greater than 100")
        }

    } while (finished)

    /*
    Ask the user to input a number.
    If the factorial of that number is less than 3.000.000, ask them to
    input another number and repeat the process
    */

    var isDone = false

    do {
        println("Please write a number")
        val input = readLine() ?: ""
        var num = input.toInt()

        var factorial = 1
        var result = 1

        while (result <= num) {
            factorial *= result
            result++

        }
        if (factorial < 3000000) {
            println("$num! = $factorial is smaller than 3.000.000. Try it again")
        } else {
            println("$num! = $factorial")
            isDone = true
        }
    } while (!isDone)

}
