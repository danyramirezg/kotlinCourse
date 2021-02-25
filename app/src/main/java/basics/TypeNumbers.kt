package basics

/*
    <variableName>::class.java tell us what type is our number
 */

fun main(args: Array<String>) {

    val apple = 6
    println(apple::class.java) //int

    // Type conversions: You can convert toInt(), toByte(), toShort()...
    // So be careful converting from long to int

    val pineapple = 5
    val longPineapple = pineapple.toLong()
    println(longPineapple::class.java)

    // Any variable can convert into string

    val cats = 3
    println(cats::class.java) // int
    val catsString =  cats.toString()
    println(catsString::class.java) // class java.lang.String

}