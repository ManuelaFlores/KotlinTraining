package com.manuflowers.trainingkotlin

fun main() {
    //A map is more like an object, each index here is like a key to which you can add or remove properties
    val moviesCollection = mutableMapOf<String, MutableList<String>>()

    moviesCollection.put("Action", mutableListOf("Bad Boys", "Fast and Furious", "Black Widow"))
    print(moviesCollection)

    val actionGames = moviesCollection.get("Action")

    println(actionGames)

    val comedyFilms = moviesCollection.get("Comedy")
    println(comedyFilms)

    val authenticationHeaders = mapOf(
        "API_KEY" to "your-api-key",
        "Authorization" to "auth token",
        "content/type" to "application/json"
    )
    println(authenticationHeaders)
}