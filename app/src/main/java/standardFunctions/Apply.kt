package standardFunctions

/*
    Apply:
    Can be used to apply some functionality and return a result.
    Returns the initial object
    Common use case is applying configuration to an object creation

 */

fun main() {

    /*
    Exercise: Apply
    A coffee shop serves cups of coffee. A cup of coffee has a client name and a method for preparing
    the coffee.

    Read a client name from the console, then call the sellCoffee method of the coffee shop. Create
    a coffee cup object, initialise it and serve it to the client.

     */

    println("Please write your name:")
    val input = readLine() ?: ""
    CoffeeShop().sellCoffee(input)
}

class CoffeeShop {
    fun sellCoffee(input: String) {
        CoffeeCup().apply {
            clientName = input
            prepareCoffee()
            println("Hi $input, we're preparing you coffee")
            println(this)
        }
    }
}

class CoffeeCup {
    var clientName = ""

    fun prepareCoffee() {
        println("We're brewing your coffee")
    }
}