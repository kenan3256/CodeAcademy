package Lesson04

fun main(){
    // esas ferqi key - values daxil etme imkani verir  "key-values pering "

    val frutKaloriMap= hashMapOf<String,Int>()
    frutKaloriMap.put("alma",250)
    frutKaloriMap.put("armud",255)
    frutKaloriMap.put("banan",655)
    frutKaloriMap.put("kivi",155)

    println(frutKaloriMap["alma"])
    println(frutKaloriMap.get("armud"))



    for (mutableEntry in frutKaloriMap) {
        println(mutableEntry)

    }
    println("++++++++++++++++++++++++++++")
    frutKaloriMap.forEach { it-> println(it)  }

    println("======================")

    for (key in frutKaloriMap.keys)
        println("salam="+key +"="+frutKaloriMap[key])



    var frute=HashMap<String,Any>()// hasmap yaratmagin birdiger yolu
    frute.put("Salam",25)

    // hasmap yaratmagin birdiger yolu


    val mapYarat= hashMapOf<Int,String>(1 to "salam", 2 to "Sagol",3 to "sende")



}