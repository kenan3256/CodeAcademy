package org.example.Lesson02

fun main(){

    var dog = MyDog()

    println(dog.color)
    dog.eat()
    dog.bark()

}
open class MyAnimal{
    open  var color : String = "Black"

    open fun eat (){
        println("Animal eating")
    }
}

class MyDog : MyAnimal(){
     var bread : String = ""

    override var color: String = "Yellow"

    fun bark (){
        println("Bark")
    }

    override fun eat() {
        println("Dog yemek yeyir")
    }
}