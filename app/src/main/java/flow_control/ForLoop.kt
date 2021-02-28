package flow_control


fun main() {

    // Looping through an Array list of

    val animals = arrayListOf("Dog", "Cat", "Bear")
    for (animal in animals) {
        println("Feed the $animal")
    }

    // Looping through a range and using when

    for (i in 1..4) {
        val month = when (i) {
            1 -> "January"
            2 -> "February"
            3 -> "March"
            4 -> "April"
            else -> ""
        }
        println("The month $i is $month")
    }

    // Looping through a range (ascending)

    var total = 0
    for (i in 1..100) {
        total += i
    }
    println("The total is $total")

    // Looping through a range (descending)

    for (i in 10 downTo 0) println(i)

    println("Another example: ")

    for (i in 10 downTo 0) {
        println(i)
        when (i) {
            3 -> println("On your marks")
            2 -> println("Get set")
            0 -> println("Go!")
        }
    }

    // Looping through a range with steps

    for (i in 10 downTo 0 step 3)
        println(i)

    // Looping through a hash map of

    val customers = hashMapOf(Pair("Alice", 4), Pair("Juan", 8), Pair("Edith", 6))
    for (key in customers.keys) {
        val purchase = customers[key]
        println("The customer $key did $purchase purchases")
    }
}
