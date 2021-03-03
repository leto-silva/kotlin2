package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario


fun main(){
    val maria = Gerente("Maria do Carmo", "123123123-56", 5000.00)

    ImprimeRelatorioFuncionario.Imprime(maria)

}


