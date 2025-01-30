class Coche {
    var velocidad = 0
    //var botones...
    fun acelerar() {
        println("Acelerando Clase...")
        while (velocidad < 100) {
            velocidad += 10
            println("Velocidad: $velocidad")
        }
    }

    fun frenar() {
        println("Frenando Clase...")
        while (velocidad > 0) {
            velocidad -= 10
            println("Velocidad: $velocidad")
        }
    }
}

fun main() {
    val miCoche = Coche()
    miCoche.acelerar()
    miCoche.frenar()

}
