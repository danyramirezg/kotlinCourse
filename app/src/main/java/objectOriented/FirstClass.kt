package objectOriented

class Dog {
    var name: String = "Paco"
    var age: Int = 3

    // Methods are functions inside class

    fun bark() {
        println("Wou wou")
    }

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth(): Int {
        return 2021 - age
    }

    // The same function above, but more concise

    fun getYearOfBirth2() = 2021 - age
}

fun main(args: Array<String>) {
    val dog = Dog()

    dog.bark()
    dog.greet("Kotlin")
    println(dog.getYearOfBirth())
    println(dog.getYearOfBirth2())

    println(dog.name)
    println(dog.age)

    // Changing information
    dog.name = "Braulio"
    dog.age = 4
    println(dog.name)

}