package Lesson04

fun main(){
    val pi: Float by lazy { // lazy kullanıldığında değer hemen oluşturulmaz, sadece ihtiyaç olduğunda oluşturulur.
        3.14F
    }

    val area1 = pi*4
    println(area1)
}