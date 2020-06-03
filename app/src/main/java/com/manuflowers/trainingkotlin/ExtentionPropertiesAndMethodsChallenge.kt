package com.manuflowers.trainingkotlin

import kotlin.math.PI
import kotlin.math.sqrt

/*
Challenge 1:
Given the `Circle` class below, write a method that can change
an instance’s area by a growth factor. For example if you call
`circle.grow(factor = 3)`, the area of the instance will triple.

**Hint**: Make `area` a `var` and add a setter to it.
Math Hint: The math you want to calculate the radius in `area`s setter is `sqrt(area / PI)`
*/

class CircleThree(var radius: Double = 0.0) {
    var area: Double
        get() {
            return PI * radius.sqr()
        }
        set(value) {
            radius = sqrt(value / PI)
        }
}

fun CircleThree.grow(factor: Double) {
    area *= factor
}

/*
Challenge 2:
Add the `isEven()` and `isOdd()` functions below as extension properties to `Int`
Hint: You *do* need to use the `this` keyword for this challenge!

While you're at it, extend `Double` with a `square` method. Call it `sqr` if you like!
Then, use the new `sqr` method in the Circle class instead of `radius * radius`
*/

object MyMath {
    fun isEven(number: Int) = number.isEven
    fun isOdd(number: Int) = number.isOdd
}

// Add Extension Properties here

val Int.isEven: Boolean
    get() = this % 2 == 0

val Int.isOdd
    get() = this % 2 == 1

fun Double.sqr() = this * this

fun main() {

    println(2.isEven)
    println(2.isOdd)
    println(4.0.sqr())

    val circle = CircleThree(4.0)
    println(PI)
    println(circle.area)
    circle.area = 200.0
    println(circle.radius)
    println(circle.area)
    println(circle.grow(3.0))
    println(circle.area)
}