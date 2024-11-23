fun main() {
    println("Para calcular el numero combinatorio deberas ingresar dos numeros")


    println("El numero combinatorio es ${combinatorio(DevolverInt("Ingresa el primer numero"),DevolverInt("Ingresa el segundo numero"))}")


}

fun combinatorio(numero1 :Int, numero2: Int): Double
{
    return (Factorial(numero1)/(Factorial(numero2)*Factorial(numero1-numero2))).toDouble()
}


fun Factorial(n: Int): Long
{
    var numero = 1
    for(i in 1..n step 1)
    {
        numero *= i
    }
    return numero.toLong()
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