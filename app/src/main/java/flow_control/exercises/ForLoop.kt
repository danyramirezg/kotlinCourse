package flow_control.exercises

/*

  Exercise: For loops
  Ask the user to input a year. For each month of that year, print out how many days there are.

  Make sure you count leap years.
  Assume a leap year is a year that is divisible by 4.

  *there are additional rules for leap years, but we will ignore those in this exercise

   */

fun main() {

    println("Please input a year:")
    val input = readLine() ?: "2021"
    val year = input.toInt()

    for (i in 1..4) {
        val message = when (i) {
            1 -> "January has 31 days"
            2 -> if(year % 4 == 0) "February has 29 days" else "February has 28 days"
            3 -> "March has 31 days"
            4 -> "April has 30 days"
            else -> ""
        }
        println(message)
    }
}