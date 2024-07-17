//FERNANDO RUIZ 23065
//Exploring Data Classes in Kotlin
//PROGRAMACIÓN DE PLATAFORMAS MÓVILES

package com.example.lab1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// TASK 1
fun main() {
    println("Team Details:")
    println("Name: Mario, Country: Germany, Number: 20")
    println("Name: Raul, Country: Switzerland, Number: 12")
    println("Name: Sofia, Country: Mexico, Number: 13")
}

class MainActivity : AppCompatActivity() {

    enum class Team(val team: String, val country: String, val number: Int) {
        MERCEDES("Mario", "Germany", 20),
        RED_BULL("Raul", "Switzerland", 12),
        FERRARI("Sofia", "Mexico", 13),
        MCLAREN("Lucia", "Italy", 14),
        ASTON_MARTIN("Rodrigo", "England", 15),
        ALPINE("Fernando", "Poland", 16),
        ALPHATAURI("Jose", "China", 17),
        ALFA_ROMEO("Diego", "Russia", 18),
        HAAS("Fabian", "Spain", 22),
        WILLIAMS("Antonio", "Monaco", 19)
    }

    //NO PUEDO PROBARLO PORQUE NO TENGO TELEFONO ANDROID PERO DEBERIA DE FUNCIONAR



    private fun printTeamDetails(team: Team) {
        //TASK 2
        when (team) {
            Team.MERCEDES -> println("Name: ${team.team}, Country: ${team.country}, Number: ${team.number}")
            Team.RED_BULL -> println("Name: ${team.team}, Country: ${team.country}, Number: ${team.number}")
            Team.FERRARI -> println("Name: ${team.team}, Country: ${team.country}, Number: ${team.number}")
            Team.MCLAREN -> println("Name: ${team.team}, Country: ${team.country}, Number: ${team.number}")
            Team.ASTON_MARTIN -> println("Name: ${team.team}, Country: ${team.country}, Number: ${team.number}")
            Team.ALPINE -> println("Name: ${team.team}, Country: ${team.country}, Number: ${team.number}")
            Team.ALPHATAURI -> println("Name: ${team.team}, Country: ${team.country}, Number: ${team.number}")
            Team.ALFA_ROMEO -> println("Name: ${team.team}, Country: ${team.country}, Number: ${team.number}")
            Team.HAAS -> println("Name: ${team.team}, Country: ${team.country}, Number: ${team.number}")
            Team.WILLIAMS -> println("Name: ${team.team}, Country: ${team.country}, Number: ${team.number}")
        }
    }
}