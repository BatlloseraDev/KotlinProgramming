import practica1.Conversion
import practica2.Piramide
import practica3.Sucursal
import practica4.Factoria
import practica5.Contraseña

fun main() {
    practica3()
}

fun practica1() {
    val num1 = Conversion.aleatorio(0, 100)
    val num2 = Conversion.aleatorio(0, 100)

    println("¿Los numeros $num1 y $num2 son divisibles? \n${Conversion.divisible(num1, num2)}")

    Conversion.contar(num1, num2)
}

fun practica2() {
    val num = Piramide.pedirNumeroImpar()

    Piramide.crearPiramide(num)
}

fun practica3() {
    do {
        var fallo = true
        val loteria = Sucursal.pedirNumero()

        //primera fase
        if (Sucursal.hayTres(loteria) && Sucursal.multiploDeDos(loteria) && Sucursal.primeroUltimoCoinciden(loteria)) {
            //segunda fase
            Sucursal.imprimirBucle(loteria)
            fallo = false
        }
    }while (fallo)
}

fun practica4() {
    val jugador1 = Factoria.crearJugador("Pedro")
    val jugador2 = Factoria.crearJugador("Juan")

    do {
        print("$jugador1 ")
        val cartaJugador1 = jugador1.seleccionarCarta()

        print("$jugador2 ")
        val cartaJugador2 = jugador2.seleccionarCarta()

        println("\n=====================")
        cartaJugador1.enfrentarse(cartaJugador2)
        println("=====================\n")
    }while (jugador1.puedeContinuarLaPartida())
}

fun practica5() {
    val contraseñaDebil = Contraseña(12, false)
    val contraseñaFuerte = Contraseña(8, true)

    println(contraseñaDebil)
    println(contraseñaFuerte)
}