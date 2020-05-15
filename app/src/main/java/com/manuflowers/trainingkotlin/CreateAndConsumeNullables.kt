package com.manuflowers.trainingkotlin

fun main() {
    val myName = "Manuela"
    val nickName: String? = "Manu"
    val lastName: String? = null

    println(nickName)

    val nicknameLength = nickName?.length?.toDouble()
    println(nicknameLength)

    if (lastName != null) {
        println("My last name is ${lastName.length} characters long!")
    } else {
        println("I don't have a last name")
    }

    if (nickName?.isEmpty() == true) {
        println("You don't have a nickname! It's length is ${nickName.length}")
    }

    /*val notNullableNickname = requireNotNull(nickName)
    println(notNullableNickname.length)*/

    val myNickname = nickName ?: myName
    println(myNickname)

    val lastBirthdayYear = 2020
    val myAge: Int? = 24
    val myAgeNotNull = myAge ?: return

    val yearOfBirth = lastBirthdayYear - myAgeNotNull
    println("I was born in $yearOfBirth")


}