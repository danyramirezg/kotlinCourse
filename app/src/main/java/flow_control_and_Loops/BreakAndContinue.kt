package flow_control_and_Loops

/*
    Exercise: Break and continue
    A group of young people are going to a nightclub.

    Design a program that accepts user ages.

    The program displays a welcome message for each user.

    If it receives an age lower than 18, it prints a message that this client is not allowed.

    If it receives the word “stop”, the program ends

 */

fun main() {

    while (true) {
        println("Please enter your age")
        val input = readLine() ?: ""
        if (input == "stop")
            break

        val age = input.toInt()
        if (age <= 18) {
            println("The client is not allowed to enter")
            continue
        }
        println("Welcome to the club")
        }
    }
