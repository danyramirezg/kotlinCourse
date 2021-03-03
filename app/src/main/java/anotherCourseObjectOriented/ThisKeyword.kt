package anotherCourseObjectOriented

/*
    Exercise: The 'this' keyword
    A table allows the user to adjust the height and size, through a function that also takes the
    parameters height and size.

    Create the class, variable, function, instantiate it and call the function to adjust height and size.
 */

fun main() {
    val table = Table()
    table.printInfo() // The table's size and height are 0, 0 respectively
    table.updateTable(54, 200)
    table.printInfo() // The table's size and height are 200, 54 respectively
}

class Table {
    var height = 0
    var size = 0

    fun updateTable(height: Int, size: Int) {
        this.height = height
        this.size = size
    }

    fun printInfo() {
        println("The table's size and height are $size, $height respectively")
    }
}