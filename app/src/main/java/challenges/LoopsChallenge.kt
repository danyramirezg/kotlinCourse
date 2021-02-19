package challenges

/*
    For this challenge, try to write a program that calculates the sum of all
    numbers from 100 to 100,000 and prints out the result.

 */


fun main() {

    var sum = 0L
    for (i in 100..100000L){
        sum += i
    }
    println(sum)
}