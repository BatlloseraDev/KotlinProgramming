
class Jugador {

    var cartas= ArrayList<Carta>()

    companion object
    {
        var nCartas=5
    }

    constructor()
    {
        for(i in 0 until nCartas)
        {
            cartas.add(Carta())
        }
    }

    fun fuerzaTotal():Int
    {
        var sumatorio= 0
        for(c in cartas)
        {
            sumatorio+= c.vida
        }
        return sumatorio
    }

    fun cartaConVida(n:Int):Boolean
    {
        return cartas[n].viva
    }


    override fun toString(): String {
        return "El jugador tiene las siguientes cartas:\n\t" +
                cartas.mapIndexed{index, carta -> "${index +1}. $carta" }.joinToString("\n\t")
    }

}