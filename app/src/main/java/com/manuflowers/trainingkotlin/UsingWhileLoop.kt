package com.manuflowers.trainingkotlin

fun main() {
    val countries = arrayOf(
        "Russia", "USA", "Poland",
        "The Netherlands", "Romania", "Greece",
        "Germany", "Spain", "Portugal",
        "Serbia", "Hungary", "Austria"
    )

    var i = 0
    while (i < countries.size) {
        println("Country at index $i is ${countries[i]}")
        i += 1
    }

    i = 0
    do {
        println("Country at index $i is ${countries[i]}")
        i += 1
    } while (i < countries.size)
}