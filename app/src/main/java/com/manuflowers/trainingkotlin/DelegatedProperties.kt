package com.manuflowers.trainingkotlin

import kotlin.properties.Delegates

/**
 * For more complicated initializations you may want to pass the initialization off
 * to another object or delay the initialization from when the instance is created.
 * You may also want to observe when a property changes. For those kinds of cases you can use
 * delegated properties
 * "Do not confuse delegated properties with getters and setters"
 * Delegated properties can not have custom accessors
 *
 * If you have a property that might take some time to calculate
 * and you don't want to slow things down until you actually need the property: Say hello to lazy properties
 *
 * */

class LevelOfGame(val id: Int, val boss: String) {


    var unlocked: Boolean by Delegates.observable(false) { _, oldValue, newValue ->
        if (newValue && id > highestLevel) {
            highestLevel = id
        }
    }

    companion object {
        var highestLevel = 1
    }
}

class LightBulb {
    companion object {
        const val maxCurrent = 40
    }

    var current by Delegates.vetoable(0) { _, _, newValue ->
        if (newValue > maxCurrent) {
            println("Current to high, falling back to previous setting")
            false
        } else {
            true
        }
    }
}

fun main() {

    val light = LightBulb()
    light.current = 90000
    println(light.current)
    light.current = 40
    println(light.current)

    val level1 = LevelOfGame(id = 1, boss = "Outside Cat")
    val level2 = LevelOfGame(id = 2, boss = "Laser Point")
    val level3 = LevelOfGame(id = 3, boss = "Mysterious Attic Sound")
    val level4 = LevelOfGame(id = 4, boss = "Vacuum Cleaner")

    level1.unlocked = true
    println("Highest level ${LevelOfGame.highestLevel}")

    level3.unlocked = true
    println("Highest level ${LevelOfGame.highestLevel}")
}