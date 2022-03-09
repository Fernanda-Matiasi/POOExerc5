package animal

import animal.Animal

class Cachorro (
    nome: String, idade: Int
) : Animal(nome, idade) {

    override fun som(){
        println("O som do animal é: auauau")
    }

    fun correr(){
        println("O animal está correndo feito louco(a)")
    }
}

