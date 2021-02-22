package challenges

/*
Create a class representing a book. Every book has a title, an author, a
publication year and is either borrowed or not. Choose an appropriate
data type for each of these properties.
A book can be borrowed from you or returned to you. In both cases, the
borrowed property is updated accordingly. Also, a book should be able
to print itself to the command line, including its title, author, and
publication year.

 */

class Book(var title: String, var author: String, var publicationYear: Int, val isBorrow: Boolean) {

    init {
        println("Welcome to the library!")
    }

    fun informationBook(title: String, author: String, publicationYear: Int) {
        println("The book $title by $author was published in $publicationYear")

    }

    fun bookIsAvailable() {
        if (isBorrow) {
            println("The book is not available")
        } else
            println("The book is available")
    }

    fun returnBook(): Boolean {
        if (isBorrow) {
            return true
        } else {
            println("Would you like borrow this book?")
            return false
        }
    }
}

fun main(args: Array<String>) {
    val book = Book("Sapiens", "Yuval Noah Harari", 2011, true)

    println("Printing the classes' methods:")
    book.informationBook("Sapiens", "Yuval Noah Harari", 2011)
    book.bookIsAvailable()
    book.returnBook()

    println("Printing each class' property: ")
    println(book.title)
    println(book.author)
    println(book.publicationYear)
    println(book.isBorrow)

    println("Creating a new book:")
    book.informationBook("100 years of solitude", "Gabo", 1967)
}
