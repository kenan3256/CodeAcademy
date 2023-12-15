package Lesson03

fun main(){
    CreditCardType.SILVER.getprodactName()
    println(CreditCardType.SILVER.getprodactName())
}

interface InterfaceCrediCart{
    fun getprodactName() : String

}

enum class CreditCardType (type: String, casbeckDeyeri: Double) : InterfaceCrediCart{
    GOLD("Qizil", 100.0) {
        override fun getprodactName(): String {
            return "Qizil"
        }
    },
    SILVER ("Gumus", 20.0){
        override fun getprodactName(): String {
            return "gumus"
        }

    }

}