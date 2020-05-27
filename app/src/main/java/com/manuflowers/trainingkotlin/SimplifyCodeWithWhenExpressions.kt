package com.manuflowers.trainingkotlin

fun main() {
    val myAge = 24
    val message = when (myAge) {
        in 0..12 -> {
            "Still a young girl :)"
        }
        in 13..19 -> {
            "Teenager"
        }
        in 20..29 -> {
            "In my twenties"
        }
        in 30..39 -> {
            "In my thirties"
        }
        in 40..50 -> {
            "In my forties"
        }
        else -> {
            "Wise woman :]"
        }
    }

    println(message)

    val email: String? = "email@email.com"
    val password: String? = "iLoveKotlin"

    when {
        email == null || email.isEmpty() -> println("You need to choose an email")

        "@" !in email -> println("Your email is invalid :( !")

        password == null || password.isEmpty() -> println("You need to choose an password")

        password.length < 10 -> println("Password not strong enough!")

        else -> println("Email length: ${email.length}; password length: ${password.length}")
    }
}