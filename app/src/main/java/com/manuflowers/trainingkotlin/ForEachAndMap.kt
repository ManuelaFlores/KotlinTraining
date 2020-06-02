package com.manuflowers.trainingkotlin

fun main() {
// --------------------------------------
    var prices = arrayOf(1.50, 10.00, 4.99, 2.30, 8.19)
// --------------------------------------

// `forEach` - Loops over a collection and performs an operation

// `forEach` as a `for` loop
    /*for (price in prices) {
        println(price)
    }*/

    prices.forEach { println(it) }

    prices.forEach(::println)


// `map` - Loops over an collection, executes lambda code, returns a new collection

// `map` as a `for` loop
    /*val salePrices = mutableListOf<Double>()
    for (price in prices) {
        salePrices.add(price * 0.9)
    }*/
    val salePrices = prices.map { it * 0.9 }

    println(salePrices)

// `mapNotNull`
// --------------------------------------
    val userInput = listOf("meow!", "15", "37.5", "seven", "42")
// --------------------------------------
    val numbers = userInput.map { it.toIntOrNull() }
    println(numbers)

    //If you want null results won't be added,use mapNotNull
    val validInput = userInput.mapNotNull { it.toIntOrNull() }
    println(validInput)
}