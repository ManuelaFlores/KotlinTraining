package com.manuflowers.trainingkotlin

fun main() {
    val myName = "Manuela"
    val nickName: String? = "Manu"
    val lastName: String?= null

    println(nickName)

    val nicknameLength = nickName?.length?.toDouble()
    println(nicknameLength)

    if (lastName != null) {
        println("My last name is ${lastName.length} characters long!")
    } else {
        println("I don't have a last name")
    }

}