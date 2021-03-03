package standardFunctions

/*

    Exercise: With
    A store has a supply of shoes, shirts and jackets, as well as a method to print out
    the inventory.

    Create a variable of type store, update its stock and print out the inventory.

 */

fun main() {
    val store = Store()
    with(store) {
        shoes = 4
        shirts = 5
        jackets = 3
        printInventory()
    }
}

class Store {
    var shoes = 0
    var shirts = 0
    var jackets = 0

    fun printInventory() {
        println("The store has $shoes pair of shoes, $shirts shirts and $jackets jackets")
    }
}