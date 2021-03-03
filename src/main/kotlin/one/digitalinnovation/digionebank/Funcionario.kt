package one.digitalinnovation.digionebank

import one.digitalinnovation.digionebank.Pessoa

abstract class Funcionario(
    name:String,
    cpf:String,
    val salario:Double
): Pessoa( name, cpf ) {
    protected abstract fun CalculoAuxilio(): Double

    override fun toString() = """
      name:$name
      cpf:$cpf
      salario:$salario
      Auxilio:${CalculoAuxilio()}
   """.trimIndent()
}


