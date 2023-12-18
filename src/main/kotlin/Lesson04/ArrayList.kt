package Lesson04
fun main(){
    var arrayList= arrayListOf<Any>("salam",1,5,6,8) //muteybil olan
    arrayList.add("Kamil")
    arrayList.add(true)

    println(arrayList[5])

    arrayList.forEach { it-> println(it) }

    arrayList.add(6,999)

    arrayList.forEach { arr-> println(arr)}

    var array2=ArrayList<Int>() // arrayListi busekildede yaza bilerik

    array2.apply {
        add(0,1)
        add(1,2)
        add(2,13)
        add(3,15)
        add(4,51)
        add(5,16)
    }
    array2.forEach { arrq-> println(arrq) }


}

