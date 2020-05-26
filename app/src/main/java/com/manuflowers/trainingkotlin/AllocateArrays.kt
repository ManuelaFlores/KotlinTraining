package com.manuflowers.trainingkotlin

fun main() {
    /**
     * Collection ca be different by the way they store data in memory:
     * Difference in Collections:
     *  - Memory management
     *  - Ability to change(Mutability)
     *  - Performance: accessing data,adding or removing data and iterating over the values.
     * */
    val visitedCountries = arrayOf(
        "Russia", "USA", "Poland", "The Netherlands", "Romania", "Greece",
        "Germany", "Spain", "Portugal", "Serbia", "Hungary", "Austria"
    )
    println(visitedCountries)
    println(visitedCountries.size)
    println(visitedCountries[3])

    //The arrays can not increase in size
    visitedCountries + "Belgica"
    println(visitedCountries.size)

    //You can change the internal structure of an array:
    visitedCountries[1] = "The United States of America"
    println(visitedCountries[1])

    //Creating and array can be achieve through different approaches:
    //With a fixed size or an empty array:
    val sizeArray = Array(10) { "" }
    val emptyArray = emptyArray<String>()

    val arrayOfInt = intArrayOf(3, 4, 5, 6)
    println(arrayOfInt)

    val intArray = IntArray(10)
    println(intArray)

    println(visitedCountries.last())
    println(visitedCountries.first())
    println(visitedCountries.lastIndex)

    val currentCountry = "Spain"
    println(visitedCountries.contains(currentCountry))

    val hasVisitedSpain = currentCountry in visitedCountries
    val hasNoVisitedSpain = currentCountry !in visitedCountries
    println(hasNoVisitedSpain)
    println(hasVisitedSpain)

}