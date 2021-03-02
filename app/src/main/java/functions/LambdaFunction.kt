package functions

/*
    A lambda is an anonymous function (has no name).
    Are created for a very quick purpose

    A lambda function can have parameters. They are declared at the start of the block
        {name: String -> println("Hello $name")

    The variable can be passed as a parameter to a new function
        Higher order functions
 */

fun main() {

    // A lambda function can be assigned to a variable

    val myLambda = { name: String -> println("Hello $name") }

    // Exercise above:

    val clients = arrayListOf("Dani", "Edi", "Andres")
    val messages = getMessages(clients) {name -> "Hello $name how are you"}
    println(clients)
    println(messages)

    for(i in 0 until clients.size){
        println("Message for ${clients[i]}")
        println(messages[i])
        println()
    }
}

/*
    Exercise: Lambdas and Higher Order Functions

    Create a Higher Order Function that takes a list of client names and a lambda expression that returns a String.

    It then applies the lambda expression to every client name, creates a new collection of the results and returns the result.

    Create a lambda expression that takes a client name String and returns a personalised message.

    Call the HOF and print out the result.

 */

fun getMessages(clients: Collection<String>, getMessage: (String) -> String): ArrayList<String> {
    val messages: ArrayList<String> = arrayListOf<String>()
    for (client in clients){
        messages.add(getMessage(client))
    }
    return messages
}