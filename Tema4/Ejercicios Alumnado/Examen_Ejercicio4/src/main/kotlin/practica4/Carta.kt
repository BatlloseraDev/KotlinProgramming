package practica4

class Carta {
    val dado : Dado
    val tipo : Tipo
    val poder : Int
    var vida : Int

    val id : Int

    companion object {
        var cartasEnPie = 0
    }

    constructor() {
        this.dado = Dado((6..12).random())
        this.tipo = Tipo.entries.random()
        this.poder = (10..20).random()
        this.vida = (5..100).random()

        cartasEnPie++
        this.id = cartasEnPie
    }

    constructor(dado : Dado, tipo : Tipo, poder : Int, vida : Int) {
        this.dado = dado
        this.tipo = tipo
        this.poder = poder
        this.vida = vida

        cartasEnPie++
        this.id = cartasEnPie
    }

    fun enfrentarse(enemigo : Carta) {
        print("La carta $id ")
        val dañoAliado = this.poder + this.dado.tirarDado()
        print("La carta ${enemigo.id} ")
        val dañoEnemigo = enemigo.poder + enemigo.dado.tirarDado()

        println("Daño sacado por tu carta ($id): $dañoAliado (${this.poder} + ${dañoAliado - this.poder} [${this.dado}])")
        println("Daño sacado por la carta enemiga (${enemigo.id}): $dañoEnemigo (${enemigo.poder} + ${dañoEnemigo - enemigo.poder} [${enemigo.dado}])")

        if (dañoAliado > dañoEnemigo) {
            println("Has superado la tirada de ataque por lo que le quitas $dañoAliado puntos de vida.")
            enemigo.vida -= dañoAliado
            enemigo.comprobarEstado()
        }else if (dañoEnemigo > dañoAliado) {
            println("Has fallado la tirada de ataque por lo que te quitan $dañoEnemigo puntos de vida.")
            this.vida -= dañoEnemigo
            this.comprobarEstado()
        }else {
            println("Ambos fallais la tirada de ataque, os quedais con los puntos de vida que teniais.")
        }
    }

    fun comprobarEstado() {
        if (this.vida <= 0) {
            this.vida = 0
            println("La carta $id ha sido derribada.")
            cartasEnPie--
        }
    }

    override fun toString(): String {
        return "Carta $id - (Tipo: $tipo, Puntos de vida: $vida, Poder: $poder, Dado: $dado)"
    }
}