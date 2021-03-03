package anotherCourseObjectOriented

import java.util.*

/*
    Exercise: Polymorphism
    A TV can provide programs from a certain channel.

    It can also provide channel and subtitle information.

    It can also provide programs that were shown at a certain time of the day.

    Implement this in a program and call the various methods
 */

fun main(args: Array<String>) {
    val tv = Tv()
    tv.channel()
    tv.channel(true)
    tv.channel("13:00")
    tv.channel("14:00")
}

class Tv {
    fun channel() {
        println("Regular broadcast for channel Caracol TV")
    }

    fun channel(subtitles: Boolean) {
        if (subtitles) {
            println("The channel has close captions")
        } else {
            println("The channel doesn't have close captions")
        }

    }

    fun channel(time: String) {
        when (time) {
            "13:00" -> println("Canal A")
            "14:00" -> println("RCN")
            "15:00" -> println("Teleantioquia")
            else -> channel()
        }
    }
}