package org.example.Lesson02

fun main(){

    var kart= CreditCartType.GOLD

    when(kart){
        CreditCartType.GOLD -> println("Menim qizl kartim var")
        CreditCartType.SILVER -> println("Menim gumus kartim var")
        CreditCartType.PLATINIUM -> println("Menim platin kartim var")
    }
}

enum class CreditCartType(type: String){
    GOLD ("qizil kart"),
    SILVER ("gumus kart"),
    PLATINIUM ("platiniyum kart")
}