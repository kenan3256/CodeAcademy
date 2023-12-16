package Lesson04.Task01

import kotlin.collections.ArrayList


fun main(){
    
    print("Dairənin radiusunu daxil edin: ")
    val yaricap= readln()
    print("Düzbucaqlının enini daxil edin: ")
    val eni= readln()
    print("Düzbucaqlının uzunluğunu daxil edin: ")
    val uzunu= readln()
    println("================================================")


    var arrayList: ArrayList<Shape> = arrayListOf(
        Circle(yaricap.toDouble()),
        Rectangle(eni.toDouble(),uzunu.toDouble()),
        Sphere(yaricap.toDouble())
    )

    arrayList.forEach { val name=it.getName()

        when (it) {
            is ThreeDimensional -> { println("$name: Hecmi= ${it.calculateVolume()} ," +
                    " Sahesi=: ${(it as TwoDimensional).calculateArea()}") }

            else -> println("$name = ${(it as TwoDimensional).calculateArea()}")


        }



        }


}




