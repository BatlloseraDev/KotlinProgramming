fun main(args: Array<String>) {
    var n : Float = 0f
    var mayor : Float = 0f
    var cant : Int = 0
    var t : Char
    var i : Int = 1

    do {
        print("Número: ")
        n = readln().toFloat()

        if(n > mayor || i == 1) {
            mayor = n
        }
        print("¿Terminar comprobación (S/N)? ")
        t = readln().uppercase().get(0)
        i++
    } while(t != 'S')
    println("\nEl mayor es: $mayor")
}