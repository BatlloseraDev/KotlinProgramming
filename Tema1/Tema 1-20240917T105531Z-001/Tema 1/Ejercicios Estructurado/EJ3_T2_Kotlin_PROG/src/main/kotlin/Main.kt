fun main(args: Array<String>) {
    var a : Double = 0.0
    var area : Double = 0.0
    var circunferencia : Double = 0.0

    println("Radio del círculo:")
    a = readln().toDouble()

    area = Math.PI*(Math.pow(a, 2.0))
    circunferencia = Math.PI*(2 * a)

    println("\nÁrea: $area")
    println("Circunferencia: " + circunferencia) //esta opción es obsoleta para kotlin
}