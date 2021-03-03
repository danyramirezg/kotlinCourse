package anotherCourseObjectOriented

import android.database.CursorIndexOutOfBoundsException
import kotlin.random.Random

/*
    Exercise: Interfaces
    Coffee will wake you up but also quench your thirst. There are different types of coffee,
    Arabica and Robusta. But since you don’t really care about that, you just go to the coffee shop
    and ask for a coffee, which they will happily provide.

    You will then drink the coffee to both wake you up and quench your thirst.

    Implement this in a program.

 */

fun main() {
    val myCoffeeShop = CoffeeShop()
    var myCoffee: Coffee? = null

    // Let's imagine will buy 5 coffees:
    for (i in 1..5) {
        myCoffee = myCoffeeShop.purchaseCoffee()
        myCoffee.wakeUp()
        myCoffee.quenchThirst()
    }
}

interface Coffee {

    fun wakeUp()
    fun quenchThirst()
}

class Arabica : Coffee {

    override fun wakeUp() {
        println("Arabica coffee will wake you up")
    }

    override fun quenchThirst() {
        println("Arabica coffee will quench your thirst")
    }
}

class Robusta : Coffee {

    override fun wakeUp() {
        println("Robusta coffee will wake you up")
    }

    override fun quenchThirst() {
        println("Robusta coffee will quench your thirst")
    }
}

class CoffeeShop {
    fun purchaseCoffee(): Coffee {
        val randomNumber = System.currentTimeMillis()
        if (randomNumber % 2 == 0L) {
            return Arabica()
        } else
            return Robusta()
    }
}