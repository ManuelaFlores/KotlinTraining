package com.manuflowers.trainingkotlin

fun main() {
/*
  * Create a Pair which holds information about a Bank Account.
  * A Bank Account needs to have a Credit Card connected to it, and a balance. (Hint: You can nest a Triple in a Pair)
  * A Credit Card should have a Card number, security code, and the type of the card (e.g. "Visa", "MasterCard").
  *
  * Print out the data for the Account, while hiding the security code.
  * */
    val creditCard = Triple("1111 1111 1111 1111", 255, "Visa")
    val bankAccount = Pair(16000.0, creditCard)
    val (balance, creditCardInfo) = bankAccount
    val (creditCardNumber, _, creditCardBrand) = creditCardInfo

    println("This account has $balance, with the card number: $creditCardNumber and the card type: $creditCardBrand, security: ***")
}