package Lesson04

fun main (){
    val country = Country()
    country.name="gwrcws"
    country.setup()// eyer bunu yazarsaq felir azerbaycani ora verir
    country.print()

}

class  Country{
    lateinit var name: String // lateinit yazdigimizda  null qoya bilirik

    fun setup(){
        name="Azerbaycan"
    }

    fun print(){
        if (this :: name.isInitialized){
            println("olkenin adi $name")
        }
    }

}