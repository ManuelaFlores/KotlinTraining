package com.manuflowers.trainingkotlin

import kotlin.math.PI
import kotlin.math.roundToInt
import kotlin.math.sqrt

//---🛑❌⚠️❌🐻❌☢️❌🤡❌🚫❌🚬❌🛑---

class CircleTwo(var radius: Double = 0.0) {
    val circumference: Double
        get() = PI * radius * 2
}

//---🛑❌⚠️❌🐻❌☢️❌🤡❌🚫❌🚬❌🛑---


// Add Circle Extension Property

val CircleTwo.diameter: Double
    get() = 2.0 * radius


//---🛑❌⚠️❌🐻❌☢️❌🤡❌🚫❌🚬❌🛑---

class SimpleDateTwo(var month: String) {
    fun monthsUntilJingleBells(): Int {
        return months.indexOf("December") - months.indexOf(month)
    }

    companion object {
        val months = arrayOf(
            "January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"
        )
    }
}
//---🛑❌⚠️❌🐻❌☢️❌🤡❌🚫❌🚬❌🛑---


// Add SimpleDate Extension Method

fun SimpleDateTwo.monthsUntilHalloweenDecorations(): Int {
    val currentMonth = SimpleDateTwo.months.indexOf(month)
    val halloweenStart = SimpleDateTwo.months.indexOf("September")
    val halloweenEnd = SimpleDateTwo.months.indexOf("October")
    return if (currentMonth in 0..halloweenStart) {
        halloweenStart - currentMonth
    } else if (currentMonth in halloweenStart..halloweenEnd) {
        0
    } else {
        halloweenStart + (12 - currentMonth)
    }
}

//---🛑❌⚠️❌🐻❌☢️❌🤡❌🚫❌🚬❌🛑---
class TVMathTwo {
    companion object {
        fun getDiagonal(width: Double, height: Double): Int {
            val result = sqrt(width * width + height * height)
            return result.roundToInt()
        }

        fun getWidthAndHeight(
            diagonal: Int,
            ratioWidth: Double,
            ratioHeight: Double
        ): Pair<Double, Double> {
            val ratioDiagonal = sqrt(ratioWidth * ratioWidth + ratioHeight * ratioHeight)
            val height = diagonal * ratioHeight / ratioDiagonal
            val width = height * ratioWidth / ratioHeight

            return Pair(width, height)
        }
    }
}
//---🛑❌⚠️❌🐻❌☢️❌🤡❌🚫❌🚬❌🛑---


// Add TVMath Companion Object Extension Method
fun TVMathTwo.Companion.idealViewingDistance(diagonal: Int, is4K: Boolean): Double {
    return if (is4K) diagonal * 1.25 else diagonal * 2.0
}


fun main() {

    val distance = TVMathTwo.idealViewingDistance(diagonal = 65, is4K = true)
    println("Sit $distance inches away")
    val date = SimpleDateTwo("August")
    println("${date.monthsUntilHalloweenDecorations()} month(s) until spooky decorations")

    val unitCircle = CircleTwo(1.0)
    println(unitCircle.diameter)
}