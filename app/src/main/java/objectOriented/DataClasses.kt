package objectOriented

class Book(val title: String, val author: String, val publicationYear: Int, var price: Double) {

    //    With this function I can have an output similar to the data class
    override fun toString(): String {
        return "Book[title=$title, author=$author, publicationYear=$publicationYear, price=$price"
    }

}

data class DataBook(val title: String, val author: String, val publicationYear: Int, var price: Double) {

}

fun main(args: Array<String>) {
    val book = Book("Sapiens", "Yuval Noah", 2011, 90.0)
    val dataBook = DataBook("Sapiens", "Yuval Noah", 2011, 90.0)

    /*
    With data class prints: DataBook(title=Sapiens, author=Yuval Noah, publicationYear=2011, price=90.0)
    with the class only prints the package, the class name and the address: objectOriented.Book@5cad8086,
    UNLESS you use the override fun toString()
    */
    println(dataBook)
    println(book)

    // Date classes allows to compare objects, I can't do that with classes

    val dataBook1 = DataBook("Sapiens", "Yuval Noah", 2011, 90.0)
    println(dataBook.equals(dataBook1))  //True

    // Date classes allows to copy objects and we can change some values of the object:

    val dataBook2 = dataBook.copy(price = 100.0)
    println(dataBook2)

    // With data classes we could decompose each of the objects we have into their properties:

    val (title, author, year, price) = dataBook
    println(year) // 2011
    println(title) // Sapiens

    // With Data classes we could create a hash set or a hash map that contains objects of
    // these data classes

    // the function hashSetOf deletes duplicates in data classes, not in classes

    val set = hashSetOf(dataBook, dataBook1, dataBook2)
    println("dataBook set: $set")

    val book1 = Book("Sapiens", "Yuval Noah", 2011, 90.0)
    val set1 = hashSetOf(book, book1)
    println("book set: $set1")

    /*
    Output:
    In dataBook we have two duplicates, so the function hashSetOf deletes one, BUT in book
    we have two duplicates, and the function hashSetOf DOESN'T delete the duplicates.

    - dataBook set:
    [DataBook(title=Sapiens, author=Yuval Noah, publicationYear=2011, price=90.0), DataBook(title=Sapiens, author=Yuval Noah, publicationYear=2011, price=100.0)]

    - book set:
    [Book[title=Sapiens, author=Yuval Noah, publicationYear=2011, price=90.0, Book[title=Sapiens, author=Yuval Noah, publicationYear=2011, price=90.0]

     */

}