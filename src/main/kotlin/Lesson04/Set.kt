package Lesson04

fun main(){
    // setlerin array ve arrayListlerden en esas feriqi bir indekse daxil edilen melumat unik olmalidir

    var set= setOf<Int>(1,1,3,4) // in muteybil olan
    println(set.size) // olcusunu 3 olaraq qaytardi ancaq biz 4 deyer daxil etmisdik

    set.forEach{set-> println(set)}
    // printe 1,3,4 verir
    for(element in set) // foru busekildede yazariq
        println(element)




    var set2= mutableSetOf<Int>(1,2,3,5,6,7) // muteybildir yeni elave ede bilirik add var
    set2.add(8)
    set2.add(8)
    set2.add(8)
    set2.add(8)

    set2.remove(5)// deyeri 5 olani silir indexi 5 olani yox!!!


    println(set2.size)
set2.forEach{it -> println(it)}



}
