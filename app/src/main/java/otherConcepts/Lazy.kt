package otherConcepts

/*
    lazy:
    Lazy variables are variables that are initialized whe needed
    Useful to save memory in case the variable is never accessed

Exercise: lazy
    An object of a class NewUser is created for each new user. It contains a function to
    print a welcome message.

    In your program, you have a list of banned usernames.

    Ask the user to input their desired username. If it is not part of the list, create the
    NewUser object and print the welcome message.

 */

fun main() {

    val newUser by lazy { NewUser() }
    val bannedNames = listOf<String>("Dan", "Darago", "Natasha", "")
    println("Input your desired username")
    val input = readLine()?:""
    if(!bannedNames.contains(input.capitalize())){
        newUser.welcomeMessage()
    }
}

class NewUser{
    fun welcomeMessage(){
        println("Hello and welcome!")
    }
}