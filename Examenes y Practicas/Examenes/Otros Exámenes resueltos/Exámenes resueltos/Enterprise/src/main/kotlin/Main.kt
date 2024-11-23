import kotlin.random.Random

fun main(args: Array<String>) {
    var energiaTotal = arrayOf(100)
    var tiempo = 0
    var flancoAtacado : Int
    var energAtaque : Int
    var energEscudo : Int
    var prob : Int

    while(tiempo <= 60){//Lo simulamos solo un minuto
        if (tiempo % 2 == 0){
            flancoAtacado = alertaAtaque()
            if (flancoAtacado != 0){//Se recibe un ataque
                energAtaque = energiaAtaque()
                energEscudo = nivelFlanco()
                println("Recibido un ataque de ${energAtaque} MG en el flanco ${flancoAtacado} que tiene ${energEscudo} MG")
                //Subiendo energía todo lo posible
                energEscudo += aumentarEnergia(flancoAtacado, energAtaque - energEscudo, energiaTotal)
                //Comprobando qué pasa
                if (energEscudo > energAtaque){
                    println("Se ha superado el ataque")
                }else if (energEscudo == energAtaque){
                    prob = Random.nextInt(1,100)
                    if (prob >= 65){
                        println("Se ha superado el ataque")
                    }
                    else {
                        println("Flanco perdido")
                    }
                }
                else {
                    prob = Random.nextInt(1,100)
                    if (prob <= (30 - (energAtaque - energEscudo))){
                        println("Se ha superado el ataque")
                    }
                    else {
                        println("Flanco perdido")
                    }
                }
            }
        }
        tiempo++
        Thread.sleep(1000)
    }
}

//---------------------------------------------------
//------------------- Auxiliares --------------------
//---------------------------------------------------

fun alertaAtaque(): Int {
    return Random.nextInt(0,20)
}

fun energiaAtaque(): Int {
    return Random.nextInt(1,15)
}

fun nivelFlanco(): Int {
    return Random.nextInt(1,15)
}

fun aumentarEnergia(flanco : Int, energiaAumentar : Int, energiaRestante : Array<Int>) : Int{
    var energiaAumentada = energiaAumentar
    if (energiaRestante[0] >= energiaAumentar){
        energiaRestante[0] -= energiaAumentar
    }
    else {
        energiaAumentada = 0
    }

    return energiaAumentada
}