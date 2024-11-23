import kotlin.system.exitProcess

fun main() {
    Procedimiento()
}

fun Procedimiento()
{
    var n1 = DevolverFloat("la base")
    var n2= DevolverFloat("la altura")
    Operacion(n1,n2,1)
}


fun Operacion(lado: Float, altura: Float, opcion: Int)
{
    if(opcion==1)
    {
        println("El area del rectangulo es ${lado*altura}")
    }
    else if(opcion==2)
    {
        println("El perimetro es ${(2*lado)+(2*altura)}")
    }
}



fun DevolverFloat(texto: String):Float
{
    var  n :Float? = null
    while (n==null)
    {
        println("Por favor escribe cuanto mide "+texto)
        n= DevolverFloatONull(readln())
    }
    return n
}

fun DevolverFloatONull(input: String):Float?
{

    return try {
        input.toFloat()
    }
    catch (e: NumberFormatException)
    {
        println("Numero no reconocido o no valido, por favor ingresa un numero valido")
        null
    }

}