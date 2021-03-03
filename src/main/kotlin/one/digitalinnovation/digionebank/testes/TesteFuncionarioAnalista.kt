package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario


fun main(){
    val joao = Analista("joão", "123123123-56", 2000.00)

    ImprimeRelatorio(joao)

}

fun ImprimeRelatorio(Funcionario: Funcionario)= println(Funcionario.toString())
