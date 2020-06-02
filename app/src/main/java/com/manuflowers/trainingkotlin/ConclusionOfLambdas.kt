package com.manuflowers.trainingkotlin

fun main() {
    /* See Dwarves below. I want them organized like this:
    - Grouped by which names come before or after M in the alphabet.
    - Sorted by name length.
    - No dwarves with names less than four letters long.
    - Turn dwarves before M into a map, grouped by the first letters in their names
   */

    // --------------------------------------
    val lotsOfDwarves = listOf(
        listOf("Sleepy", "Grumpy", "Doc", "Bashful", "Sneezy"),
        listOf("Thorin", "Nori", "Bombur")
    )

    val (beforeM, afterM) = lotsOfDwarves.flatMap { dwarves ->
        dwarves.filter { it.length > 3 }
    }.sortedBy { -it.length }.partition { it < "M" }

    val groupedBeforeM = beforeM.groupBy { it.first() }

    println(beforeM)
    println(groupedBeforeM)
    println(afterM)

}