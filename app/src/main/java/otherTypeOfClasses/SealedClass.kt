package otherTypeOfClasses


/* Sealed class:
        Representan una jerarquía de clases que heredan de un padre.
        Es abstracta, las instancias han de ser de hijos
        En la jerarquía de posibles valores se pueden definir clases u objetos
 */

fun main() {
    val p1 = Figura.Punto
    val p2 = Figura.Punto
    val c = Figura.Square(2, 8)

    p1.color = 3
    print("color c=${c.color}, ") // The c color is initialized to 2
    print("color p2=${p2.color}") // p2 will be equal to 3, because there are just one object

    // Output: Punto created, color c=2, color p2=3
}

sealed class Figura(open var color: Int = 0) {
    abstract fun area(): Int

    class Square(override var color: Int, val side: Int) : Figura() {
        override fun area() = side * side
    }

    object Punto : Figura(1) {
        override fun area() = 0

        init {
            print("Punto created, ")
        }
    }
}
