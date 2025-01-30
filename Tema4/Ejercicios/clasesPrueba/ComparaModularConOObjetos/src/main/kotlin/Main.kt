

fun acelerar(v:Int): Int {
    var velocidad = v
    println("Acelerando el coche...")
    while (velocidad < 100) {
        velocidad += 10
        println("Velocidad: $velocidad")
    }
    return velocidad
}

fun frenar(v:Int):Int {
    var velocidad = v
    println("Frenando el coche...")
    while (velocidad > 0) {
        velocidad -= 10
        println("Velocidad: $velocidad")
    }
    return velocidad
}

fun main() {
    var velocidad=0
    velocidad = acelerar(velocidad)
    velocidad = frenar(velocidad)
}
