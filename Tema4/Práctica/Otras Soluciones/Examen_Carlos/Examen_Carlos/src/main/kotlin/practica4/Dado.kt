package practica4

class Dado {
    val numeroDeCaras : Int

    constructor() {
        this.numeroDeCaras = 6
    }

    constructor(numeroDeCaras : Int) {
        this.numeroDeCaras = numeroDeCaras
    }

    fun tirarDado() : Int {
        val numero = (1..numeroDeCaras).random()
        println("Tira el dado y saca $numero")
        return numero
    }

    override fun toString(): String {
        return "1d$numeroDeCaras"
    }
}