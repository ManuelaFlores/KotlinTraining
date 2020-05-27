package com.manuflowers.trainingkotlin

fun main() {
    //You can not fetch data from a set
    val userIds = setOf("ID1B", "ID2C", "ID3D", "ID4E")
    println(userIds)

    println("ID2C" in userIds)
    println(userIds.contains("ID2C"))

    val mutableIds = userIds.toMutableSet()
    println(mutableIds.add("ID100"))
    println(mutableIds)

    //If the element already exist it return false
    println(mutableIds.add("ID1B"))
    println(mutableIds)

    //Returns the set has changed from the operation
    println(mutableIds.remove("ID1B"))

    for (userId in userIds){
        println(userId)
    }

    val names = listOf("Tim", "Sam", "Ana", "Tom", "Tim")
    val uniqueNames = names.toSet()
    println(uniqueNames)
}