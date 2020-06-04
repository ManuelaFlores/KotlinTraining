package com.manuflowers.trainingkotlin

import java.lang.Math.PI
import kotlin.math.sqrt

/*
Challenge 1:
  - Create an interface `Shape` that defines a property `area` of type Double.
  - Implement `Shape` with classes representing Square, Triangle, and Circle.
  - Add a circle, a square, and a triangle to an array.
  - Convert the array of shapes to an array of areas using map.

 **HINTS**
 - The area of a square = one of its sides squared
 - The area of a triangle = 0.5 multiplied by its base multiplied by its height
 - The area of a circle = pi multiplied by its radius squared
*/

interface Shape {
    val area: Double
}

class Square(var side: Double) : Shape {
    override val area: Double
        get() = side * side
}

class Triangle(var base: Double, var height: Double) : Shape {
    override val area: Double
        get() = (base * height) * 0.5
}

class CircleFour(var radius: Double) : Shape {
    override val area: Double
        get() = PI * radius * radius
}


fun main() {
    val square = Square(4.0)
    square.area

    val triangle = Triangle(8.0, 4.0)
    triangle.area

    val circleFour = CircleFour(5.0)
    circleFour.area

    val list = listOf(square, triangle, circleFour)
    println(list.map {
        it.area
    })

}