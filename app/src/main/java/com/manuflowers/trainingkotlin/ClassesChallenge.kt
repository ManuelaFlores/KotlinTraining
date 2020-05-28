package com.manuflowers.trainingkotlin

class Movie(
    private val name: String,
    private val genre: String,
    private val length: String
) {
    fun getData() = "$name is a $genre movie and lasts $length"
}

fun main() {
    /*
  * Challenge:
  *
  * Create a class which represents a Movie, a Video Game or a Song, whichever you prefer the most.
  * Add appropriate properties to the class, e.g. "name", "genre", "length" if it's a movie or a song.
  *
  * To those classes, add methods which format the properties in a String for you to print out.
  * Remember to add visibility modifiers where applicable, and get methods if needed.
  *
  * Create a few objects of the class type, and print out their formatted data.
  * */
    val pitchPerfects = Movie("Pitch Perfects", "Comedy", "2:45")
    val badBoys = Movie("Bad Boys", "Action", "1:45")
    println(pitchPerfects.getData())
    println(badBoys.getData())

}