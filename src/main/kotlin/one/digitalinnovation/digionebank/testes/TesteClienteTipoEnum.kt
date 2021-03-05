package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach { elem ->
        println("${elem.name} - $(elem.descricao)") }

    ClienteTipo.values().forEach { it->
        println("${it.name} $it")
    }
}