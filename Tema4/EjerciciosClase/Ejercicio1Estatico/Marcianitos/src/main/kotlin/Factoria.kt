class Factoria {
    companion object{
        fun crearJugador(n:String):Jugador{
            //return jugador2 = Jugador (Marciano("pepe"),Marciano(),Marciano("juan,23,50"))

            var m1 = Marciano("Pepe")
            var m2 = Marciano()
            m2.potencia = 35
            var m3 = Marciano("juan",23,50)
            var jugador = Jugador(m1,m2,m3)
            jugador.nombre = n
            return jugador
        }
        fun crearJugador():Jugador{
            var m1 = Marciano("Pepe")
            var m2 = Marciano()
            var m3 = Marciano("juan",23,50)
            var jugador = Jugador(m1,m2,m3)
            return jugador
        }
    }
}