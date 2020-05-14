package com.manuflowers.trainingkotlin

fun main() {
    /* Challenge :
  * Check if the user data for registering an account is valid. Data is valid if:
  *
  * 1. Properties are not empty.
  * 2. Username has at least 6 characters.
  * 3. Password has at least 10 characters.
  * 4. The email contains a '@' and a ‘.`.
  *
  * Hint: use the `contains()` function on a String.
  *
  * Use `if` as an expression, to assign a respective error message if any of the cases fail! Then print it out.
  *
  * The appropriate String messages are:
  * 1. All values are empty -> "You must fill in your data!"
  * 2. Username is too short -> "Username needs to be at least 6 characters long!"
  * 3. Password is too short -> "Password needs to be at least 10 characters long!"
  * 4. Email doesn't contain a '@' or a '.' -> "Invalid email format."
  * 5. Every field is valid -> "Successful registration!"
  *
  * Print out the respective message!
  * */
    val userName = "Manuela"
    val password = "y0uCanN0tHack3dM3"
    val email = "fmanuela499@hotmail.com"

    // Validating if every property is empty and special validations
    val isUserNameEmpty = userName.isEmpty()
    val isPasswordEmpty = password.isEmpty()
    val isEmailEmpty = email.isEmpty()

    val messageRegistration: String = if (isUserNameEmpty || isPasswordEmpty || isEmailEmpty) {
        "You must fill in your data!"
    } else if (userName.length < 6) {
        "Username needs to be at least 6 characters long!"
    } else if (password.length < 10) {
        "Password needs to be at least 10 characters long!"
    } else if (!email.contains('@') || !email.contains('.')) {
        "Invalid email format."
    } else {
        "Successful registration!"
    }
    println(messageRegistration)
}