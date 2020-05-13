package com.manuflowers.trainingkotlin

fun main() {
    var myAge = 24
    val myName = "Manuela"
    val lastName = "Flores"
    val weight = 56.0

    println(myName)
    println("I am $myAge years old")

    myAge += 1
    println("I am $myAge years old")

    println("$myName $lastName is $myAge years old and weighs $weight kg")

    val fullName = "$myName $lastName"
    println(fullName)

    val ageAsString = myAge.toString()
    println(ageAsString)

    val ageFromString = "35".toInt()
    println(ageFromString)

    val nameLength =fullName.length
    println(nameLength)
}