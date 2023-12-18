package Lesson04

fun main(){
 //              arrayin olcusu     0 ci indexin deyeridir mecbur yazmalisan ve bos indexlerin yerine bu deyer set olunur
    var array = Array<Any>(7) {5} //in muteybil olan
// var array = Array<Int>(7) {5} bu sekilde yazdigimiz zaman eyer biz <Any> yazarsaq ozaman butun tipleri eynianda arayin i
// cine ata bilerik
    array[1]=35
    array[2]=65
    array[3]=89
    array[4]=100


    println(array[0])
    println(array[1])
    println(array[2])
    println(array[3])
    println(array[4])




    println("===for ile yazdiraq===")

    for(elment in array)
        println(elment)

    println("=============bu kohne yazilisir====================")

    for(index in 0..array.size - 1){
        println(array[index])
    }

    println("===forEach ile yazdiraq===")

    array.forEach {element-> println(element)}


// arrayin ferqli yazilisi bunu yaz mence daha yaxsidir

    var array1= arrayOf(1,2,3,4,5)
}