package anotherCourseObjectOriented

/*

    Exercise: Getters and Setters
    A bank has various rules for interest rates.

    If a user has less than 1000 in their account, their interest rate is 1.0
    If a user has less than 10.000 in their account, their interest rate is 0.5
    If a user has 10000 and over, their interest rate is 0.2.

    Implement this in a program, create an object, update the amount and print out the interest rate

 */

fun main(args: Array<String>) {
    val bank = BankAccount()
    bank.amount = 20000
    bank.amount = 500
    bank.amount = 1500
}

class BankAccount {

    var interestRate = 0.0
    var amount = 0
        get() = field
        set(value) {
            if (value < 1000)
                interestRate = 1.0
            else if (value < 10000)
                interestRate = 0.5
            else
                interestRate = 0.2
            field = value
            println("The user has $amount, the interest rate is $interestRate")
        }
}