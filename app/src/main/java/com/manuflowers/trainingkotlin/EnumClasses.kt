package com.manuflowers.trainingkotlin

import com.manuflowers.trainingkotlin.DaysOfWeek.*

enum class DaysOfWeek(val isWeekend: Boolean = false) {
    Monday(false), Tuesday, Wednesday, Thursday, Friday, Saturday(true), Sunday(true);

    fun daysUntil(other: DaysOfWeek): Int {
        return if(this.ordinal < other.ordinal) {
            other.ordinal - this.ordinal
        } else {
            other.ordinal - this.ordinal + values().count()
        }
    }
}

fun main() {
    for(day in values()) {
        println("Day $${day.ordinal}: ${day.name}, is weekend: ${day.isWeekend} ")
    }

    val friday = Friday
    println(Tuesday.daysUntil(friday))

    val today = Tuesday
    fun singAboutToday(today : DaysOfWeek){
        when(today) {
            //Monday -> println("I don't care if $today's blue")
            //Tuesday -> println("$today's gray")
            //Wednesday -> println("and $today's too")
            //Thursday -> println("$today: I don't care but you!")
            Friday -> println("It's $today, I'm in love")
            //Saturday -> println("$today ... wait")
            //Sunday -> println("$today always comes too late")
            else -> println("I don't feel like singing")
        }
    }

    for (day in DaysOfWeek.values()) {
        singAboutToday(day)
    }
}