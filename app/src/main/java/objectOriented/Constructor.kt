package objectOriented

class Person(name: String, age: Int) {
    val name: String
    var age: Int


    init {
        this.name = name
        this.age = age
        println("The object was created!")
    }

    fun speak() {
        println("Nice to meet you!")
    }

    fun greet(name: String) {
        println("hello $name!")
    }

    fun getYearOfBirth(): Int{
        return 2021 - age
    }
}

fun main(args: Array<String>){
    val person = Woman("Jero", 4)

    person.speak()
    person.greet("Dany")
    println(person.getYearOfBirth())

    println(person.name)
    println(person.age)
}
