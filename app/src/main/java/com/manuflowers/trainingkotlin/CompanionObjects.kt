package com.manuflowers.trainingkotlin

import kotlin.math.roundToInt
import kotlin.math.sqrt

class Level(val id: Int, val boss: String, var unlocked: Boolean) {
    companion object {
        var highestLevel = 1
    }
}

class TVMath() {
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
            val ratioDiagonal = sqrt(ratioWidth* ratioWidth + ratioHeight* ratioHeight)
            val height = diagonal.toDouble() * ratioHeight/ratioDiagonal
            val width = height * ratioWidth / ratioHeight
            return Pair(width, height)
        }
    }
}

fun main() {
    val level1 = Level(id = 1, boss = "Outside Cat", unlocked = true)
    val level2 = Level(id = 2, boss = "Laser Point", unlocked = false)
    val level3 = Level(id = 3, boss = "Mysterious Attic Sound", unlocked = false)
    val level4 = Level(id = 4, boss = "Vacuum Cleaner", unlocked = false)

    println("Highest level ${Level.highestLevel}")
}