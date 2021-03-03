package anotherCourseObjectOriented

/*

Exercise: Constructors
Create an online store user account class that has a userName and balance

Create 3 constructors for this class.

Inside the constructors, based on the user balance, print out whether they can afford the
product t-shirt, which costs 20, and if so, how many can they afford.

 */

fun main() {
    val user = UserAccount()
    val user2 = UserAccount("Jhon")
    val user3 = UserAccount("Caro", 1000)

}

class UserAccount {

    var userName = "User name"
    var balance = 0

    constructor() {

        userName = "Dany"
        balance = 100
        canAfford()
    }

    constructor(newUser: String) {
        userName = newUser
        balance = 0
        canAfford()
    }

    constructor(newUser: String, newBalance: Int) {
        userName = newUser
        balance = newBalance
        canAfford()
    }

    private fun canAfford() {

        var tshirt = 20

        if (balance > tshirt) {
            println("$userName can buy ${balance / tshirt} t-shirts. $userName's balance is $balance")
        } else {
            println("$userName can't afford t-shirts. $userName's balance is $balance")
        }
    }
}