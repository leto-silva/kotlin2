package one.digitalinnovation.digionebank

class Pessoa {
    var name:String = "Jetter"

    var cpf:String = "123.123.123-23"
    private set
}

fun main(){
    var jetter = Pessoa()
    //jetter.cpf ="123589E"

    println(jetter.name)
    println(jetter.cpf)

}