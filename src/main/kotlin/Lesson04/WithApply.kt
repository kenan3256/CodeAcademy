package Lesson04

fun main (){
    // bize imkan verirki person.name etmeden hamisin biryerde deyise bilek
    var person=Person("Kenan",32)
    with(person){
        println(this)
        name="Samir"
        age=35
        strart()
    }
    //withden ferqi esas ondadir ki sonda }.satart() deye bilirik with de bunu etmek olmur
    person.apply {
        println(this)
        name="Ali"
        age=8
        strart()
    }.strart()

//eslide her ikisi eyni isi goruru


}
class Person(_name:String,_age:Int){
    var name=_name
    var age=_age

    fun strart(){
        println("Menim adim $name yasim ise $age -dir")
    }
}