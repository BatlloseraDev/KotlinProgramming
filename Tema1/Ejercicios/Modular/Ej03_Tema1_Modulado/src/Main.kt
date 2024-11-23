fun main() {

    var n = devolverNum()
    println("El numero ingresado es: ${devolverValor(n)}")

}

fun devolverValor(numero:Int):String
{
    var s = ""
    if(numero>=0)
    {
        s= "Es positivo"
    }
    else
    {
        s="Es negativo"
    }

    return s
}


fun devolverNum():Int
{
    var  n :Int? = null
    while (n==null)
    {
        println("Porfavor escribe un numero entero positivo o negativo")
        n= devolverNumONull(readln())
    }
    return n
}

fun devolverNumONull(input: String):Int?
{

    return try {
        input.toInt()
    }
    catch (e: NumberFormatException)
    {
        println("Numero no reconocido o no valido, por favor ingresa un Entero")
        null
    }

}