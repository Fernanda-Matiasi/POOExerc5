package animal

import animal.Animal

class Cavalo(
    nome: String, idade: Int
): Animal(nome, idade){
    override fun som(){
        println("O som do animal é: iiirrrrí, rilinchin") }

    fun correr(){
        println("O animal está correndo!")
    }

}