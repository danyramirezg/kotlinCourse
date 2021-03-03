package standardFunctions

/*

Exercise: Run
A laptop has two functions, turnOn and turnOff.

To make sure it works as expected, every time we have a new laptop object, the protocol is to turn
it off and then back on again.

Create a laptop object and implement the protocol.

 */

fun main() {
    Laptop().run {
        turnOn()
        turnOff()
        this
    }
}

class Laptop {
    fun turnOn() {
        println("The laptop is turn ON")
    }

    fun turnOff() {
        println("The laptop is turn off")
    }
}