import kotlin.random.Random

class Silla{

    var patas = 4
    var color = "Blanca"
    constructor()
    {
        patas= Random.nextInt(0,10)
        var colores= Colores.entries.toTypedArray()
        color = colores[Random.nextInt(colores.size)].toString()
    }

    companion object
    {
        fun lucha(silla1: Silla,silla2:Silla):Silla
        {
            var ganador= silla1
            if(silla2.patas>silla1.patas)ganador=silla2
            return ganador
        }

    }

    override fun toString(): String {
        return "Silla: $patas pata/s, y de color $color"
    }
}

enum class Colores{
    Blanca,
    Negra,
    Verde,
    Roja,
    Naranja,
    Amarilla,
    Morada,
    Arcoiris
}