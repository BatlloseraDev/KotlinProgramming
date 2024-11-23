fun main() {

    var n = DevolverInt("Ingresa el dividendo")
    var n2 = DevolverInt("Ingresa el divisor")
    var calculo = CalcularCociente(n,n2)
    println("El cociente es $calculo y el resto es ${n-(calculo*n2)}")


}


fun CalcularCociente(numero1: Int, numero2:Int) : Int
{
    var numeroCambiate = numero1
    var contador = 0

    while (numeroCambiate>numero2)
    {
        numeroCambiate-=numero2
        contador ++
    }

    return contador
}




fun DevolverInt(texto:String):Int
{
    var  n :Int? = null
    while (n==null)
    {
        println(texto)
        n= DevolverIntONull(readln())
    }
    return n
}

fun DevolverIntONull(input: String):Int? {
    return try {
        input.toInt()
    } catch (e: NumberFormatException) {
        println("Numero no reconocido o no valido, por favor ingresa un entero")
        null
    }
}