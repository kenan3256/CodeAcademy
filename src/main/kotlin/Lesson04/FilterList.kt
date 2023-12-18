package Lesson04

fun main(){
    val myNumber= listOf(1,2,3,4,5,10,18,14,54,63)

    val myFilterNumber = myNumber.filter { it<18 }
    myFilterNumber.forEach{sml -> println(sml)}
}