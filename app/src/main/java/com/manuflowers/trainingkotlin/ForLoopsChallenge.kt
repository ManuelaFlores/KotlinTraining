package com.manuflowers.trainingkotlin

fun main() {
    /*
  * Challenge 1:
  * Create a range of 20 numbers, and iterate over it, printing out the numbers.
  *
  * Challenge 2:
  * Iterate over the range in Challenge 1 again, but print every third number.
  *
  * Challenge 3:
  * Create a decreasing range of 15 numbers, and print every second number.
  * */

    val oneToTwentyRange = 1..20

    for (number in oneToTwentyRange) {
        print("$number ")
    }

    println("")

    for (number in oneToTwentyRange step 3){
        print("$number ")
    }

    println("")

    val decreasingFromFifteenToZero = 15 downTo 0
    for(number in decreasingFromFifteenToZero step 2) {
        print("$number ")
    }

    println("")
}