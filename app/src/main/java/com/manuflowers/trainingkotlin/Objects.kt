package com.manuflowers.trainingkotlin

data class StudentFive(val id: Int, val firstName: String, val lastName: String) {
    val fullName = "$firstName $lastName"
}

object StudentsRegistry {
    val allStudents = mutableListOf<StudentFive>()

    fun addStudent(student: StudentFive) {
        allStudents.add(student)
    }

    fun removeStudent(student: StudentFive) {
        allStudents.remove(student)
    }
}
fun main() {

}