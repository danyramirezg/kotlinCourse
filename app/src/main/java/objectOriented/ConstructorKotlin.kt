package objectOriented

class Woman(val name: String, var age: Int) {

    init {
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
    val woman = Woman("Dany", 25)

    woman.speak()
    woman.greet("Dany")
    println(woman.getYearOfBirth())

    println(woman.name)
    println(woman.age)
}
