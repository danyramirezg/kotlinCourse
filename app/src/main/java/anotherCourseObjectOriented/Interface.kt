package anotherCourseObjectOriented


/*
    Interfaces

    Create an interface Car that guarantees functionality for drive and park, as well as a speed.
    Create a class BMW that implements the Car interface.
    Create a CarFactory that provides cars.
    Create a variable myCar and ask the CarFactory for a car. Call the various methods on your car,
    without knowing what type it is.

 */

fun main() {

    val factory = CarFactory()
    val myCar: Carro = factory.provideCar()

    myCar.speed = 120
    myCar.drive()
    myCar.park()
}

interface Carro {

    var speed: Int
    fun drive()
    fun park()

}

class BMW : Carro {
    override var speed = 200

    override fun drive() {
        println("BMW drives $speed miles by hour")
    }

    override fun park() {
        println("BMW parks automatically")
    }
}

class CarFactory {
    fun provideCar(): Carro {
        return BMW()
    }
}