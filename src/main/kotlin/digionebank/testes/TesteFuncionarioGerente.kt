package digionebank.testes

import digionebank.Gerente


fun main() {
    val Lucas = Gerente("Lucas", "1846456789", 4500.0)

    ImprimeRelatorioFuncionario.imprime(Lucas)
}