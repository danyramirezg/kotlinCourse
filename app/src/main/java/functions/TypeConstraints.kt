package functions

/*
    Type parameters:
    We can restrict the type of generic parameters

    For multiple constraints, we can separate them by commas:

    class Box<T: Fruit, U: Vegetable>{
    fun display(item: T){
        println(item)
        }
    }

    Exercise: Type constraints
    Create an abstract class Shape that defines a method getArea which takes an argument size.
    Create two subclasses, Square and Circle, that inherit from Shape, and implement the method.

    Square area = size * size

    Circle area = size * size * 3.1415

    Create another class Geometry that takes a generic argument of type Shape, and has a method
    that prints a message which includes the area of the shape that is passed.

    Instantiate the Geometry class and print the area of the shape.
 */

fun main() {

    val circle = Geometry<Circle>()
    circle.printMessage(Circle(), 30)

    val square = Geometry<Square>()
    square.printMessage(Square(), 20)

}

abstract class Shape {
    abstract fun getArea(size: Int): Double
}

class Square : Shape() {
    override fun getArea(size: Int): Double {
        return size * size.toDouble()
    }
}

class Circle : Shape() {
    override fun getArea(size: Int): Double {
        return size * size * 3.1415
    }
}

class Geometry<T : Shape> {
    fun printMessage(shape: T, size: Int) {
        println("The area of the shape is ${shape.getArea(size)}")
    }
}