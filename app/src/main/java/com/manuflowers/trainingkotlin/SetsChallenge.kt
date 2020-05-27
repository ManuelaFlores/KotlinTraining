package com.manuflowers.trainingkotlin

fun main() {
    /*
 * Challenge:
 * - Create a list of strings, describing items on your table. If some items appear more than once, add them multiple
 * times to the list. E.g. you have two pens or four pieces of paper.
 *
 * - Turn that list into a set, using the `list.toSet()` function, and check if the duplicate items appear.
 * - Remove an item you don't really need on your desk, e.g. car keys.
 * - Iterate over the items, and print them out.
 */

    val itemsOfMyTable = listOf(
        "Books",
        "Pencils",
        "Clock",
        "CellPhone",
        "Papers",
        "Pens",
        "Markers",
        "Pens",
        "Markers",
        "Folders",
        "Books"
    )

    val newSet = itemsOfMyTable.toMutableSet()
    println(newSet)
    newSet.remove("CellPhone")

    for (value in newSet) {
        println(value)
    }

}