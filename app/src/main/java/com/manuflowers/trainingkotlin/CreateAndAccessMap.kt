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

    //-----

    moviesCollection["Comedy"] = mutableListOf("Pitch Perfects")
    println(moviesCollection)

    moviesCollection["Comedy"]?.add("Going in Style")
    println(moviesCollection)

    val removedActionGames = moviesCollection.remove("Action")
    println(removedActionGames)
    println(moviesCollection)

    /**
     * There are different layer of mutability and immutability :
     *  - Referential mutability:
     *  You can or can not change the reference of a value: val name = "Manu" can not change its value
     *  But just because something is a val it doesn't means that you can not change it, it means you can not change its reference
     *  - Internal mutability
     *  If you have a list which is an array of strings: listOf("Tim", "Sam", "Ana")
     *  you can change each of the strings internally, in that way you're not changing the structure(the array still have the same size and reference) :)
     *  - Content mutability:
     *  If you have a val which is a map so it can not change its references or its internal structure but you can still access a mutable value with in
     *  and change that value structure
     * */

    moviesCollection["Comedy"]?.add("Central Intelligence")
    moviesCollection["Romance"] = mutableListOf("Bridesmaid")

    println("-----")
    for(key in moviesCollection) {
        println(key)
    }

    for (value in moviesCollection.values) {
        println(value)
    }

    for ((key, value) in moviesCollection){
        println("This is the key $key and this is the value: $value")
    }
}