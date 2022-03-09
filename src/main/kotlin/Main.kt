import animal.Cachorro
import animal.Cavalo
import animal.Preguica

/*
Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua
as características de forma que tudo o que for comum a todos os animais fique
na classe Animal:

Implemente um programa que crie os 3 tipos de animais definidos no exercício
anterior e invoque o método que emite o som de cada um de forma polimórfica,
isto é, independente do tipo de animal.

Como eu fiz....
import animal.Cachorro
import animal.Cavalo
import animal.Preguica

fun main(args: Array<String>) {
    val animal = Cachorro("Belinha", "4 anos")
    println("$animal")
    animal.correr()

    val animal2 = Cavalo("Alazão", "10 anos")
    println("$animal2")
    animal.correr()

    val animal3 = Preguica("Joana", "15 anos")
    println("$animal3")
    animal3.escalar()

    fun som(): String {
        animal.som()
        animal2.som()
        animal3.som()
    }
}

 */
//Como é...
fun main() {

    val tobby = Cachorro("Tobby", 4)
    val epona = Cavalo("Epona", 5)
    val lazt = Preguica("Lazt", 4)

    tobby.som()
    epona.som()
    lazt.som()

}