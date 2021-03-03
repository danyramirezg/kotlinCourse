package anotherCourseObjectOriented

/*
    Exercise: Abstraction
    A default oven has an average cooking speed, top temperature and function for cooking.

    A Bosch oven has a higher cooking temperature.

    A Roaster oven does not cook but roasts. The speed and temperature are average.

    Implement this in a program and print out the various information for the objects.

 */

fun main() {
    val bosch: Oven = BoschOven()
    bosch.cooking()

    val roaster: Oven = RoasterOven()
    roaster.cooking()
}


abstract class Oven {
    val cookingSpeed = 120
    open val topTemperature = 180

    abstract fun cooking()
}

class BoschOven : Oven() {
    override val topTemperature = 200

    override fun cooking() {
        println("Bosh oven is cooking in $cookingSpeed minutes at $topTemperature temperature")
    }
}

class RoasterOven : Oven() {

    override fun cooking() {
        println("The roaster doesn't cook, but roast")
        println("Roaster oven roasts in $cookingSpeed minutes at $topTemperature temperature")
    }
}