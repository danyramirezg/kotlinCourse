package flow_control_and_Loops.exercises

/*
    Exercise: Do while loop
    You have a set of usernames

    val usernames = hashSetOf(“john”, “bob”, “alice”)

    Ask the user to choose their username. If their username is taken, print out a message and ask again.

    Add the username to the set.

 */

fun main(args: Array<String>) {

    val usernames = hashSetOf("john", "bob", "alice")
    var finished = false

    do {
        println("Please choose an username: ")
        val input = readLine() ?: ""
        if (usernames.contains(input)) {
            println("$input is taken. Please choose another username")
        } else {
            println("The $input is you username")
            finished = true
            usernames.add(input)
        }
    } while (!finished)
    println(usernames)
}


