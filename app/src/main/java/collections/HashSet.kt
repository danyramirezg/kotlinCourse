package collections

/*
    - HashSet is a mutable set, no ordered   

 */

fun main() {
    val numbers = hashSetOf(5, 7, 8, null)

    // Add elements    
    println(numbers.add(6))

    // Add another set
    val new = setOf(7, 9)
    numbers.addAll(new)
    println(numbers)

    // Remove elements
    numbers.remove(null)
    println(numbers)

    // Remove a set of collections (removeAll)

    val objects = hashSetOf("computer", "mouse", "phone", "bottle")
    val removeObjects = setOf("phone", "bottle")

    objects.removeAll(removeObjects)
    println(objects)

    /*

    Exercise: Set and HashSet
    You have a list of customers for your online store.
    A new customer has joined.
    Print the list of customers.
    A customer has chosen to leave.
    Print the list of customers.

     */

    val customer = hashSetOf("Customer 1", "Customer 2", "Customer 3")
    customer.add("Customer 4")
    println(customer)
    customer.remove("customer 3")
    println(customer)

    // functions hasSetOf: retainAll: Works as an interception (the common elements)

    val numb = hashSetOf(1,2 ,3 )
    val newNumb = setOf(2, 3, 4, 5)

    numb.retainAll(newNumb)
    println(numb) // [2, 3]

    // isEmpty, another method

    println(numb.isEmpty()) // false

    // contains method

    val primeNumbers = setOf(2, 3, 5, 7, 11, 13, 17, 19)
    println("Is the number 21 a prime number?: ${primeNumbers.contains(21)}")
    println("Is the number 13 a prime number?: ${primeNumbers.contains(13)}")

}
