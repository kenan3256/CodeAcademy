package Lesson04.Task

import Lesson04.Task.Circle
import java.util.*


fun main(){
    var arrayList: ArrayList<Shape> = arrayListOf(Circle(4.5),Rectangle(2.0,5.6),Sphere(5.4))

    arrayList.forEach { val name=it.getName()

        when (it) {
            is TwoDimensional -> { println("$name = ${it.calculateArea()}") }
            is ThreeDimensional -> { println("$name = ${it.calculateVolume()}") }
            else -> throw Exception("Booom!!!!")



        }



        }


}




//arrayOf(Circle(2.1),Rectangle(2.5,3.4),Sphere(5.4))