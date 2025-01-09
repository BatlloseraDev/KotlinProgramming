fun main(args: Array<String>) {
    var altura:Int? = 0
    do{
        println("Ingresa la altura de la pirámide (número impar): ")
        altura = readLine()?.toIntOrNull()
    }while(altura == null || altura % 2 == 0)
    dibujarPiramide(altura)
}

fun dibujarPiramide(altura: Int?) {
    var espacios = 0
    var asteriscos = altura

    for (i in 0..<altura!!) {
        for (j in 0..<espacios) {
            print("  ")
        }
        for (k in 0..<asteriscos!!) {
            print("* ")
        }
        println()

        espacios++
        asteriscos -= 2
    }
}
