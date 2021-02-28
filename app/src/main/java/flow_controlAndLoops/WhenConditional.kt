package flow_controlAndLoops

/*

    Exercise: When conditional

    Ask the user to input their name.
    Based on the first letter of their name, print out a personalised greeting
    for the first 3 letters of the alphabet,
    a different one for the next 3 letters,
    and a third message for the rest
 */

fun main() {

    println("Please write your name: ")
    val name = readLine()?:""

    when(name[0].toUpperCase()) {
        'A', 'B', 'C' -> println("Welcome A, B o C")
        in 'D'..'F' -> println("Welcome D, E o F")
        else -> println("Welcome everyone")
    }

    println("==================== Another examples:")

        var age = 28

        when (age) {
            0 -> println("It's a baby")

            4 -> {
                println("She's 4 years")
                println("It's a child")
            }
            20 -> println("It's an adult")
            else -> {
                println("This else is used when any condition doesn't apply")
                println("You open curly-braces when you're going to use more statements inside")
            }
        }

        println("That was an example how the when conditionals works")


        val x = 11
        when (x) {
            6 -> println("x is 6")
            3 * 5 -> println("x is 3*5")
            "Hello Dany".length -> println("x is the length of the string 'Hello Dany' ")
            in 1..10 -> println("x is between 1 and 10")
            in 11..20 -> println()
            !in 1..9 -> println("x is not between 1 to 9")
        }
        println("Another examples working with when conditional")
    }




