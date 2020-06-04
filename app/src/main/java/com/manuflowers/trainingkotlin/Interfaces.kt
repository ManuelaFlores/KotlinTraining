package com.manuflowers.trainingkotlin

interface Vehicle {
    fun accelerate()
    fun stop()
}

class Unicycle : Vehicle {
    var peddling = false

    override fun accelerate() {
        peddling = true
        println("Yeaaahhh")
    }

    override fun stop() {
        peddling = false
        println("Noooooo")
    }
}

enum class Direction {
    LEFT, RIGHT
}

interface TurningVehicle : Vehicle {
    fun turn(direction: Direction = Direction.RIGHT)
    fun description(): String
}

interface Spacey {
    val triblesCount: Int
}

interface SpaceVehicle : Vehicle, Spacey {

    val name: String
        get() = "SpaceVehicle"

    override fun accelerate() {
        println("Proceed to Hyperspace!")
    }

    override fun stop() {
        println("Whooaaa, Slow down!")
    }
}

class LightFreighter : SpaceVehicle {
    override val triblesCount: Int = 0

    var hyperDriveBusted: Boolean = false

    override fun stop() {
        hyperDriveBusted = true
        println("HyperDrive failure again ..!")
    }
}

class Starship : SpaceVehicle {
    override val triblesCount: Int
        get() = Int.MAX_VALUE

    override val name: String
        get() = "Starship!"
    override fun accelerate() {
        println("Warp factor 9, please")
    }

    override fun stop() {
        super.stop()
        println("That kind of hurt")
    }
}

fun main() {
    val unicycle = Unicycle()
    unicycle.accelerate()
    unicycle.stop()

    val falcon = LightFreighter()
    falcon.accelerate()
    falcon.stop()

    val enterprise = Starship()
    enterprise.accelerate()
    enterprise.stop()

}