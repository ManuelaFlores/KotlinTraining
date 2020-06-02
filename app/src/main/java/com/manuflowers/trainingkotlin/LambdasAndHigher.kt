package com.manuflowers.trainingkotlin

fun main() {
    //Lambdas are known as anonymous functions, lambdas are also synonymous with closures
    /**
     * Closures are called closures because they have the ability close over the variables and
     * constants within the closure own scope
     * Lambdas also introduce a new scope and inherit all entities visible to the scope
     * */

    var counter = 0
    val incrementCounter = {
        counter += 1
    }

    incrementCounter()
    incrementCounter()
    incrementCounter()
    incrementCounter()
    incrementCounter()
    println(counter)

    //This is an example of a high order functions
    //"A function that can return another function or take other functions as parameters"
    //
    fun countingLambda(): () -> Int {
        var counter = 0
        val incrementCounter: () -> Int = {
            counter += 1
            counter
        }
        return incrementCounter
    }

    val counter1 = countingLambda()
    val counter2 = countingLambda()

    println(counter1())
    println(counter1())

    println(counter2())
    println(counter2())
    println(counter2())
    println(counter2())
}