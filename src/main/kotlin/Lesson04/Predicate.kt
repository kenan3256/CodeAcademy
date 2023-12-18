package Lesson04

fun main(){
    var myNumber= listOf(2,4,6,11,10,12,14)

    var myPredicate= {num: Int -> num > 6}

    var check1 = myNumber.all(myPredicate) // daxilinde hamisi 6 dan kicikdirse true deyilse false qaytarar
    println(check1)

    var check2 = myNumber.any(myPredicate)// daxilinde en azi biri 6 kicikdirse true deyilse false qaytarar
    println(check2)

    var totalCount = myNumber.count(myPredicate)// burada bize 6 boyuk olan elementlerin sayini qaytarir
    println(totalCount)

    var nun = myNumber.find(myPredicate)// burada 6 boyuk olan ilk elementi qaytarir eger yoxdursa "null" qayidir
    println(nun)


}