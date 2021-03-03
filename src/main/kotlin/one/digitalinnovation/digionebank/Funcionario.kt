package one.digitalinnovation.digionebank

import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

abstract class Funcionario(
    name:String,
    cpf:String,
    val salario:BigDecimal
): Pessoa( name, cpf ) {
    abstract fun CalculoAuxilio()

}


