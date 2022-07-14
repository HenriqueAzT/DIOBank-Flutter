package digionebank.testes

import digionebank.Analista


fun main() {
    val Joao = Analista("Joao", "123456789", 2000.0)

    ImprimeRelatorioFuncionario.imprime(Joao)
}
