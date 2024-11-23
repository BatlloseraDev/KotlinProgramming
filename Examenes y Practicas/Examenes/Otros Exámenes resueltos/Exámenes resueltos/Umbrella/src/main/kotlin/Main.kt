import kotlin.random.Random

fun main(args: Array<String>) {
    var maxSalas = 9
    var densidadMaxima = 20
    var densidad = Array<Int>(1){0}
    var densidadPrevia : Int

    for (sala in 1..maxSalas){
        println("Inspeccionando la sala $sala")
        if (detectar('h', sala) > 0){
            println("Humanos encontrados en la sala $sala")
            cerrarPuertas(sala)
            densidadVirus(sala, densidad)
            densidadPrevia = densidad[0]  //Guardamos la densidad previa para luego restaurarla.
            println("Densidad previa $densidadPrevia en la sala $sala")
            println("Subiendo a la densidad máxima")
            while(densidad[0] < densidadMaxima){
                aumentarVirus(sala)
                densidadVirus(sala, densidad)
            }
            while(detectar('h', sala) > 0){
                println("Esperando que se conviertan todos los humanos")
            }
            println("Volviendo a la densidad original")
            while(densidad[0] > densidadPrevia){
                disminuirVirus(sala)
                densidadVirus(sala, densidad)
            }
            abrirPuertas(sala)
        }
        else {
            println("Solo hay zombies en la sala $sala")
            if (puertasAbiertas(sala)){
                abrirPuertas(sala)
            }
        }
    }
}

//***************************************************************
//******************** Funciones auxiliares *********************
//***************************************************************
/**
 * Todas las funciones auxiliares que tienen un print es porque simulamos que esas funciones hacen algo.
 */
fun abrirPuertas(sala:Int){
    println("Abriendo las puertas de la sala $sala")
}

fun cerrarPuertas(sala:Int){
    println("Cerrando las puertas de la sala $sala")
}

fun puertasAbiertas(sala : Int):Boolean{
    return Random.nextInt(1,2) == 1
}

fun detectar(tipo:Char, sala:Int):Int {
    return Random.nextInt(0,4)
}

fun aumentarVirus(sala:Int){
    println("Aumentando la densidad de virus en la sala $sala")
}

fun disminuirVirus(sala:Int){
    println("Disminuyendo la densidad de virus en la sala $sala")
}

fun densidadVirus(sala:Int, densidad:Array<Int>){
    densidad[0] = Random.nextInt(15,22)
}
