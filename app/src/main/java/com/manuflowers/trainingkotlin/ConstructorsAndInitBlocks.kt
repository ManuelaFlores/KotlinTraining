package com.manuflowers.trainingkotlin

open class StudentThree(
    val firstName: String, val lastName: String,
    var grades: MutableList<Grade> = mutableListOf<Grade>()
) {

    open fun recordGrade(grade: Grade) {
        grades.add(grade)
    }
}

class BandMemberTwo(firstName: String, lastName: String) : StudentThree(firstName, lastName) {
    var minimumPractice: Int = 2

    val isEligible
        get() = grades.none { it.letter == 'F' }

    constructor(firstName: String, lastName: String, minimumPractices: Int) : this(
        firstName,
        lastName
    ) {
        this.minimumPractice = minimumPractices
    }

    constructor(transfer: BandMemberTwo) : this(
        transfer.firstName,
        transfer.lastName,
        transfer.minimumPractice
    ) {
        grades = transfer.grades

        if (!isEligible) minimumPractice += 1
        println("(transfer constructor) Practice for $minimumPractice hours!")
    }

    init {
        if (!isEligible) minimumPractice += 1
        println("(init) Practice for $minimumPractice hours!")
    }

    init {
        if (!isEligible) minimumPractice += 1
        println("(init2) Practice for $minimumPractice hours!")
    }

}

fun main() {
    val bill = BandMemberTwo(firstName = "Bill", lastName = "Kaulitz")
    bill.recordGrade(Grade(courseName = "Motivational Speaking", letter = 'A'))
    bill.recordGrade(Grade(courseName = "Guitar 101", letter = 'F'))

    val transferredBill = BandMemberTwo(transfer = bill)
    println(transferredBill.grades)

    val ted = BandMemberTwo(firstName = "Ted", lastName = "Joe Alexander", minimumPractices = 7)

}