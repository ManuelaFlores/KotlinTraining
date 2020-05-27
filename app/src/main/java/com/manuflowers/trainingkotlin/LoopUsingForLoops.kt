package com.manuflowers.trainingkotlin

fun main() {
    val countries = arrayOf(
        "Russia", "USA", "Poland",
        "The Netherlands", "Romania", "Greece",
        "Germany", "Spain", "Portugal",
        "Serbia", "Hungary", "Austria"
    )

    //This kind of range include the number from zero to ten
    val rangeFromZeroToTen = 0..10
    println(rangeFromZeroToTen)

    //But this kind not it only include the 0
    val exclusiveRange = 0 until 10
    println(exclusiveRange)

    for (index in rangeFromZeroToTen step 2) {
        print(index)
    }

    println("")

    for (index in 10 downTo 0) {
        print(index)
    }

    println("")

    for (countryIndex in 0..countries.lastIndex) {
        print("${countries[countryIndex]} ")
    }

    println("")

    for (country in countries){
        print("$country ")
    }

    println("")
}