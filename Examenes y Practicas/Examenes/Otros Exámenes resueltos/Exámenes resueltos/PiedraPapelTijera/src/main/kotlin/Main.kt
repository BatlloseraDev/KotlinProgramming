import kotlin.random.Random

fun main(args: Array<String>) {
    var tiradaMaquina : Int
    var tiradaHumano : Int
    var ganadasHumano = 0
    var ganadasMaquina = 0
    var qhp : Int

    while(ganadasMaquina !=3 && ganadasHumano != 3){
        tiradaHumano = pedir()
        tiradaMaquina = Random.nextInt(0,3)
        println(tiradaMaquina)
        print("Humano = ${mostrarTirada(tiradaHumano)}  Máquina =  ${mostrarTirada(tiradaMaquina)} ")
        qhp = comprobar(tiradaHumano, tiradaMaquina)
        when(qhp){
            0 -> println("Empate")
            1 -> {
                println("Ha ganado el humano")
                ganadasHumano++
            }
            2 -> {
                println("Ha ganado la máquina")
                ganadasMaquina++
            }
        }
        println("Puntuación actual Humano = ${ganadasHumano} Máquina = ${ganadasMaquina}")
    }
    if (ganadasHumano == 3){
        println("Partida ganada por el humano")
    }
    else {
        println("Partida ganada por la máquina")
    }

}



//--------------------------------------------------------

fun comprobar(tiradaHumano: Int, tiradaMaquina: Int): Int {
    var qhp = 0

    if (tiradaHumano == 0){
        if (tiradaMaquina == 1){
            qhp = 2
        }
        if (tiradaMaquina == 2){
            qhp = 1
        }
    }
    if (tiradaHumano == 1){
        if (tiradaMaquina == 0){
            qhp = 1
        }
        if (tiradaMaquina == 2){
            qhp = 2
        }
    }
    if (tiradaHumano == 2){
        if (tiradaMaquina == 0){
            qhp = 2
        }
        if (tiradaMaquina == 1){
            qhp = 1
        }
    }
    return qhp
}


//-----------------------------------------------
fun pedir(): Int {
    var esCorrecto = true
    var n : Int

    do{
        esCorrecto = true
        print("0 (Piedra), 1 (Papel), 2(Tijera): ")
        n = readln().toInt()
        if (n !in 0..2){
            println("Tirada incorrecta")
            esCorrecto = false
        }
    }while(!esCorrecto)
    return n
}

//---------------------------------------------------
fun mostrarTirada(tiradaHumano: Int): String {
    var cad : String = ""
    when(tiradaHumano){
        0 -> cad = "piedra "
        1 -> cad = "papel "
        2 -> cad = "tijera "
    }
    return cad
}
