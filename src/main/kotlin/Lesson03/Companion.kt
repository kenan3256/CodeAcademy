package Lesson03

fun main(){
    MyClass.a=32
    println(MyClass.a)
    println(MyClass.milliyeti())

}

class MyClass{
    companion object{ //  companion object bize daxilinde yazanlarin static bir deyisen ve metod oldugunu bildirir (javadaki statik keyvordunun gorduyu isi goruru)
        var a: Int=0 // satik bir deyisendir
        fun milliyeti(): String{ // satik bir metodur
            return "azerbaycanli"
        }
    }
}
// eyer clasimizi statik etmek isteyirikse bu zaman object keyvordunden istifade edeceyik