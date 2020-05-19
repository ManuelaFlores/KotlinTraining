package com.manuflowers.trainingkotlin

fun main() {
    /*
 * Challenge:
 * Create several values describing you as a person, in pieces of data. The pieces of data are as follows:
 * - Name
 * - Last name
 * - Nickname (if exists)
 * - Country
 * - Age
 *
 * Then find your year of birth using your age, and print out your data in the following format.
 *
 * Note: If you're underaged (< 18 years old), omit your `name`, and if you don't have a nickname, remove it from
 * the format.
 *
 * Format:
 * "$name '$nickname' $lastName, born on $yearOfBirth, in $country", if you have a nickname, otherwise, remove the
 * nickname from the format.
 * */
    val name = "Manuela"
    val lastName = "Flores"
    val nickName: String? = "Manu"
    val country = "Perú"
    val age = 24
    val yearOfBirth = 2020 - age
    val nameToPrint = if (age >= 18) name else ""
    val nicknameToPrint: String? = nickName ?: ""
    println("$nameToPrint $lastName, born on $yearOfBirth, in $country and her nickname is $nicknameToPrint")
}