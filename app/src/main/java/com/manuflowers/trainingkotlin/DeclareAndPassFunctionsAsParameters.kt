package com.manuflowers.trainingkotlin

fun validatePassword(password: String) = password.length >= 10
fun main() {
    val email: String? = "fmanuela499@gmail.com"
    val password: String? = "p455w0rd"

    fun validateString(input: String?, inputType: String?) =
        if (input == null || input.isBlank()) {
            false
        } else if (inputType == "Password") {
            input.length >= 10
        } else if (inputType == "Email") {
            input.contains('@')
        } else {
            println("Can not verify this input")
            false
        }

    fun validateString(input: String?, validator: (String) -> Boolean) =
        if (input == null || input.isBlank()) {
            false
        } else {
            validator(input)
        }

    validateString("Hello world", "Welcome message")

    println()

    val isValidEmail = validateString(email, "Email")
    println(isValidEmail)

    //Call validators inside a lambda is not a good practice because if you
    // have a lot of passwords validators, you'll have to change the code in all places!
    val isValidPassword = validateString(password) { input -> input.length >= 10 }
    println(isValidPassword)

    //This way is another way to pass functions as parameters, is called function reference:
    //using the double calling operator to reference to a function
    // with has the same signature as the required parameter: one string as an input and one boolean as an output
    val isValidPasswordAgain = validateString(password, ::validatePassword)

    println("----")
    val passwordValidator = ::validatePassword
    println(passwordValidator)

    val validator: (String?) -> Boolean = { input ->
        input != null && validatePassword(input)
    }
    println(validator)
}