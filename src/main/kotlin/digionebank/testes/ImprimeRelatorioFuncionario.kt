package digionebank.testes

import digionebank.Funcionario

class ImprimeRelatorioFuncionario {

    companion object{
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}