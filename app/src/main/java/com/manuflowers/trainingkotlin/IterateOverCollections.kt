package com.manuflowers.trainingkotlin

fun main() {
    val daysOfWeeks =
        arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    for (day in daysOfWeeks) {
        if (day == "Monday") {
            continue
        }
        println("Working!")
        if (day == "Thursday") {
            println("Get ready for the weekend!")
            break
        }
    }

    val matrix = MutableList<MutableList<String>>(5) { MutableList(5) { "" } }

    for (row in 0..matrix.lastIndex) {
        for (column in 0..matrix.lastIndex) {
            matrix[row][column] = "$row: $column "
        }
    }

    println(matrix)
    println("-----")

    for (row in matrix) {
        println(row)
    }

    val thirdRowFifthColumnElement = matrix[2][4]
    println(thirdRowFifthColumnElement)

    row@ for (row in 0..5) {
        column@ for (column in 0..5) {
            if (column == 2 && row == 2) {
                break@row
            }
            print("x\t")
        }
        println()
    }
}