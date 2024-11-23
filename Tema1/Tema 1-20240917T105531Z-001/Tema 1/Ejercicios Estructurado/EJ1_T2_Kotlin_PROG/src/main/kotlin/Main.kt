fun main() {
    var l : Double = 0.0
    var superficie : Double = 0.0
    var perimetro : Double = 0.0

    println("Lado del cuadrado:")
    l = readln().toDouble()
    superficie = Math.pow(l, 2.0)
    perimetro = l * 4

    println("\nSuperficie: ${superficie + 1}")
    println("Perimetro: $perimetro")
}