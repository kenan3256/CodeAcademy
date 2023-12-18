package Lesson04


fun main() {

    var people = listOf<Persson>(
        Persson("Kenan", 32),
        Persson("Samir", 45),
        Persson("kamal", 35),
        Persson("amal", 75),
        Persson("Kamil", 65)
    )

    var namesStartingWithK = people
        .filter { persson -> persson.name.startsWith("K") }
        .map { it.name }



    namesStartingWithK.forEach { println(it) }
}

class Persson(val name: String, val age: Int)
