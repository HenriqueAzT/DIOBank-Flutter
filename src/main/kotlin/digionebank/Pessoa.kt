package digionebank

class Pessoa {
    var nome:String = "Henrique"
    var cpf:String = "878.745.846-78"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val Henrique = Pessoa()

    println(Henrique.pessoaInfo())
}