package com.example.dany_hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        whenFunction()
        conditionFunction()
        moreWhen()
        arrays()
        list()
        arrayLists()
        sublist()

    }

    // Using when conditional

    private fun whenFunction() {

        var age = 28

        when (age) {
            0 -> println("It's a baby")

            4 -> {
                println("She's 4 years")
                println("It's a child")
            }
            20 -> println("It's an adult")
            else -> {
                println("This else is used when any condition doesn't apply")
                println("You open curly-braces when you're going to use more statements inside")
            }
        }

        println("That was an example how the when conditionals works")

    }

    private fun moreWhen() {
        val x = 11
        when (x) {
            6 -> println("x is 6")
            3 * 5 -> println("x is 3*5")
            "Hello Dany".length -> println("x is the length of the string 'Hello Dany' ")
            in 1..10 -> println("x is between 1 and 10")
            in 11..20 -> println()
            !in 1..9 -> println("x is not between 1 to 9")
        }
        println("Another examples working with when conditional")
    }

    // Using conditional if, else if

    private fun conditionFunction() {
        var age = 6
        if (age >= 21) {
            println("You can get out")
        } else if (age in 6..20) {
            println("Yor should stay at home")
        } else {
            println("You can't get out")
        }
        println("That was an example how the conditionals work")
    }

    // Arrays

    private fun arrays() {

        // Use arrayOf to create a new array (the same kind or different kind)

        val array = arrayOf("California", "New York", "Arizona")
        val mixed = arrayOf("Hola", 5, 8, true)

        // Use intArrayOf to create an array of integers
        val numbers = intArrayOf(5, 4, 3, 2)

        println(array[1])

        // To reassign a new value in the array with the index:
        mixed[0] = "Hi!"
        println(mixed[0])

        // You can treat strings as arrays of characters

        val str = "Dany"
        println(str[0])

        // Concatenate arrays

        val states = arrayOf("Nevada", "Colorado")
        val allStates = array + states

        allStates.forEach(::println)
        println(allStates.map(String::length))


        /*
        Functions of the arrays:
        - size: Tell us how many elements there are in that array
        - isEmpty: Tell us if the array is empty or not
        - contains: Tell us if an array contents an specific value
         */

        println(allStates.size)

        val empty: Boolean = numbers.isEmpty()
        println(empty)

        if (numbers.contains(5)) {
            println("This array contains the number 5")
        } else {
            println("This array doesn't contain the number 5")
        }
    }

    // ArrayLists

    private fun arrayLists() {

        val arrayList = arrayListOf("Dany", "Caro", "Jero")
        val more = arrayListOf("Andres")

        println("concatenation of the arraylist $arrayList + $more:")
        println(arrayList + more)
        println(arrayList.size)
        println(arrayList.isEmpty())
        println(arrayList.contains("Daniela"))

        arrayList.add(0, "Mari")
        println("List after adding an element in the index 0: $arrayList")

        arrayList.remove("Dany")
        println("List after removing an element: $arrayList")

        val removed = arrayList.remove("Dany")
        println(removed)
    }

    // Lists

    private fun list() {

        val list = listOf("Dany", "Caro", "Jeronimo")
    }

    // Sublist


    private fun sublist() {

        val arrayList = arrayListOf("Dany", "Caro", "Jero")

        val sublist = arrayList.subList(1, 3)
        println(sublist)

    }

}