package com.manuflowers.trainingkotlin

open class Animal() {
    open fun speak() {

    }
}

class WildAnimal(var isPoisonous: Boolean) : Animal() {

}

open class PetThree(val name: String) : Animal() {
    open fun play(message: String) {
        println(message)
    }

    override fun speak() {
        super.speak()
        println("Hi I'm $name")
    }
}

class Dog(name: String) : PetThree(name) {
    var favoriteToys = mutableListOf<String>()

    override fun speak() {
        super.speak()
        println("Wuf Wuf ...")
    }

    override fun play(message: String) {
        super.play(message)
        println("I love run around the park")
    }

    fun addNewFavoriteToy(toy: String) {
        favoriteToys.add(toy)
    }
}

/*
Challenge 1 - Building a Class Hierarchy
Create a class named `Animal` that has…
1. a method named `speak()` that does nothing.

Create two `Animal` subclasses...
1. `WildAnimal` that...
  - has an `isPoisonous` property, that is a `Boolean`
2. `Pet` that...
  - has a stored property named `name`, that is a `String`
  - has a `play()` method that prints out a message
  - overrides `speak()` - It should print out a message

Create one subclass of your choice of `WildAnimal` or `Pet`. It should do at least one of the following:
 - override `speak()`
 - override `play()`
 - Add a new property with custom accessor
 - Add a new method
*/


/*
Challenge 2 - Overriding & Polymorphism
- Write a function that takes an `Animal` and does something different depending on what subclass it is.
  You'll need to do some safe casting and null checks!
- Create at least one instance of each class from the first challenge.
- Create an array that contains all of the instances.
- Call the function with each of your instances using a loop or whatever other method you'd like!
*/

fun main() {
    fun evaluateAnimal(animal: Animal) {
        when {
            (animal as? WildAnimal) != null -> println("Warning I'm a wild animal >.<!: ${animal.isPoisonous}")
            animal is Dog -> println("I'm so adorable ^^ ${animal.favoriteToys}")
            animal is PetThree -> println("I'm very friendly :3 ${animal.play("Let's play")}")
            else -> println("It's animal! you know, the Muppet?")
        }
    }

    val animal = Animal()
    val snake = WildAnimal(true)

    val cat = PetThree("Michi")

    val temmuz = Dog("Temmuz")
    temmuz.addNewFavoriteToy("Frisbee")
    temmuz.addNewFavoriteToy("Ball")

    val animals = listOf(animal, snake, cat, temmuz)

    animals.forEach { evaluateAnimal(it) }

}