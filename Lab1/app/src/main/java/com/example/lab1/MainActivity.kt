//Exploring Data Classes in Kotlin
//FERNANDO RUIZ 23065
//PROGRAMACIÓN DE PLATAFORMAS MÓVILES

package com.example.lab1

import Driver

fun main() {
    val drivers = listOf(
        Driver("Max", "Ferrari", "Jamaica", 44),
        Driver("Roberto", "Mercedes", "England", 23),
        Driver("Diego", "Red Bull", "Canada", 50),
        Driver("Hugo", "Alfa Romeo", "Guatemala", 1)
    )
    // TASK 1
    for (driver in drivers) {
        driver.displayDriverInfo()
    }

    //TASK 2
    val driver1 = drivers[0]
    val driver2 = drivers[1]

    println(driver1 == driver2)
    println()
    println(driver1 != driver2)
    println()

    //TASK 3
    val driver3 = driver2.copy(name = "Mario", number = 12)
    println("Original: "+ driver2.name + " " + driver2.number + " " + driver2.team + " " + driver2.country)
    println("Copy: "+ driver3.name + " " + driver3.number + " " + driver3.team + " " + driver3.country)
    println()

    //TASK 4
    println("Name: "+ driver1.name)
    println("Team: "+ driver1.team)
    println("Country: "+ driver1.country)
    println("Number: "+ driver1.number)
    println()

    //TASK 5
    for (driver in drivers)
        println(driver.toString())
}