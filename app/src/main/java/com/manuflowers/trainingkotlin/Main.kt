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

    //Booleans
    val isProgrammingAwesome = true
    println("Is programming awesome? $isProgrammingAwesome")

    val isLegalDrivingAge = myAge >= 18
    println(isLegalDrivingAge)

    val ageTim = 27
    val isTimOlder = ageTim > myAge
    println(isTimOlder)

    val yearOfBirth = 1996
    val isBornInTwentiethCentury = yearOfBirth < 2000
    println(isBornInTwentiethCentury)

    val strangerName = "Tim"
    println(myName == strangerName)

    val areNamesDifferent = myName != strangerName
    println(areNamesDifferent)

    // Any is type from which all other types in coding come out
    // is an object which means that it has a special unique reference in memory since you create two separate instances
    val firstObject = Any()
    val secondObject = Any()

    //To check if they point to the same reference or memory address we are going to use the triple equals operator
    println(firstObject === secondObject)

    //Triple equals operator has its counterpart
    println(firstObject !== secondObject)

    val isNameEmpty = myName.isEmpty()
    println(isNameEmpty)

    val password = "1234567890"
    val isPasswordSecure = password.length >= 10
    println(isPasswordSecure)
    println(myName.length == strangerName.length)
}