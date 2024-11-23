fun main(args: Array<String>) {
    var nota: Float = 0f

    do {
        println("ingresa la nota")
        nota = readln().toFloat()

        if (nota in 9.0..10.0) {
            println("su nota es sobresaliente")
        }
        if (nota in 7.0..8.9) {
            println("su nota es notable")
        }
        if (nota in 5.0..6.9) {
            println("su nota es aceptable")
        }
        if (nota in 1.0..4.9)
            println("su nota es insuficiente")
        if (nota <= 0) {
            println("saliendo")
            break
        }


    } while (true)
}