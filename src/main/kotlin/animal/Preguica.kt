package animal

import animal.Animal

class Preguica(
    nome: String, idade: Int
): Animal(nome, idade){

    override fun som(){
        println("O som do animal é: zzzzzz") }

    fun escalar(){
        println("O animal está escalando na árvore feito louco(a)")
    }

}