package Lesson03

fun main(){
    CustamersDate.count=90
    println(CustamersDate.count)

    println(CustamersDate.typeOfCustomers())

    println(CustamersDate.myMetod("Sadece senden String isteyir ve geri birsey qaytarmir yeni Unit dir"))




}
open class MySuperClass{
    open fun myMetod(str: String){
        println("My super class metod")
    }
}

object CustamersDate : MySuperClass() {

    var count : Int = 0

    fun typeOfCustomers(): String{
        return "azerbaycanl;"
    }

    override fun myMetod(str: String) {
        super.myMetod(str)
        println("object customer Data: $str")
    }

}