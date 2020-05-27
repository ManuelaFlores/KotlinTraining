package com.manuflowers.trainingkotlin

fun main() {
    /*
  * Challenge 1:
  * Print numbers from 1 to 15, using a while loop.
  *
  * Challenge 2:
  * Create an array or list of names. Using a do-while loop, and an iterator, print the names in a reverse order.
  * Make sure to check that the iterator is within the bounds of the array's size. (from `lastIndex` to 0).
  * */

    var i = 0
    while (i < 15) {
        i++
        println(i)
    }


    val listOfNames = arrayOf("Rosa", "Tim", "Jim", "Sam", "Gia", "Ana")
    var index = listOfNames.lastIndex

    do {
        if (index > listOfNames.size || index < 0) return

        println(listOfNames[index])
        index -= 1
    } while (index > 0 && index < listOfNames.size)
}