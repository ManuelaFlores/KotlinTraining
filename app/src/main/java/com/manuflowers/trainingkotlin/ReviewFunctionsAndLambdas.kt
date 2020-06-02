package com.manuflowers.trainingkotlin

fun main() {
    fun printRange() {
        for (number in 1..5) print("$number \t")
        println()
    }

    printRange()

    fun printRange(range: IntRange) {
        for (number in range) print("$number \t")
        println()
    }

    printRange(6..10)

    fun createRange(start: Int, end: Int, isHalfOpen: Boolean): IntRange {
        return if (isHalfOpen) {
            start until end
        } else {
            start..end
        }
    }

    val halfOpenRange = createRange(11, 15, false)
    printRange(halfOpenRange)

    val namedArguments = createRange(isHalfOpen = true, start = 100, end = 115)
    printRange(namedArguments)

    //after naming an argument  all the arguments after it must be named
    printRange(createRange(100, end = 101, isHalfOpen = false))

    fun createRange(start: Char, end: Char, isHalfOpen: Boolean = false) =
        if (isHalfOpen) start until end else start..end

    fun printRange(range: CharRange) {
        for (char in range) print("$char \t")
        println()
    }

    val closedRange = createRange('A', 'G')
    printRange(closedRange)

    fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }

    val addLambda = { a: Int, b: Int ->
        a + b
    }

    operateOnNumbers(2, 3) { a, b -> a + b }

    fun addFunction(a: Int, b: Int) = a + b
    operateOnNumbers(3, 6, Int::plus)


}