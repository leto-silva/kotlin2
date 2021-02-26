package one.digitalinnovation.digionebank

class Pessoa {
    var name:String = "Jetter"

    var cpf:String = "123.123.123-23"
    private set

    constructor()

    fun pessoaInfo() = "$name - $cpf"
}

fun main(){
    var jetter = Pessoa()
    //jetter.cpf ="123589E"

    println(jetter.pessoaInfo())
}