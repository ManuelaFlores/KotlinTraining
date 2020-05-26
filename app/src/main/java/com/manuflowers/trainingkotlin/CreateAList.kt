package com.manuflowers.trainingkotlin

fun main() {
    //this kind of list is immutable, you can not modify its content
    val countries = listOf("Russia", "USA", "The Netherlands") //and more
    println(countries)

    //The mutable list allows modification
    val countriesMutable = countries.toMutableList()
    countriesMutable.add("Germany")
    countriesMutable.add(1, "Greece")
    println(countriesMutable)
    countriesMutable.addAll(3,listOf("Austria", "Poland", "Hungary"))
    println(countriesMutable)

    val hasBeenInJapan = "Japan" in countriesMutable
    println(hasBeenInJapan)

    countriesMutable.remove("Japan")
    countriesMutable.removeAt(0)
    countriesMutable.removeAll(listOf("Russia", "Japan", "Germany", "USA"))
    println(countriesMutable)

    countriesMutable[2] = "Croatia"
    val combineList = countries + countriesMutable
    val emptyList = mutableListOf<String>()
    println(countriesMutable)
    println(combineList)
    println(emptyList)
    countriesMutable.clear()
    println(countriesMutable)
}