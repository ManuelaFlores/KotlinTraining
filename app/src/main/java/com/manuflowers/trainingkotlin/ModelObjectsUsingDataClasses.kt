package com.manuflowers.trainingkotlin

data class PetTwo(
    val name: String,
    val animalType: String
)

data class PersonThird(
    val name: String,
    val lastName: String?,
    val age: Int,
    val pet: PetTwo
)

fun main() {
    val dog = PetTwo("Temmuz", "shit-zu")
    val manuela = PersonThird("Manuela", "Flores", 24, dog)
    println(manuela)

    val olderManu = manuela.copy(age = manuela.age + 20)
    println(olderManu)

    val (name,_ , age, pet) = olderManu
    println(pet)

    val firstName = manuela.component1()
    println(firstName)

    var manuTwo = manuela
    println(manuTwo == manuela)
    println(manuTwo === manuela)

    //The information is the same but the reference not
    manuTwo = manuela.copy()
    println(manuTwo == manuela)
    println(manuTwo === manuela)

}