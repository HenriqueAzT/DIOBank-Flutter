package digionebank.testes

import digionebank.Cliente
import digionebank.ClienteTipo

fun main() {
    val Lara = Cliente(
        nome = "Lara",
        cpf = "54613218656",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"

    )

    println(Lara)

    TesteAutenticacao().autentica(Lara)
}


