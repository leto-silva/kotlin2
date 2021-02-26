package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val DigOneBank = Banco("DigiOne",12 )

    println(DigOneBank.nome)
    println(DigOneBank.numero)

    val banco2 = DigOneBank.copy("zebra", 45)

    println(banco2.Info())

}

