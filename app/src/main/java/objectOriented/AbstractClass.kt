package objectOriented

abstract class Car(open val brand: String, open var model: Int){

    abstract fun accelerate()

    fun model(){
        println("The $brand car's model is $model")
    }
}

class Toyota(override val brand: String, override var model: Int): Car(brand, model){

    override fun accelerate() {
        println("The car $brand Toyota is accelerating")
    }
}

class Hyundai(override val brand: String, override var model: Int, var price: Int): Car(brand, model){

    override fun accelerate() {
        println("The car $brand Hyundai is accelerating")
    }

    fun price(){
        println("The $brand Hyundai's price is $price dollars")
    }
}

fun main(args: Array<String>) {

    var toyota = Toyota("RAV4", 2020)
    toyota.accelerate()
    toyota.model()

    var hyundai = Hyundai("Terracan", 2021, 10000)
    hyundai.accelerate()
    hyundai.price()
    hyundai.model()
}