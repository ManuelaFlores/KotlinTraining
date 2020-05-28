package com.manuflowers.trainingkotlin

class Person(
    val name: String,
    val lastName: String?,
    var age: Int
)

class Empty

fun main() {
    val manu = Person("Manu", "Flores", 24)

    println(manu)
    println("Name: ${manu.name}, Last name: ${manu.lastName}, Age: ${manu.age}")

    val tom = Person("Tom", "Kaulitz", 29)
    println("Name: ${tom.name}, Last name: ${tom.lastName}, Age: ${tom.age}")

    val manuClone = manu
    manuClone.age = 25

    println(manu.age)
    println(manuClone.age)

    val manuTwo = Person("Manu", "Flores", 25)
    println("---")
    println(manu == tom)
    println(manu == manuClone)
    println(manu === manuClone)
    println(manuTwo == manu)

}