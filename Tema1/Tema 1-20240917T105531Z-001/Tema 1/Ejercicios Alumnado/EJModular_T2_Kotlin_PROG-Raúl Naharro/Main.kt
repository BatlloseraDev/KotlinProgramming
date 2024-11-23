fun main() {

    do {

        println("Introduce el nombre")
        val nombreTeclado = readln()

        println("Introduce el número de veces a imprimir el texto")
        val n = readln().toInt()

        var i = 1
        while (i <= n) {
            print("$i - " )
            saludar(nombreTeclado)
            i++
        }

        println("Quieres repetir el programa? 1 - SI | 2 - NO")
        val opt = readln().toInt()
    } while (opt == 1)
}

fun saludar(nombre:String) { // Los argumentos siempre son constantes.

    println("Hola $nombre")
}