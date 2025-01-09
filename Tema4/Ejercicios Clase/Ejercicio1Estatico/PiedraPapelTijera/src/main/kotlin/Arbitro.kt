class Arbitro {
    var jugador = 0
    var ordenador = 0

    fun ganador(j:Jugador, o:Ordenador){
        var tiradaJugador = j.elegir()
        var tiradaOrdenador = o.elegir()
        if ((tiradaJugador == 1) && (tiradaOrdenador== 3)){
            println("Ha gado el humano....")
            jugador ++
        }else{
            println("Ha gado el ordendor....")
            ordenador ++
        }
    }
    //fun ganador(k:String, l: Int){}
    //fun ganador(k:Int, l: String){}

    fun ganador(j:Int, o:Int){
        var tiradaJugador = j
        var tiradaOrdenador = o
        if ((tiradaJugador == 1) && (tiradaOrdenador== 3)){
            println("Ha gado el humano....")
            jugador ++
        }else{
            println("Ha gado el ordendor....")
            ordenador ++
        }
    }
    fun hayGanador():Boolean{
        return (jugador == 3 || ordenador == 3)
    }
    fun resumen(){
        println("Marcador")
        println("Humano: ${this.jugador}")
        println("Ordenador: $ordenador")
    }

    override fun toString(): String {
        return "Arbitro(jugador=$jugador, ordenador=$ordenador)"
    }

}