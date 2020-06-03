package com.manuflowers.trainingkotlin

/*
Challenge 1:
Check out the Wizard class below and run the project.
Right now, `fullName` doesn't change when you update a wizard's first or last name.
Change the Wizard's fullName to a read-only computed property to fix that!

**Bonus Challenge**
Add a custom setter that will split a full name into a first and last name.
Only set firstName and lastName if the value contains exactly two names separated by a space
Hint: Use `.split(" ")` to split the value passed in into a list of strings
*/

/*
Challenge 2:
Add a "commonMagicalIngredients" list as a companion object property on Wizard.
Fill it with any magical ingredients you like!
*/

class Wizard(var firstName: String, var lastName: String) {
    var fullName
        get() = "$firstName $lastName"
        set(newFullName) {
            val fullNameList = newFullName.split(' ')
            if (fullNameList.size == 2) {
                firstName = fullNameList.first()
                lastName = fullNameList.last()
            } else {
                println("$newFullName Is not a proper name for wizard!")
            }
        }

    companion object {
        var commonMagicalIngredients = mutableListOf(
            "eye of the haystack nedle",
            "The force",
            "Wow-wow Sauce!"
        )
    }
}

fun main() {
    val wizard = Wizard("Hermione", "Sidious")
    println(wizard.fullName)

    wizard.lastName = "Skywalker"
    println(wizard.fullName)

    wizard.fullName = "SeverusWenderlich"
    println("First name: ${wizard.firstName}, lastName: ${wizard.lastName}")

    wizard.fullName = "Dracula the grey"
    println("First name: ${wizard.firstName}, lastName: ${wizard.lastName}")

    wizard.fullName = "Ada Lopez"
    println(wizard.fullName)

    Wizard.commonMagicalIngredients.add("Meow of cat")
    println(Wizard.commonMagicalIngredients)
}