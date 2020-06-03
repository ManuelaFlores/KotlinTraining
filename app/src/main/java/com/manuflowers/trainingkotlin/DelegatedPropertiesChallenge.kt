package com.manuflowers.trainingkotlin

import kotlin.properties.Delegates

/*
Challenge 1:
 Rewrite the `IceCream` class below:
 1. Use a default value for the name property.
 2. Lazily initialize the `ingredients` list.
*/

class IceCream {
    var name: String = "Vanilla"

    val ingredients: ArrayList<String> by lazy {
        arrayListOf("milk", "some fruit")
    }
}

/*
Challenge 2:
Below is a `SpaceCar` and `SpaceBattery` class.
Dive into the inner workings of the car and rewrite the `SpaceBattery` class
below with delegated property observer functionality:

1. Add a `lowCharge` property of Boolean type to the class.
2. Flip the `lowCharge` Boolean when the `level` drops below 10%.
3. Ensure that when the tank fills back up, the `lowCharge` warning will turn off.
4. Add a `SpaceBattery` property to `SpaceCar`, make one, and charge it up. Then fly around for awhile.
*/

class SpaceCar(
    val make: String,
    val color: String,
    var spaceBattery: SpaceBattery
)

class SpaceBattery {
    var lowCharge = false
    var level by Delegates.observable(100.0) { _, oldValue, newValue ->
        lowCharge = newValue<= 10.0
    }
}

fun main() {
    // ~~~Challenge 1~~~
    // Make a new instance of IceCream
    val iceCream = IceCream()
    // Give it a name other than the default
    iceCream.name = "Other name"
    // Add some ingredients!
    iceCream.ingredients.add("Milky cream")
    iceCream.ingredients.add("Peanuts")
    println(iceCream.ingredients)

    // ~~~Challenge 2~~~
    // Make a SpaceCar!
    val spaceCar = SpaceCar("TOYOTa", "RED", SpaceBattery())
    // Charge the battery!
    spaceCar.spaceBattery.level = 59.0
    println(spaceCar.spaceBattery.lowCharge)

    // Fly around for awhile.

}