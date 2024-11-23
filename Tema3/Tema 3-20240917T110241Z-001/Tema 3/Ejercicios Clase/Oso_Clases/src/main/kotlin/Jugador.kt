class Jugador {
    var puntos=0
    var posicion= Casilla(-1,-1)
    var esPC:Boolean = false

    companion object{
        var turnos = 0
    }
    constructor(){}
    constructor(esPC:Boolean){
        this.esPC = esPC
    }
    fun pedirLetra():String{
        var l:String=""
        if (esPC) {
            l = "OS".random().toString()
        }else {
            do {
                print("Dame la letra (O / S): ")
                l = readln().uppercase()
            } while (!(l == "O" || l == "S")) // (l!="O" && l!="S")
        }
        return l
    }
    fun sumarPuntos(p:Int){
        this.puntos = this.puntos + p // puntos += p
    }
    fun pedirPosicion(tamanio:Int){
        var f:Int? =0
        var c: Int? = 0
        if (esPC) {
            posicion.fila=(0..<tamanio).random()
            posicion.columna=(0..<tamanio).random()
        }else{
            do {
                print("Dime la Fila: ")
                f = readln().toIntOrNull()
            } while (f == null || f !in 1..tamanio)
            posicion.fila = f-1
            do {
                print("Dime la Columna: ")
                c = readln().toIntOrNull()
            } while (c == null || c < 1 || c > tamanio)
            posicion.columna=c-1
        }

    }

    override fun toString(): String {
        return "Jugador(puntos=$puntos)"
    }


}