package com.manuflowers.trainingkotlin

class Pet(
    var name: String,
    val animalType: String
)

class PersonTwo(
    private val name: String,
    private val lastName: String?,
    private var age: Int,
    val pet: Pet
) {
    fun setAge(age: Int) {
        if (age in 0..150) {
            this.age = age
        } else {
            //invalid age
        }

    }

    fun getAge() = age

    fun getFullName() = "Full name: $lastName $name, Age: $age, Pet: ${pet.name}, ${pet.animalType}"
}

fun main() {
    /**
     * There are 4 types of modifiers in Kotlin
     *  - Public - or no modifier is the default one meaning any class which knows about the PersonTwo class can use its properties
     *  - Private - does the opposite only PersonTwo can use its properties
     *  - Internal is use when you have multiple modules in a project
     *  - Protected is similar to private but classes which inherit the protected class can also see the properties
     * */
    var dog = Pet("Temmuz", "Dog")
    val manuela = PersonTwo("Manuela", "Flores", 24, dog)
    println(manuela.getFullName())

    manuela.setAge(75)
    println(manuela.getAge())

    println(manuela.pet.name)

    dog.name = "blacky"

    dog = Pet("Blacky", "Dog")
    println(manuela.pet.name)
}