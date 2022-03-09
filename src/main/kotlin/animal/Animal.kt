package animal/* O  que eu fiz...
open class animal.Animal (val nome: String, var idade: Int )  {
    open class animal.Animal (val nome: String,var idade: Int) {

        override fun toString(): String {
            return "\nNome - $nome" +
                    "\nIdade - $idade"}

    open fun som(){}
}

 */

//Como é....
abstract class Animal (nome: String, idade: Int){
    abstract fun  som()

}