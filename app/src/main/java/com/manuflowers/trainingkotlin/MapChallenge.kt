package com.manuflowers.trainingkotlin

fun main() {
    /*
  * Create a map where each key is the name of a pet you have/had, and the value is the animal type that pet is.
  *
  * E.g. Key: "Max", Value: "German Shepard Dog".
  *
  * Add the values to the map, then remove a value, and finally, iterate over the map, printing out the entries.
  * */
    val myPets = mapOf<String, String>(
        "Blackie" to "Caniche Toy",
        "Greece" to "Hamster",
        "Chad" to "Rottweiler",
        "Temmuz" to "Shit-zu"

        )
    for ((key, value) in myPets) {
        println("My pet name's is $key and is a $value")
    }
}