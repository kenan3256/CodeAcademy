package Lesson03

// interfaceler biri biriniden miras ala bilerler bu zaman eyer 1 ci interfaceni implemement eden classs interfacenin implement etdiyi metodlarida implemement etmelidir
// interface daxilindede interface yaradila biler Interface A ve dacilinde  Interface B eyer sen B impl etmek isteyirsense bu zaman A.B yazacaqsan
interface MyInterfaceList{
    fun onTouc()

    // javadan ferqli olaraq kotlinde interfacede yazilan metodun daxiline kod yaza bilirk
    fun onClick(){
        println("MyInterfaceList=onClisck metod")
    }
}

interface MySecondaryInterface {
    fun onTouc() {
        println("Ikinci interfacenin touch metoduyam")
    }

    fun onClick() {
        println("ikinci interfacenin onClick metoduyam")
    }
}
/////////////////////////////////////////////////////////////////////////////
class Button : MyInterfaceList, MySecondaryInterface{


  /*  eyer biz normal sekilde import etseydik asagdaki kimi import olunacaqdi ve buzaman xeta alacaqdiq
  cunki bizim iki eded eyni adda "onClick ve onTouch" metodumuz var
  bunun qarsini almaq ucun asagdaki kod setirlerini istifade edirik"
      override fun onTouc() {
        TODO("Not yet implemented")
    }

    override fun onClick() {
        TODO("Not yet implemented")
    }

    override fun onClick() {
        TODO("Not yet implemented")
    } */

    override fun onClick() { // metod adlari eyni odugu ucun metod daxilinde gosteririk her iki interfacenin metodunun iplementasiyas;n;
        // https://www.youtube.com/watch?v=CX-T7Db_Z-Q&list=PLueFkQL21d3j-KHr6LY07mFTtv0O-pTY-&index=32
        super<MySecondaryInterface>.onClick()
        super<MyInterfaceList>.onClick()
    }

    override fun onTouc() {
        super.onTouc()
        //MyIntesface listin ici bos oldugu ucun onu ayrica metod icinde yazmaga ehtiyac yoxdur
    }


}
fun main(){
    var myButton=Button()
    myButton.onClick()
    myButton.onTouc()
}