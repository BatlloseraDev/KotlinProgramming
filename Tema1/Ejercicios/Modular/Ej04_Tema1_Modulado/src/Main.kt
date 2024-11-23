fun main() {


    println("La raiz cuadrada es ${CalcularRaiz()}")

}

fun CalcularRaiz():Double
{
    var n = ComprobarPositivo().toDouble()
    var calculo = Math.sqrt(n)
    return calculo
}

fun ComprobarPositivo():Float
{
    var positivo = false
    var n :Float= 0f
    while (!positivo)
    {
        n=  devolverNum()
        if(n>=0)
        {
            positivo= true
        }
        else
        {
            println("Numero ingresado negativo, vuelva a intentarlo")
        }
    }

    return n
}


fun devolverNum():Float
{
    var  n :Float? = null
    while (n==null)
    {
        println("Porfavor Escribe un numero para calcular su raiz cuadrada")
        n= devolverNumONull(readln())
    }
    return n
}

fun devolverNumONull(input: String):Float?
{

    return try {
        input.toFloat()
    }
    catch (e: NumberFormatException)
    {
        println("Numero no reconocido o no valido, por favor ingresa un Entero")
        null
    }

}