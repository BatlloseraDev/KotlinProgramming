

fun acelerar(v:Int) {
    var velocidad = v
    println("Acelerando el coche...")
    while (velocidad < 100) {
        velocidad += 10
        println("Velocidad: $velocidad")
    }
}

fun frenar(v:Int) {
    var velocidad = v
    println("Frenando el coche...")
    while (velocidad > 0) {
        velocidad -= 10
        println("Velocidad: $velocidad")
    }
}