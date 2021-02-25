package one.digitalinnovation.digionebank

class Pessoa {
    var name:String = "Jetter"
    var cpf:String = "123.123.123-23"

    inner class Endereco{
        var rua = "rua teste"
    }
}

fun main(){
    var jetter = Pessoa()

    println(jetter.name)
    println(jetter.cpf)

    println(jetter.Endereco().rua)
}