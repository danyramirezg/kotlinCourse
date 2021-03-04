package standardFunctions

/*
    let:
    Allow us to run code on an object.
    A common use is to use let to filter for non-null variables

 */

fun main() {

    // A common use is to use let to filter for non-null variables

    println("Please write your name")
    val name = readLine()
    name?.let {
        println("Your name is $name")
    }

    // We can access the result as a lambda argument (it) by default

    val animals = listOf("tiger", "dog", "cat", "bear")
    animals.map { it.length }
            .filter { it > 3 }
            .let { // filteredList -> En vez de it le puede colocar un nombre y con ->
                println(it) // filteredList
                println("Size of list is ${it.size}") // [5, 4] - Size of list is 2
            }

    // If the block of code contains a single function call, we can use the method reference ::

    val animals1 = listOf("tiger", "dog", "cat", "bear")
    animals1.map { it.length }
            .filter { it > 3 }
            .let(::println) // [5, 4]

    /*
        Example: Read a number form the console. If it's not null, convert it to an int,
        double it and print it to the console
     */

    println("Write a number: ")
    val text = readLine()
    text?.let {
        val integ = it.toInt()
        println("The double of your number is ${integ * 2}")
    }

    /*
        Example: Read 3 animals from the console and add them to a list. If you read an empty
        string, add a null to the list.
        For each animal in the list, print a "feeding the animal" message
     */

    val animales = arrayListOf<String?>()
    for (i in 1..3) {
        println("Please input an animal")
        val input = readLine()
        input?.let {
            if (it == "") {
                animales.add(null)
            } else {
                animales.add(it)
            }
        }
    }
    animales.forEach {
        it?.let {
            println("Feeding the $it")
        }
    }
}
