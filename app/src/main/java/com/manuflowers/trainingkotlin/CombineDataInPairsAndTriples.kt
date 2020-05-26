package com.manuflowers.trainingkotlin

fun main() {
    /**
     * In Kotlin there are four types to store values in collections and there are
     *  - Lists
     *  - Arrays
     *  - Maps
     *  - Sets
     *  Lists and arrays  and values can store multiple elements, you can have duplicates here.
     *  Sets are use to store data which is unique and can not have duplicates.
     *  Maps are use to define key-value pairs just like words in a dictionary.
     * */
    val fullName = Pair<String, String>("Manuela", "Flores")
    println("My name is ${fullName.first} and my last name is ${fullName.second}")

    /**
     * The second way to access its values is called destructuring: There are a few coding structures
     * which allow yo to split up the construct to all their internal values
     * */
    val (name, lastName) = fullName
    println("My name is $name and my last name is $lastName")

    val birthday = Triple(16, 2, 1996)
    val person = Pair("Manuela Flores", birthday)

    //Access the value by ordering:
    val nameUsingOrdering = person.first
    val birthDayUsingOrdering = person.second

    //Access the values by destructuring
    val (fullname, bday) = person
    val (day, month, _) = birthday

    println("$fullname  was born on $day/$month, year unknown!")
    val yearOfBirth = birthday.third
    println("$yearOfBirth")
}