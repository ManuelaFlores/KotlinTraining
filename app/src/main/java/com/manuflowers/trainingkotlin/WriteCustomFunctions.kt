package com.manuflowers.trainingkotlin

fun main() {
    fun createRange(start: Int, end: Int, isHalfOpen: Boolean = false) = if (isHalfOpen) {
        start until end
    } else {
        start..end
    }

    //An example of how overloading a function
    fun createRange(start: Char, end: Char, isHalfOpen: Boolean = false) = if (isHalfOpen) {
        start until end
    } else {
        start..end
    }


    fun printRange(range: IntRange) {
        for (number in range) print("$number\t")
        println()
    }

    fun printRange(range: CharRange) {
        for (number in range) print("$number\t")
        println()
    }

    val halfOpenRange = createRange(5, 10, true)
    printRange(halfOpenRange)

    val closedRange = createRange(1, 10)
    printRange(closedRange)

    val usingNamedArguments = createRange(isHalfOpen = true, start = 10, end = 15)
    printRange(usingNamedArguments)

    printRange(createRange(3, 5, isHalfOpen = true))

    val charRange = createRange('A', 'Z')
    printRange(charRange)

    fun parseCoordinates(input: String): Pair<Double, Double> {
        val latitudeLongitude = input.split(",")
        val latitude = latitudeLongitude[0].toDouble()
        val longitude = latitudeLongitude[1].toDouble()
        return latitude to longitude
    }

    val (latitude, longitude) = parseCoordinates("23.35,56.43")
    println("The latitude is: $latitude and the longitude is: $longitude")
}