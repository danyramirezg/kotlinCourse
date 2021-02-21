package functions

fun main(args: Array<String>){
    val list = listOf(1, 2, 3, 4, 5)
    println(reverse(list))
    println(reverseDownTo(list))
}

fun reverse(list: List<Int>): List<Int> {

    // To make the immutable list, use an array List, for adding elements
    val result = arrayListOf<Int>()

    // Go through the list (size -1) is the last index of the list
    for (i in 0..list.size -1){
        // Populate the list (add), get is to obtain the values of the list
        result.add(list.get(list.size -1 -i))
    }
    return result
}

// down to is a kotlin built in function
fun reverseDownTo(list: List<Int>): List<Int>{
    val result = arrayListOf<Int>()

    for (i in list.size - 1 downTo 0){
        result.add(list.get(i))
    }
    return result
}