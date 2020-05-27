package com.manuflowers.trainingkotlin

fun main() {
    /*
  * Challenge:
  *
  * Use a when expression to return which century an arbitrary year is from (as a String).
  * Cover at least the last three centuries, and return “This was looong ago!” for others.
  *
  * Then print out the returned value. Use Ranges for year comparison.
  * */
    val currentYear = 2020

    val message = when (currentYear) {
        in 2000..2099 -> "Is the twenty-first century"
        in 1900..1999 -> "Is the twenty century"
        in 1800..1899 -> "Is the nineteen century"
        else -> "This was looong ago!"
    }

    println(message)
}