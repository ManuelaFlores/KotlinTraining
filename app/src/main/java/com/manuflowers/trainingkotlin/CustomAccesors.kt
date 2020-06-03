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
            return TVMath.getDiagonal(width, height)
        }
        set(value) {
            val size =
                TVMath.getWidthAndHeight(
                    diagonal = value,
                    ratioWidth = 16.0,
                    ratioHeight = 9.0
                )
            width = size.first
            height = size.second
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