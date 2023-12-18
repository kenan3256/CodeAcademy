package Lesson04

fun main(){
    // biz burda
    val myNumber= listOf(1,2,2,3,4,5,10,18,14,54,63)

    val mySquaredNumber = myNumber.map { it + it }
   mySquaredNumber .forEach{ squ-> println(squ)}
    println("=================")

    println( mySquaredNumber.max())// max deyeri qaytarir
    println( mySquaredNumber.min())// min deyeri qaytarir

}
