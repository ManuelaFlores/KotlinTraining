package com.manuflowers.trainingkotlin

fun main() {
/*
  * Challenge:
  * Simulate a game where you have to find the X in a matrix!
  *
  * Step 1: Choose the matrix size. E.g. 3x3
  * Step 2: Create the matrix (Hint: You can create an Array<Array<String>>, or a List<List<String>>).
  *
  * Step 3: Fill the matrix of your chosen size. When filling elements use the
  * '.' symbol for all of the elements, instead of 1 of your choice - e.g. the element in the third row,
  * second column in the matrix. For that element, put out the X symbol.
  *
  * Step 4: Create another nested loop which will find that element, and once it does, print its matrix coordinates.
  * Once you print the coordinates out, stop iterating over the matrix.
  * */
    val matrix = Array<Array<String>>(9) { Array(9) { "·" } }

    matrix[3][2] = "X"

    println("")

    row@ for (row in 0..matrix.lastIndex) {
        column@ for (column in 0..matrix.lastIndex) {
            if (matrix[row][column] == "X") {
                println("Found X at: $row $column")
                break@row
            }
        }
    }

}