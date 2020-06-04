package com.manuflowers.trainingkotlin

/*
* A subclass can be treated as its own type or as any of its superclasses
* */
fun main() {
    val jon = PersonFive(firstName = "Jon", lastName = "Snon")
    val jane = StudentTwo(firstName = "Jane", lastName = "Snane")
    val victor = BandMember(firstName = "Victor", lastName = "Wooten")
    val marty = StudentAthlete(firstName = "Marty", lastName = "McWolf")

    val persons = arrayOf(jon, jane, victor, marty)
    val students = arrayOf(jane, victor, marty)

    persons.forEach { person ->
        println("${person.fullName()} is a person!")
        if (person is StudentTwo) println("${person.grades}")
    }

    //up casting or unsafe casting is whe you're casting from a subclass to a superclass
    val student = victor as StudentTwo

    //down casting is the opposite and is also know as safe casting
    val bassist = student as? BandMember

    fun afterClassActivity(student: StudentTwo): String {
        return "Goes home!"
    }

    fun afterClassActivity(student: BandMember): String {
        return "Practices for ${student.minimumPractice} hours!"
    }

    println(afterClassActivity(victor as StudentTwo))
}