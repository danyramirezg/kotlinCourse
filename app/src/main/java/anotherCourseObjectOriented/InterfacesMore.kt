package anotherCourseObjectOriented

/*

    Exercise: More interfaces

    A car will drive you to a destination, but a limousine will drive you there in comfort.
    A car rental place has both, at different prices.

    One day you want a utility car that is cheaper.

    Another day, you want a luxury car.

    Implement this functionality in a program and display the appropriate messages.
 */

fun main() {

    val dealer = CarRental()
    var myCar: Automobile = dealer.rent()
    myCar.price()

    var myLimousine: Automobile = dealer.rentComfort()
    myLimousine.price()
}


interface Automobile {
    fun price()
}

class CarCheaper : Automobile {
    override fun price() {
        println("The price of the ride is $20/hour")
    }
}

class Limousine : Automobile {
    override fun price() {
        println("The price of the ride is $100/hour and you will be more comfortable")
    }
}

class CarRental {
    fun rent(): Automobile {
        return CarCheaper()
    }

    fun rentComfort(): Automobile {
        return Limousine()
    }
}