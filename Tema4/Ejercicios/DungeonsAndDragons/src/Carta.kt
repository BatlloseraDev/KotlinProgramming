import kotlin.random.Random

class Carta {
    var poder= 100
    var vida=20
        set(value)
        {
            field= if(value<0) 0 else value
        }
    var dado:Dado
    var tipo= TipoCarta.DRAGON
    var viva= true

    companion object
    {
        var minVida= 5
        var maxVida= 100
        var minPoder= 10
        var maxPoder= 20
    }

    constructor()
    {
        this.tipo= TipoCarta.entries.random()
        this.dado = Dado()
        this.vida= Random.nextInt(minVida, maxVida+1)
        this.poder= Random.nextInt(minPoder, maxPoder+1)
        this.viva= true
    }


    override fun toString(): String {
        return "tipo:${tipo.toString()}, poder:${poder}, vida:${vida}, dado de: ${dado} caras"
    }


    fun atacar():Int
    {
        return poder+dado.tirarDado()
    }

    fun perderVida(nD: Int)
    {
        vida-=nD
        checkVida()
    }
    private fun checkVida()
    {
        if(vida<=0) viva=false
    }
}

