package anotherCourseObjectOriented

/*

    Exercise: Inheritance
    A class Father has a first name and last name. It also has a function that prints out the
    person’s name.

    A class Son inherits from Father and overrides the first name. It also overrides the message
    function, which now prints out both the name of the person, and the name of the father.

    Implement this structure in a program.
 */

fun main() {
    val son = Son()
    son.personName()
}

open class Father {
    open val firstName = "Saul"
    open val secondName = "Ramirez"

    open fun personName() {
        println("The name is $firstName $secondName")
    }
}

class Son : Father() {
    override val firstName = "Andres"

    override fun personName() {
        super.personName()
        println("The father's name is ${super.firstName} ${super.secondName}")
    }
}