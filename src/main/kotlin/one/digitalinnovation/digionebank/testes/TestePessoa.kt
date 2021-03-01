package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa

fun main(){
    val jetter = Pessoa("Jetter", "1231231213-56")
    //jetter.cpf ="123589E"

    println("${jetter.name} - ${jetter.cpf}")
}
