package basics.exercises

/*
    Exercise: Null
    Read a number from the console and convert it to Double.

    Multiply it by 7, and convert the result into a string.

    Print the length of that string to the console.

 */

fun main() {
    print("Please write a number: " )
    var num = readLine()
    var num2 = num?.toDouble()?.times(7)
    println(num2!!::class.java) // class java.lang.Double


    var result = num2?.toString()
    println("$result, The length is ${result?.length}" )
    println(result::class.java)

}