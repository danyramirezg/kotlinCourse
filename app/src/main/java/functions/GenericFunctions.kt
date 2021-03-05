package functions

/*
    Create a class that takes a generic type T, and has a function that takes an element of type T,
    converts it to a String and prints the length of that String.

    Create different objects of that class and invoke the function.
 */

fun main() {

    val generic = Generic<String>()
    generic.convertString("Hello Dany") // 10

    val generic1 = Generic<Float>()
    generic1.convertString(34f) // 4

    val generic2 = Generic<ArrayList<Int>>()
    generic2.convertString(arrayListOf(3, 4, 4)) // 9

    // Exercise

    val info = Convert<Int>()
    info.passToString(2)

    val info2 = Convert<String>()
    info2.passToString("Dany")

    val info3 = Convert<ArrayList<String>>()
    info3.passToString(arrayListOf("Hello", "everyone!"))

    val info4 = Convert<HashMap<Int, String>>()
    info4.passToString(hashMapOf(Pair(1, "one"), Pair(2, "two")))

}

class Generic<T> {
    fun convertString(elem: T) {
        val element = elem.toString()
        println(element.length)
    }
}

/*
    Exercise: Generics

    Create a class that takes a generic type T, and has a function that converts the type to String
    and prints a message that includes the argument passed.

    Instantiate the class with different types and call the function.
 */

class Convert<T>{
    fun passToString(element: T){
        val text = element.toString()
        println("The argument passed is $text")
    }
}