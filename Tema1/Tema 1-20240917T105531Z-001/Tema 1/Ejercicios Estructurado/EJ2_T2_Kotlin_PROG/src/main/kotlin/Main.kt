fun main(args: Array<String>) {
    var a : Double = 0.0
    var b : Double = 0.0
    var superficie : Double = 0.0
    var perimetro : Double = 0.0

    println("Primer lado del triángulo:")
    a = readln().toDouble()
    println("Segundo lado del triángulo:")
    b = readln().toDouble()

    superficie = a * b
    perimetro = 2*(a + b)

    println("\nSuperficie: " + superficie)
    println("Perimetro: " + perimetro)
}