package objectOriented

/*
Use:
- private: To restrict access and follow the principle of information hiding
- protected: To design your inheritance structures. This is more restrictive than internal
- public: To declare your well-defined interface to the outside world

****Example:

// file name: example.kt
package foo

private fun foo() { ... } // visible inside example.kt

public var bar: Int = 5 // property is visible everywhere
    private set         // setter is visible only in example.kt

internal val baz = 6    // visible inside the same module

 */

open class SomeAnimal{
    private var age: Int = 0
    protected var name = "Tony"
    internal var isHappy = true

    public fun isYoung(): Boolean{
        return age < 15
    }
}

class Vertebrate: SomeAnimal() {

    fun introduceYourself(){
        println(this.name)
    }
}

fun main(args: Array<String>) {
    val animal = SomeAnimal()
    println(animal.isHappy)
    println(animal.isYoung())

    println("===== Vertebrate class: ")

    val vertebrate = Vertebrate()
    vertebrate.introduceYourself()
    println(vertebrate.isHappy)
}