package otherTypeOfClasses

fun main() {

    val color = Colors.BLUE
    when (color) {
        Colors.BLUE -> println("You chose BLUE")
        Colors.RED -> println("You chose RED")
        Colors.YELLOW -> println("You chose YELLOW")
    }
    println(Colors.YELLOW.timeUsed) // 2
    println(Colors.BLUE.name) // BLUE
    println(Colors.RED.ordinal) // 0 (ordinal is the position)
}

enum class Colors(val timeUsed: Int) {
    RED(34),
    BLUE(12),
    YELLOW(2)
}