package objectOriented

abstract class Course(val topic: String, val price: Double){
    open fun learn(){
        println("Learning a great $topic course")
    }
}

interface Learnable {
    fun learn(){
        println("learning...")
    }
}

open class KotlinCourse() : Course("kotlin", 999.99){
    override final fun learn(){
        super<Course>.learn()
        println("$topic is awesome!")
    }
}

fun main(args: Array<String>){
    val course = KotlinCourse()
    course.learn()
}