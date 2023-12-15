package org.example.Lesson02



fun main (){
    var dog=TheDog("whit", "meat")

}
open class TheAnimal{
    var color : String = ""

    constructor(color: String) {
        this.color=color
        println("Animal color $color ")
    }
}

class TheDog : TheAnimal{
    var eat : String = "none"

    constructor(color: String, eat : String): super (color){
        this.eat=eat

        println("Dog color $color and $eat")
    }

}