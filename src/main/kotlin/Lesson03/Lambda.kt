package Lesson03

fun main (args: Array<String>) {
    val program=TheProgram()
    program.calculeyt(10,40, {a,v->a+v})
    program.calculeyt(10,40, {a,v->a-v})
    program.calculeyt(10,40, {a,v->a*v})
    program.calculeyt(10,40, {a,v->a/v})



    var list= listOf(1,2,3,4,5,6)
    list.forEach{i-> println(i)}
    println("=========================")
    list.forEach{ println(it)} // tek parametir alan lombda fonksiyalarinda istifade ede bilirik

}



// basqa bir numuneye baxaq
// bu bizim normal metodumuzdur gelin bunu lambada exretionlarla yazaq

fun hello (){
    println("Salam")
}
fun cix(a:Int,b:Int){
    println(a-b)
}

fun topla(a: Int, b:Int):Int{ // belede yaza bilerik "fun topla(a: Int, b:Int):Int = a+b"
    return a+b
}


//=============Lombada yazilisi========================================

var hello1= { println("hello")}
var hello2:()->(Unit)= {println("hello")} // veya bele

var cix:(a:Int,b:Int)->(Unit)={a,b->a-b}

var topla1:(a:Int,b:Int)->(Int)= {a,b->a+b}





class TheProgram{
    fun calculeyt(a:Int,b:Int, action: (Int,Int)->Int){
        var sum =action (a,b)
        println(sum)
    }
}

