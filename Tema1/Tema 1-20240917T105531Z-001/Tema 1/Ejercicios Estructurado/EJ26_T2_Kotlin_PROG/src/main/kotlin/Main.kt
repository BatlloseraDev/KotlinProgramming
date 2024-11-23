fun main(args: Array<String>) {
    var s : Char

    do {
        println("¿Desea terminar (s / n)")
        s = readln().uppercase().get(0)
    } while (s == 'N')

    println("Hasta la vista")
}