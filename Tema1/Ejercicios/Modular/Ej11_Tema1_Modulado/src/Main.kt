fun main() {

    println("El factorial del numero ingresado es ${Factorial(DevolverInt("Por favor ingresa un numero entero para calcular su factorial"))} ")

}




fun Factorial(n: Int):Int
{
    var numero = 1
    for(i in 1..n step 1)
    {
        numero *= i
    }
    return numero
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