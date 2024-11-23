import kotlin.random.Random

fun lanzarDado(): Int {
    return Random.nextInt(1,6)
}

/**
 * Devuelve 1 si gana el ataque y 2 si gana la defensa.
 */
fun comprobar(dadosAtaque: Array<Int>, dadoDefensa: Int): Int {
    var quien = 1
    if (dadoDefensa >= dadosAtaque[0] && dadoDefensa >= dadosAtaque[1]){
        quien = 2
    }
    return quien
}

//*************************************************************************
//************************** Programa Principal ***************************
//*************************************************************************

fun main(args: Array<String>) {
    var Napoleon = 50
    var Wellington = 50
    var dadosAtaque =  Array<Int>(2){0}
    var dadoDefensa : Int
    var turno = 1 //Napoleón
    var quienGana : Int

    while(Napoleon > 0 && Wellington > 0){
        if (turno == 1){
            println("Turno de Napoleón")
        }
        else {
            println("Turno de Wellington")
        }
        dadosAtaque[0] = lanzarDado()
        dadosAtaque[1] = lanzarDado()
        dadoDefensa = lanzarDado()
        println("Dados de ataque: ${dadosAtaque[0]}, ${dadosAtaque[1]}")
        println("Dado de defensa: $dadoDefensa")
        quienGana = comprobar(dadosAtaque,dadoDefensa)
        if (turno == 1){
            if (quienGana == 1){
                println("Gana Napoleón")
                Wellington--
            }
            else {
                println("Gana Wellington")
                Napoleon--
                turno = 2
            }
        }
        else {
            if (quienGana == 1){
                println("Gana Wellington")
                Napoleon--
            }
            else {
                println("Gana Napoleón")
                Wellington--
                turno = 1
            }
        }
        println("Tropas actuales: N(${Napoleon})  W(${Wellington})")
        println("-------------")
    }

    println("Tropas finales: N(${Napoleon})  W(${Wellington})")
    if (Napoleon == 0){
        println("Guerra ganada por Wellington")
    }
    else {
        println("Guerra ganada por Napoleon")
    }
}