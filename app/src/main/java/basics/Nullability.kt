package basics

/*
    Null Value: No value present.
    kotlin guards against null values. Using ? operator:

    val name: String = "Lilly"
    val name2: String? = null  // You have to write null to initialize if you're going to use it later
    println(name2)
 */

fun main(args: Array<String>) {

    // Null Safe calls: Use ? in the functions you call:

    var name: String? = "Cata"
    println(name?.length?.toString())  // 4

    name = null
    println(name?.length?.toString()) // null

    // Arithmetic operators on null values:

    val a: Int? = 10

    println("Addition : ${a?.plus(5)}")
    println("Subtraction : ${a?.minus(5)}")
    println("Multiplication : ${a?.times(5)}")
    println("Division : ${a?.div(5)}")
    println("Remainder : ${a?.rem(5)}")

    // Practice Null

    var doubleNum: Double? = 13.94
    doubleNum = doubleNum?.times(6)
    println(doubleNum?.toFloat())

    println("Type your name: ")
    var userName: String? = readLine()
    println(userName?.length)
}