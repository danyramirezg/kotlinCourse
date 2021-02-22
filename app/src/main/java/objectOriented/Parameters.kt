package objectOriented

/*
    Creating parameters.
    You can use defaults values inside the parameters
 */

class Country(val name: String, val population: Int, val continent: String = "America"){



    fun printInformation(){
        println("The country $name is located in $continent, the population is $population")
    }
}

fun main() {

    // You can pass the parameters in different order

    val colombia = Country(population = 49000000, name = "Colombia")
    val japan = Country(name = "Japan", continent = "Asia", population = 126000000)

    colombia.printInformation()
    japan.printInformation()
}