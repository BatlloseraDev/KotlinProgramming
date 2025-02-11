abstract class Vegetal {
    abstract var vivo:Boolean
    var tamanio: Int = 0

    fun estaVivo(valor: Int):Boolean{
        return true
    }

    abstract fun estaVivo(valor: Int, tipo:String)
}