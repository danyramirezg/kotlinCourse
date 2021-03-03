package anotherCourseObjectOriented

/*
    Companion Object:

    Static code
    Makes class code available without the need for an object.

    I don't have to instance.
 */         

fun main(args: Array<String>) {

    // class Car
    println(Car.getDrivingInstructions())

    // Example (book class):

    val myBook = Book(Book.getEditorName())
    println(myBook.editor.editorName)
}

class Car {
    companion object {
        fun getDrivingInstructions(): String {
            return "Drive safe"
        }
    }
}

/*
    Exercise:

    A book class will provide information about the editor without the need to be instantiated.

    It will also require this information - in the form of an editor object type - in the constructor.
    Implement this in a program.

 */

class Book(val editor: Editor) {
    companion object {
        fun getEditorName() = Editor("O'Reilly")
    }
}

class Editor(val editorName: String){

}