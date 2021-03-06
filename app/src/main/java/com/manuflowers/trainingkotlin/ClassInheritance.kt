package com.manuflowers.trainingkotlin

/**
 * A class that inherits from another class is also know as a sub-class or a derived class
 * and the class of which inherits is know as a superclass or base class
 *
 * A kotlin class can inherit from only one class concept know as SINGLE INHERITANCE
 *
 * */

data class Grade(val courseName: String, val letter: Char, val credits: Double = 0.0)

open class PersonFive(var firstName: String, var lastName: String) {
    fun fullName() = "$firstName $lastName"
}

open class StudentTwo(
    firstName: String, lastName: String,
    var grades: MutableList<Grade> = mutableListOf<Grade>()
) : PersonFive(firstName, lastName) {

    open var isEligible: Boolean = true

    open fun recordGrade(grade: Grade) {
        grades.add(grade)
    }
}

class BandMember(firstName: String, lastName: String) : StudentTwo(firstName, lastName) {
    var minimumPractice: Int = 2
    override var isEligible: Boolean = true
        get() = grades.none { it.letter == 'F' }

    override fun recordGrade(grade: Grade) {
        super.recordGrade(grade)
        if (!isEligible) println("No more performing for: $firstName! Study, study, study!")
    }

}

class StudentAthlete(firstName: String, lastName: String) : StudentTwo(firstName, lastName) {

    override fun recordGrade(grade: Grade) {
        super.recordGrade(grade)
        isEligible = grades.filter { it.letter == 'F' }.size < 3
        if (!isEligible) println("Can't play the big game! Time to study")
    }
}

fun main() {
    val jon = PersonFive(firstName = "Jon", lastName = "Snon")
    val jane = StudentTwo(firstName = "Jane", lastName = "Snane")
    val victor = BandMember(firstName = "Victor", lastName = "Wooten")
    val marty = StudentAthlete(firstName = "Marty", lastName = "McWolf")
    println(jon.fullName())
    println(jane.fullName())
    println("${victor.fullName()} practices ${victor.minimumPractice} hours!")
    println("Can ${marty.fullName()} play in the big game: ${marty.isEligible}")

    val robotics = Grade(courseName = "Robotics", letter = 'B', credits = 3.0)
    jane.recordGrade(robotics)
    println(jon.fullName())
    println(jane.fullName())
    println(jane.grades)

    val utterFailureGrade = Grade(courseName = "Being a regular Human", letter = 'F')
    marty.recordGrade(utterFailureGrade)
    marty.recordGrade(utterFailureGrade)
    marty.recordGrade(utterFailureGrade)
    println("Can ${marty.fullName()} play in the big game: ${marty.isEligible}")

    victor.recordGrade(utterFailureGrade)
}