package org.example.Lesson02

fun main(){
    var studen1=Student(name = "Kenan")
   println(studen1.name)
   println(studen1.id)
   println(studen1.age)
    var student2=Student(name = "Kamil", id = 10)
    println(student2.toString())
    println(student2.name)
    println(student2.id)
    println(student2.age)
    var student3=Student(name = "Senan", id = 20, age = 26)
    println(student3.name)
    println(student3.id)
    println(student3.age)

}

fun println(name: String, id: Int, student2: Unit) {

}

class Student (var name: String){

    var id: Int=-1
     var age: Int=1

    init {
        println("init primary constructordan sonra ise dusur")
    }
    constructor(name: String,id:Int):this(name){
        // secondry constructorun ise dusmesi ucun ilk once primary constructor cagrilmalidir ve ya init cagrilir
        this.id=id
    }
    constructor(name: String,id:Int,age:Int):this(name){
        // javada oldugu kimi istediyimiz qeder deyer qebul eden constructor yarada bilerik
        this.age=age
        this.id=id
    }
}