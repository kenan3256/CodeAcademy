package org.example.Lesson02

fun main (){
    var tesla = Tesla()
    tesla.name="Tesla"
    tesla.model="Model S"
    tesla.ChargingTime=8
    tesla.color()
    tesla.speed()


}

open  class  Car{ // car bizim super clasimizdir ve diger claslarimiz ondan extend edecekdir
    var name: String ="noname"
    var model : String = "modelNull"
    var matorhecmi: Double=0.0
    var oturacaqSayi: Int = 0

 open  fun color(){ // eyer bir klas overriad edilecekse mutleqdir ki superde bunu gosterek
        println("Red")
    }
    fun speed(){
        println("180")
    }

}

class Tesla : Car(){ // alt clasimiz
    var ChargingTime : Int = 25

    override fun color(){
        println("yellow")

    }
}

class Toyota: Car (){
    var fuelType : String = "benzin"

    override fun color() {
        println("Black")
    }

}