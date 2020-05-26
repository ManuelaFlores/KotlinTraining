package com.manuflowers.trainingkotlin

fun main() {
    /*
     * Challenge:
     *
     * Create an Array of your five favorite games - be it board games, card games, or video games.
     * Change an element within the Array, and print out the second game.
     *
     * Transform the array to a list that can change its contents, and add two more games you'd like to play or finish.
     *
     * Then remove a game you've played most recently.
     *
     * Print out the list of games you ended up with!
     *
     * Finally, check if the removed game is still in the list!
     * */

    val favoriteGames = arrayOf("Pictionary", "One Card", "Mario Bros", "Pacman", "Snake")
    favoriteGames[0] = "Monopoly"
    println(favoriteGames[1])

    val mutableList = favoriteGames.toMutableList()
    mutableList.addAll(listOf("Jumanji", "Doom"))

    val gameEndedUp = "Monopoly"

    val gamesEndedUp = listOf("Pacman", "Monopoly", "Snake")
    mutableList.remove(gameEndedUp)

    println(gameEndedUp)
    println(mutableList)

    val isMonopolyInTheList = gameEndedUp in mutableList
    println(isMonopolyInTheList)


}