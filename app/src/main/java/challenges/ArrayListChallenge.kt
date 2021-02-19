package challenges

/*
 Create an array list of your favorite book titles. Loop over this list and, if
 the title contains the letter ‘e’, print each character of the name on a new
 line.
 */

fun main() {

    var favorBooks = arrayListOf("100 years of solitude", "sapiens", "al pueblo nunca le toca", "hi")

    for (list in favorBooks) {
        if (list.contains('e')) {
            for (char in list)
                println(char)
        }
    }
}