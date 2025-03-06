class Costantes {
    companion object{

        var MAXCRISTALESPURPURA = 6
        var MIN_ENERGIA =1
        var MAX_ENERGIA =50

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

    }
}