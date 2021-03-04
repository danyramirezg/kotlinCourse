package otherTypeOfClasses

/*
    Exercise: Enum classes
    The medals in the olympics are

    GOLD - 1st place

    SILVER - 2nd place

    BRONZE - 3rd place

    NONE - other

    Create a class Olympics that has a function which returns the medal a contestant won based on
    the position they finished on.
    It also has a function which returns the position of a contestant based on the medal they won.
    Create an object of that class and call its methods.

 */

fun main() {
    val olympics = Olympics()
    println(olympics.winnerMedal(2)) // SILVER
    println(olympics.getPosition(Medal.GOLD)) // 1
}

enum class Medal(val place: Int) {

    GOLD(1),
    SILVER(2),
    BRONZE(3),
    NONE(4),
}

class Olympics {
    fun winnerMedal(place: Int): Medal {
        return when (place) {
            1 -> Medal.GOLD
            2 -> Medal.SILVER
            3 -> Medal.BRONZE
            else -> Medal.NONE
        }
    }

    fun getPosition(medal: Medal) = medal.place
}

