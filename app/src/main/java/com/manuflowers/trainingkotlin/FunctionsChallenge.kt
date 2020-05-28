package com.manuflowers.trainingkotlin

fun main() {
    /*
  * Challenge 1:
  *
  * Create a function which takes in two parameters - a name and a last name. Because not everyone has a last name,
  * leave the lastName parameter to be an empty String if it is not passed in.
  *
  * Then return how long the person's full name is.
  */

    /*
    * Challenge 2:
    *
    * Overload the function from the first challenge, by adding a list of Strings parameter, for middle names,
    * in case someone has one or more middle names.
    *
    * Use the function to return the full name length, for a name with and without middle names.
    * Remember to use named arguments if needed.
    * */

    fun getFullNameLength(name: String, lastName: String = "") =
        "the length of your full name is: ${name.length + lastName.length}"

    fun getFullNameLength(
        name: String,
        middleNames: List<String> = listOf(),
        lastName: String = ""
    ): String {
        return if (middleNames.isEmpty()) {
            "the length of your full name is: ${name.length + lastName.length}"
        } else {
            var middleNamesLength = 0
            for (middleName in middleNames) middleNamesLength += middleName.length
            "the length of your full name is: ${name.length + middleNamesLength + lastName.length}"
        }
    }


    println(getFullNameLength("Manuela", "Flores"))

    println(getFullNameLength("Manuela", listOf("Fátima", ""), "Flores"))

}