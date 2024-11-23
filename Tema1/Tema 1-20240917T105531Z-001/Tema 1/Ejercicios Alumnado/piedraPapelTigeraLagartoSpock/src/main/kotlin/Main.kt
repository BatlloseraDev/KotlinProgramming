fun main() {
var humano:String
var maquina:String
    println("Bienvenido al juego de Piedra, Papel, Tijeras, lagarto o Spock al mejor de tres.")

    val finJuego = 3
    var puntosH = 0
    var puntosM = 0
    while (puntosH < finJuego && puntosM < finJuego){
        humano=pedir()
        maquina=eleccion_maquina()
        when {
            humano == maquina ->{
                println("tu elegiste $humano, la maquina $maquina")
                println("Empate esta ronda.")}
                        (humano == "piedra" && maquina == "tijeras") ||
                        (humano == "piedra" && maquina == "lagarto") ||
                        (humano == "papel" && maquina == "piedra") ||
                        (humano == "papel" && maquina == "spock") ||
                        (humano == "tijeras" && maquina == "papel") ||
                        (humano == "tijeras" && maquina == "lagarto") ||
                        (humano == "spock" && maquina == "piedra") ||
                        (humano == "spock" && maquina == "tijeras") ||
                        (humano == "lagarto" && maquina == "papel") ||
                        (humano == "lagarto" && maquina == "spock")-> {
                            println("tu elegiste $humano, la maquina $maquina")
                            println("Ganas esta ronda")
                            puntosH++
                }
            else -> {
                println("tu elegiste $humano, la maquina $maquina")
                println("Gana la maquina esta ronda")
                puntosM++
            }
        }
       // println("Puntos total: jugador $puntosH - Maquina $puntosM")
    }
    if(puntosH>puntosM){
        println("Has ganado el juego")
    }
    else {
        println("La maquina ha ganado el juego")
    }
    repetir()
}
fun repetir (){
    println("Quieres jugar de nuevo: (si o no)")
    var repetir= readln().toLowerCase()
    if (repetir.equals("si")){
        return main()
    }
    else{
        println("Fin del juego")
    }
}
fun eleccion_maquina():String{
    var aleatorio = (1..5).random()
    var maquina:String
    if (aleatorio == 1){
        maquina = "piedra"
    }
    else if(aleatorio == 2){
        maquina = "papel"
    }
    else if (aleatorio==3){
        maquina = "tijeras"
    }
    else if (aleatorio == 4){
        maquina = "lagarto"
    }
    else {
        maquina = "spock"
    }
    return maquina
}
fun pedir ():String{
    var valor:String
    val piedra="piedra"
    val tijera ="tijeras"
    val papel = "papel"
    val lagarto ="lagarto"
    val spoc="spock"
    println("Elige: (piedra,papel,tijeras,lagarto,spock)")
    valor = readln().toLowerCase()
    if (valor.equals(piedra)||valor.equals(tijera)||valor.equals(papel)||valor.equals(lagarto)||valor.equals(spoc)){
        return valor
    }
    else{
        println("Tienes que introducir bien el nombre del valor.")
        return pedir()
    }
}
