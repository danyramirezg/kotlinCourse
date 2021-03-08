package anotherCourseObjectOriented

/*
    Singleton: One instance of a class.
    We don't need to instantiate in order to access its functionality
    The 'object' constructor
*/

fun main() {

//  DataBaseAccess.connected = true // I can reset the variable here

    if (DataBaseAccess.connected)
        DataBaseAccess.disconnected()
    else
        (DataBaseAccess.connect())
    println("Database is connected: ${DataBaseAccess.connected}")

}

object DataBaseAccess {

    var connected = false
    fun connect() {
        connected = true
        println("Connected to database")
    }

    fun disconnected() {
        var connected = false
        println("Disconnected from database")
    }
}