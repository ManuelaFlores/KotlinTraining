package com.manuflowers.trainingkotlin

/**
 * This is a documentation-style comment
 * You can reference things here, like the [main] function.
 * You can also reference parameters, like the [arguments].
 *
 * @param arguments
 * @author Manuela Flores
 * */
fun main(arguments: Array<String>) {
    // Data types:
    // When you want to declare a variable meaning that it's value can be changed, you use var
    // If you don't want the value change you use val
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

    val nameLength = fullName.length
    println(nameLength)
}