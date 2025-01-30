class Jugador {
    var nombre: String = ""

    //var elecccion = 0
    //var marcador = 0
    constructor(nombre:String){
        this.nombre = nombre
    }

    fun elegir():Int{
        println("Dame 1-piedra, 2-papel, 3-tijera")
        var eleccion = readln().toInt()
        return eleccion
    }
}