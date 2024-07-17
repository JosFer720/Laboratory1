//Algorithms Using Kotlin Excercise 2 and Exercise 3
//FERNANDO RUIZ 23065
//PROGRAMACIÓN DE PLATAFORMAS MÓVILES

package com.example.lab1

//EXERCISE 2
fun view(buildings: IntArray, direction: String): List<Int> {
    val result = mutableListOf<Int>()

    val step = if (direction == "EAST") 1 else -1
    val startIndex = if (direction == "EAST") 0 else buildings.size - 1
    var maxHeight = 0

    var currentIndex = startIndex
    while (currentIndex in buildings.indices) {
        val currentHeight = buildings[currentIndex]

        if (currentHeight > maxHeight) {
            result.add(currentIndex)
            maxHeight = currentHeight
        }

        currentIndex += step
    }

    if (direction == "WEST") {
        result.reverse()
    }

    return result.sorted()
}

//EXERCISE 3
fun noRepeat(letter: String): Pair<Int, Char>? {
    val count = mutableMapOf<Char, Int>()
    for (char in letter) {
        count[char] = count.getOrDefault(char, 0) + 1
    }
    for (i in letter.indices) {
        if (count[letter[i]] == 1) {
            return Pair(i, letter[i])
        }
    }
    return null
}

fun main() {
    val buildings = intArrayOf(3, 5, 4, 4, 3, 1, 3, 2)
    val direction1 = "WEST"
    val direction2 = "EAST"

    val indexWest = view(buildings, direction1)
    val indexEast = view(buildings, direction2)
    println("WEST: $indexWest")
    println("EAST: $indexEast")

    val string = "oceano"
    val firstLetter = noRepeat(string)
    if (firstLetter != null) {
        val (index, char) = firstLetter
        println("First non-repeating character is '$char' at index $index")
    } else {
        println("No non-repeating character found.")
    }
}