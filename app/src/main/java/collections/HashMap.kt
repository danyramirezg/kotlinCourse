package collections

/*
    Hash map is a mutable map

 */

fun main() {

    val count = hashMapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))

    // To add key-value pair: .put
    count.put(4, "four")
    println(count) // {1=one, 2=two, 3=three, 4=four}

    val moreCount = mapOf(Pair(5, "five"), Pair(6, "six"))
    count.putAll(moreCount)
    println(count) // {1=one, 2=two, 3=three, 4=four, 5=five, 6=six}

    // Removing an element from the key
    count.remove(3)
    println(count)

    /*
      Functions:
      .size
      .containsKey()
      .isEmpty()
      .isNotEmpty()
   */

    println(count.size)
    println("Does the map have the key 5?: ${count.containsKey(5)}")
    println("Does the map have the value \"two\"?: ${count.containsValue("two")}")
    println("Is the map empty?: ${count.isEmpty()}")
    println("Does the map have any key value pairs?: ${count.isNotEmpty()}")

    // Replacing a value:
//    count.replace(1, "one-one")
//    println(count)

    // Delete the hash map:
    count.clear()
    println(count)

    /*
    Exercise: Map and HashMap
    You manage an amusement park, and you have a map that stores dates and attendance.

    var attendance = hashMapOf(Pair(“23 Sept”, 2837), Pair(“24 Sept”, 3726), Pair(“25 Sept”, 6253))

    Add a value for 26 Sept.

    How many people attended in total on 25 and 26 Sept?

    Is data for 22 Sept available?
     */

    val attendance = hashMapOf(Pair("23 Sept", 2837), Pair("24 Sept", 3726), Pair("25 Sept", 6253))
    attendance.put("26 sept", 3453)
    println(attendance)

    val attendanceSep25 = attendance["25 sept"]?:0 // In case that date is null, I use ?: to say, tell this operator that is zero
    val attendanceSep26 = attendance["26 sept"]?:0

    println(attendanceSep25 + attendanceSep26)
    println(attendance.containsKey("22 sept"))

}