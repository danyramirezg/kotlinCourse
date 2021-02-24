package objectOriented

private class Animal{
    var age: Int = 0

        // Redundant getter
        get() = field

        // By convention, the name of the setter parameter is value, but you can choose a different name if you prefer.
        set(value){
            if (value >= 0) {
                // The field identifier can only be used in the accessors of the property.
                field = value
            }
        }
}

fun main(args: Array<String>) {
    val animal = Animal()
    animal.age = 8
    animal.age = -2 // This value won't be updated, because is less than zero
    animal.age = 10 // Prints 10, because This value will be updated, because is more than zero
    println(animal.age) // Is like a getter in Kotlin
}