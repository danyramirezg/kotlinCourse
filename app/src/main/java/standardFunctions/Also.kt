package standardFunctions

import anotherCourseObjectOriented.Car

/*
   Also:
   Used for perfoming some additional actions on an object
   Common use is adding some actions that don't affect the object such as logging or debugging info
   Removing an also block shouldn't affect the execution of a program
*/

fun main() {

    /*
    Exercise: Also
    Whenever a car is built, the company logs must be updated and the police notified.
    Implement this functionality in a program.
     */

    BuildCar().apply {
        buildCar()
    }
            .also {
                println("LOG: Updating info car")
                println("Notifying the police")
                println(it)
            }
}

class BuildCar {

    fun buildCar() {
        println("Building a car")
    }
}
