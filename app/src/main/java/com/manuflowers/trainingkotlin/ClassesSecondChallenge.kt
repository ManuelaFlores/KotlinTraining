package com.manuflowers.trainingkotlin

data class MovieTwo(
    val name: String,
    val genre: String,
    val length: String
)

fun main() {
    /*
  * Challenge:
  *
  * Following the first challenge in this course, change the classes from the first challenge to be `data` classes
  * instead, and remove unnecessary code, such as the formatting method, to rely on `toString()` instead.
  *
  * Also make sure the class is immutable (use `val`s instead of `var`s, public modifiers for access).
  *
  * Create a copy of a certain object you created, and compare it for data equality and identity (reference equality).
  *
  * Destructure the object, and use the properties to print out its data.
  * */
    val pitchPerfects = MovieTwo("Pitch Perfects", "Comedy", "2:30")
    val pitchPerfectCopy = pitchPerfects.copy(length = "3:00")
    println(pitchPerfects == pitchPerfectCopy)
    println(pitchPerfects === pitchPerfectCopy)

    val (movieName, movieGenre, movieLength) = pitchPerfectCopy
    println("Movie:$movieName, Genre: $movieGenre, Length: $movieLength")
}