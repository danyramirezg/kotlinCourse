package otherConcepts

import kotlin.random.Random

/*
    Type Casting:

    - is
    - as

Exercise: type casting

    The classes Cat and Dog inherit from an abstract class Animal. The Cat class has a function
    purr() and the Dog class has a function bark()

    A function provides a list of animals, that are randomly distributed.

    Design a program that invokes each respective function of each type of Animal from the list.
 */

fun main() {
    val animal = randomList()
    animal.forEach { anim ->
        (anim as? Dog)?.bark()
        (anim as? Cat)?.purr()
    }
}

abstract class Animal()

class Cat : Animal() {
    fun purr() {
        println("The cat is purring")
    }
}

class Dog : Animal() {
    fun bark() {
        println("The dog is barking")
    }
}

fun randomList(): ArrayList<Animal> {

    val animals = arrayListOf<Animal>()
    for (i in 1..10) {
        animals.add(
                if (Random.nextInt() % 2 == 0)
                    Cat()
                else
                    Dog()
        )
    }
    return animals
}
