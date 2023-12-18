package Lesson04

fun main(){


     var name: String? = "Kenan" // biz ? yazaraq name nin null deyeri alabileceyinide deyirik

    println("adin uzunlugu ${name?.length}")// burda ise eyer name null deyilse uzunlugunu yazdir

    name?.let {
        println("adin uzunlugu ${name.length}")  } // burda ise eyer name null deyilse onda gir {} motersenin arasindaki
                                                   // kodu icra et


    println("=================================")


    var surname: String?= "Haciyev"
    // asagda yazdigimiz if ile yazilisdir ve gorduyun kimi cox uzundur
    var lenghtSurname = if (surname != null){
        println("adin uzunlugu ${surname.length}")
    }else
        println("Null gelib")

    println("==========qisa yaz==================")

    val lenghtSurnameQisa = surname?.length?: -1
    println(lenghtSurnameQisa)

}

