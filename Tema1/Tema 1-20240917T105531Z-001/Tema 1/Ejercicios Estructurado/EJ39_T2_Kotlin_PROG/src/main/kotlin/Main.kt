import kotlin.random.Random

fun main() {
    var n : Int = 0
    var nsecret : Int = 0
    var haGanado = false
    var t : Char = ' '
    var i : Int = 1

    println("╔════════════════════╗")
    println("║                    ║")
    println("║   NÚMERO SECRETO   ║")
    println("║                    ║")
    println("╚════════════════════╝")

    println("\n¡Bienvenido a Número Secreto! Tendrás 5 intentos para resolver cada número aleatorio entre 1 y 100.")

    do {
        haGanado = false
        i = 1
        nsecret = Random.nextInt(1, 101)

        while(i <= 5 && !haGanado) {
            print("Escriba el número entre 1 y 100 (${i}/5 intentos restantes): ")
            n = readln().toInt()

            if(n < nsecret) {
                println("El número es menor al secreto")
            } else if(n > nsecret) {
                println("El número es mayor al secreto")
            } else {
                haGanado = true
            }

            i++
        }

        if(!haGanado) {
            println("El resultado era ${nsecret}")
        }
        else {
            println("¡Ha ganado!")
        }


        print("¿Desea salir (S/N)? ")
        t = readln().uppercase().get(0)

    } while(t != 'S')
}