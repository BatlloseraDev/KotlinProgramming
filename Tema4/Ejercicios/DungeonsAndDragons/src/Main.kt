fun main() {


    var jugadorP=Jugador()
    var jugadorS=Jugador()
    var jugar= true
    var ganador= 0
    var ronda= 0

    while(jugar)
    {
        var cartasJuego = ArrayList<Carta>()

        //Turno Jugador 1
        var resultadoJ1= turnoJugador(jugadorP,"Jugador 1", cartasJuego)
        if(resultadoJ1==-1)
        {
            ganador= 2
            jugar= false
        }

        //turno jugador 2
        if(jugar){

            var resultadoJ2 = turnoJugador(jugadorS,"Jugador 2", cartasJuego)
            if(resultadoJ2==-1){
                ganador= 1
                jugar=false
            }

        }

        if(jugar)
        {
            var danio1= cartasJuego[0].atacar()
            var danio2= cartasJuego[1].atacar()

            cartasJuego[0].perderVida(danio2)
            cartasJuego[1].perderVida(danio1)

            println("La carta del jugador 1 hizo un daño de $danio1 a la carta del jugador 2\ndando un resultado de su vida ${cartasJuego[1].vida}\n" +
                    "Mientras que la carta del jugador 2 hizo un daño de $danio2 a la carta del jugador 1\n" +
                    "dando un resultado de su vida ${cartasJuego[0].vida}")

        }

        if(jugadorP.fuerzaTotal()<=0 && jugadorS.fuerzaTotal()<=0) jugar=false
        else if(jugadorP.fuerzaTotal()<=0)
        {
            jugar=false
            ganador=2
        }
        else if(jugadorS.fuerzaTotal()<=0)
        {
            jugar=false
            ganador=1
        }

        ronda++
    }

    when(ganador)
    {
        1-> println("Ganó el jugador 1")
        2-> println("Ganó el jugador 2")
        else -> println("Empate")
    }
}






fun turnoJugador(jugador: Jugador, nombreJugador: String, cartasJuego: ArrayList<Carta>):Int
{
    var continuar= false
    var resultado= 1
    while (!continuar)
    {
        var opc= menuJugador(nombreJugador)
        when(opc)
        {
            1-> println(jugador)
            2->{
                cartasJuego.add(SeleccionarCarta(jugador))
                continuar=true
            }
            3->{
                println("El jugador ${nombreJugador} se ha rendido")
                continuar=true
                resultado=-1
            }
            else->{
                println("Situacion erronea")
            }
        }
    }
    return resultado
}

fun menuJugador(jug: String):Int
{
    var opc= 0
    while(opc !in 1..3)
    {
        opc = ControlErrores.pedirPorTecladoInt(
            "$jug por favor ingresa una de las siguientes opciones:\n\t" +
                    "1.Mostrar cartas\n\t" +
                    "2.Elegir Carta para luchar\n\t" +
                    "3.Rendirse", "Ingresa un numero valido")
    }
    return opc
}

private fun SeleccionarCarta(jugador: Jugador):Carta
{
    var cartaBuena = false
    var carta=jugador.cartas[0]

    while (!cartaBuena) {
        var nCarta =
            ControlErrores.pedirPorTecladoInt("Introduce un numero de carta", "Ingresa un numero entero porfavor")-1
        if (!jugador.cartaConVida(nCarta)) {
            println("La carta seleccionada esta debilitada, selecciona otra")
        } else{
            carta=jugador.cartas[nCarta]
            cartaBuena = true

        }
    }

    return carta
}



/*
* while (!continuar)
        {
            var opc= menuJugador("Jugador 1 ")
            when(opc)
            {
                1->{
                    println(jugadorP)
                }
                2->{
                    cartasJuego.add(SeleccionarCarta(jugadorP))
                    continuar=true
                }
                3->{
                    ganador=2
                    jugar=false
                    continuar=true
                }
                else->{
                    println("Situacion erronea")
                }
            }
        }
        continuar= false

        while(!continuar)
        {
            var opc=menuJugador("jugador 2 ")
            when(opc)
            {
                1->{
                    println(jugadorS)
                }
                2->{
                    cartasJuego.add(SeleccionarCarta(jugadorP))
                    continuar=true
                }
                3->{
                    ganador=1
                    jugar=false
                    continuar=true
                }
                else->{
                    println("Situacion erronea")
                }
            }
        }
* */