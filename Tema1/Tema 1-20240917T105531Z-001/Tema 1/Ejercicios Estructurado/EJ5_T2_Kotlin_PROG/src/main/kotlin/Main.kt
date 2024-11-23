fun main(args: Array<String>) {
    var n : Int = 0

    println("Dame un numero: ")
    n = Integer.parseInt(readln())

    if (n >= 0) {
        println("Es positivo")
    }
    else {
        println("Es negativo")
    }
}