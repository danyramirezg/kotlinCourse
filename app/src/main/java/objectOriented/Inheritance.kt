package objectOriented

/*
    When use inheritance, the class and the properties of the parent class should have the
    keyword open, so another classes can inheritance from that one. And then we can tell kotlin to
    overwrite these properties with the new properties in the child class
 */

open class Human(open val name: String, open var age: Int){

    init {
        println("Object was created")
    }

    fun speak(){
        println("Hello!")
    }

    fun greet(name: String){
        println("Hi, mi name is $name")
    }

    fun getYearOfBirth() = 2021 - age
}

class Student(override val name: String, override var age: Int, val studentId: Int): Human(name, age) {

    fun assistedToClass() = true
}

class Employee(override val name: String, override var age: Int): Human(name, age){

    fun receivePayment(){
        println("Received payment")
    }
}

fun main(args: Array<String>) {
    val student = Student("Jhon", 25, 23342)
    student.greet("Jhon")
    student.assistedToClass()

    val employee = Employee("Andres", 35)
    employee.speak()
    println(employee.getYearOfBirth())
    employee.receivePayment()
}