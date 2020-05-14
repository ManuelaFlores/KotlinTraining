package com.manuflowers.trainingkotlin

fun main() {
    val myAge = 24
    println(if (myAge >= 24) println("I'm an adult") else println("I'm still underaged"))

    if (myAge >= 18) {
        val country = "Perú"

        if (country == "USA") {
            println("You're allowed to drive, but not to drink!")
        } else if (country == "Perú") {
            println("You're allowed both, drink and drive(not at the same time ;)!)")
        }
    }

    val yearOfBirth = 1996

    // Is a good practice specify the type we are returning in this kind of blocks because of the type inference
    // For this reason type inference is not always the best thing :(
    val generationCohort: String = if (yearOfBirth > 1964 && yearOfBirth < 1980) {
        "Generation X"
    } else if (yearOfBirth > 1979 && yearOfBirth < 1995) {
        "Millenial"
    } else {
        "Generation Z"
    }
    println(generationCohort)
}