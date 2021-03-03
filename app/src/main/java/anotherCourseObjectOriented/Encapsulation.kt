package anotherCourseObjectOriented

/*
    Exercise: Encapsulation and scope

    A famous fast food restaurant has a secret formula for their burgers.

    A franchise of this brand can sell burgers, but does not have access to the formula. They have
    to ask the original restaurant how to prepare the food.

    Implement this in a program, and call the franchise object to provide you with burgers.

 */

fun main() {
    val restaurant = Franchise()
    restaurant.prepareBurgers()
}

open class OriginalRestaurant {
    protected fun secretFormula(): String {
        return "The secret is the love"
    }
}

class Franchise : OriginalRestaurant() {
    fun prepareBurgers() {
        println("Bread, protein, lettuce and tomatoes")
        println(secretFormula())
    }
}