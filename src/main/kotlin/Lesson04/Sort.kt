package Lesson04


fun main() {

    var people = listOf<Persson1>(
        Persson1("Kenan", 32),
        Persson1("Samir", 45),
        Persson1("kamal", 35),
        Persson1("amal", 75),
        Persson1("Kamil", 65)
    )
    var names = people.
    filter {persson1 ->persson1.name.startsWith("S")   }
        .sortedBy { it.age }
        .map { it.name }

    names.forEach{it-> println(it)}

}

class Persson1(val name: String, val age: Int)
