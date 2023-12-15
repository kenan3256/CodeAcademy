package Lesson03

fun main (){
    val program=TheProgram()
    program.calculeyt(10,40, {a,v->a+v})
    program.calculeyt(10,40, {a,v->a-v})
    program.calculeyt(10,40, {a,v->a*v})
    program.calculeyt(10,40, {a,v->a/v})
}
class TheProgram{
    fun calculeyt(a:Int,b:Int, action: (Int,Int)->Int){
        var sum =action (a,b)
        println(sum)
    }
}

