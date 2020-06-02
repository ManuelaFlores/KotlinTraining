package com.manuflowers.trainingkotlin

import kotlin.math.roundToInt
import kotlin.math.sqrt

/**
 * Properties can also be defined with custom getters and setters methods
 * If a custom setter is provided then the property has to be declared as var
 * */
class PersonFour(val name: String, val lastName: String) {
    val fullName = "$name $lastName"
}

class TV(var width: Double, var height: Double) {
    var diagonal: Int
        get() {
            val result = sqrt(width * width + height * height)
            return result.roundToInt()
        }
    set(value) {
        val ratioWidth = 16.0
        val ratioHeight = 9
        val ratioDiagonal = sqrt(ratioWidth* ratioWidth + ratioHeight* ratioHeight)
        height = value.toDouble() * ratioHeight/ratioDiagonal
        width = height * ratioWidth / ratioHeight
    }
}

fun main() {
    val grace = PersonFour("Grace", "Hopper")
    println(grace.fullName)

    val tv = TV(width = 95.87, height = 53.93)
    tv.width = tv.height
    println(tv.diagonal)

    tv.diagonal = 65
    println("That'll be ${tv.width} inches wide, Manu!")
}