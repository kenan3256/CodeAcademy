package org.example.Lesson02

fun main(){

    var dog = MyDog()

    println(dog.color)
    dog.eat()
    dog.bark()

}
// eyer biz bir clasi extend edeceyikse mutleqdir ki extend edilecek classin onunde "open" olsun
open class MyAnimal{
    //deyiseni overreid etmek
    open  var color : String = "Black"

// metodu overrid etmek
    open fun eat (){
        println("Animal eating")
    }
}

class MyDog : MyAnimal(){
     var bread : String = ""
// overrid edirik
    override var color: String = "Yellow"

    fun bark (){
        println("Bark")
    }

    override fun eat() {
        println("Dog yemek yeyir")
    }
}