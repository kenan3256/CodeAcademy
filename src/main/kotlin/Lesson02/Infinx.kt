package org.example.Lesson02



fun main(){
    val x: Int=6
    val y: Int=10

    var z=x muqayiseEt y
    println(z)
    // ve ya asagdaki kimi yaza bilerik
    var b=x.muqayiseEt(y)
    println(b) // ve ya birbasa ededide yazabilerik

    var d=65.muqayiseEt(90) // ve ya
    var d1= 65 muqayiseEt 89
}

infix fun Int.muqayiseEt(other: Int): Int{
    if(this>other){
        return this
    }else{
        return other
    }
}