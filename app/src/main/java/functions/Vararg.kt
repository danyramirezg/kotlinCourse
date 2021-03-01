package functions

/*
    Exercise: Vararg
    Create a function that takes an integer variable “count” and a variable number of client names. Print out “count” hello messages for each client.

    i.e. if count = 3, print out 3 hello messages for each client.
 */

fun main(args: Array<String>) {
    hello(5, "Dany", "Mary", "Cami")

}

fun hello(count: Int, vararg clientNames: String) {
    for (name in clientNames) {
        for (i in 1..count) {
            print("Hello $name - ")
        }
        println()
    }
}