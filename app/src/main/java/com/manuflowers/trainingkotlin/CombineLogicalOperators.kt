package com.manuflowers.trainingkotlin

fun main() {
    val myAge = 12
    val country = "USA"
    val isLegalDriving = (myAge >= 18 && country == "Perú") || (myAge >= 16 && country == "USA")
    println(isLegalDriving)

    if (isLegalDriving) {
        println("You can drive :D!")
    } else {
        println("You've got a bit time to go :(")
    }

    println( if (myAge >= 18) println("I'm an adult") else println("I'm still underaged!"))


}