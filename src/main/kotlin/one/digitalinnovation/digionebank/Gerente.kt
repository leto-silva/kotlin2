package one.digitalinnovation.digionebank

import one.digitalinnovation.digionebank.Funcionario

class Gerente(
    name: String,
    cpf: String,
    salario: Double
) : Funcionario(name=name, cpf=cpf, salario=salario ) {
    override fun CalculoAuxilio(): Double = salario * 0.4
}