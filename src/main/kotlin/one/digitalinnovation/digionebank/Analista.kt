package one.digitalinnovation.digionebank

import one.digitalinnovation.digionebank.Funcionario

class Analista(
    name: String,
    cpf: String,
    salario: Double
) : Funcionario(name, cpf, salario) {
    override fun CalculoAuxilio() = salario * 0.1
}