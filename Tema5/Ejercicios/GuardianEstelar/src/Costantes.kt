class Costantes {
    companion object{

        var MAXCRISTALESPURPURA = 6
        var MIN_ENERGIA =1
        var MAX_ENERGIA =50
        var probEncontrarCristal= 65
        var MAXCRISTALESADVERSARIO= 5
        val MAXADVERSARIOS= 100

        fun generar_Energia():Int
        {
            return (MIN_ENERGIA..MAX_ENERGIA).random()
        }

        fun generar_ColorBasico():Colores{
            var randomColor: Colores
            do {
                randomColor = Colores.values().random()

            }while (randomColor==Colores.PURPURA)

            return randomColor
        }

        fun devolverNumAdversarios():Int
        {
            return (1..3).random()
        }

        fun devolverEncontrarCristal():Boolean
        {
            return (0..100).random()<= probEncontrarCristal
        }

    }
}