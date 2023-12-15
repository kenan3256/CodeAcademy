package Lesson03
/*
* 1. Abstract klasin obyekti (instinsi) yaradila bilmez.
* 2.Eyer bir classin icinde abstract metod varsa mutleq o sinifde abstract olmalidir
* 3.Abstract claslar bir birini extend ede biler ama extend eden class ana clasin metodlarini override etmek mecburiyyetinde deyil
* */
fun main(array: Array<String>){
    var india=Indian()
    india.name
    println(india.name)
    india.getheight()
    india.eat()

}

// metod ve deyisenlerin mecburi override eedilmesi ucun abstract edilmelidir
abstract class Person{
    abstract var name: String  // abstract teyin edilen deyisine deyer daxil edilmir!!!

    abstract fun eat() // abstract metodun bodisi olmur

    open fun getheight(){

    }
    // abstract clas icinde abstrakt olmayan metod ve ya deyisen yaza bilerik
    fun goToSchool(){

    }
}
////////////////////////////////////////////////////////////////////
// abstract olmayan classda abstract metod ve ya deyisen yaradilmaz
class Indian : Person (){
    override var name: String = "Kenan" //


    override fun eat() {
      println("Xengel ye")
    }

    override fun getheight() {
        println("get heigt cagrildi")
    }


}