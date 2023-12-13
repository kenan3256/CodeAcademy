package org.example.Lesson02

fun main () {
var user1 = User(name = "Kenan", surname = "Haciyev", age = 32)
var user2 = User(name = "Kenan", surname = "Haciyev", age = 32)
    println(user1.toString())
    println(user2.toString())
    //if(user1==user2) belede yazabilerik
    if (user1.equals(user2)){
        println("Data clasalarin daxilindeki deyerler bir-birine beraberdirse " +
                "bu zaman data obyektler(clasla)-da bir birine bereber olar")
    }else{
        println("Demeki daxilindekiler beraber deyil")
    }

}

data class User(var name: String, var surname: String, var age: Int)
/* data classlarin diger claslardan en boyuk ferqi bu klaslarin daxilindeki deyisenlerin aldigi qiymetler
* bir-birine beraberdirse bu zaman bu klasdan yaranacaq obyektlerde bir birine beraber olacaq yuxardaki misala bax */