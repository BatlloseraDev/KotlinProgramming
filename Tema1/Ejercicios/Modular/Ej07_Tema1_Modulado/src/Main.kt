fun main() {
    Proceso()
}

fun Proceso()
{
    var temp = DevolverFloat()
    var opc = DevolverInt()
    if(opc==1)
    {
        println("La temperatura en Farenheit es ${GradosAFarenheit(temp)}")
    }
    else
    {
        println("La temperatura en Grados es ${FarenheitAGrados(temp)}")
    }


}


fun GradosAFarenheit(t: Float):Double
{
    var calculo = ((t.toDouble())*(9.0/5.0))+32.0
    return calculo
}
fun FarenheitAGrados(t: Float):Double
{
    var calculo =((t.toDouble())-32.0)*(5.0/9.0)
    return calculo
}

fun DevolverInt():Int
{
    var  n :Int? = null
    while (n==null || n <1 || n>=3)
    {
        if(n!=null)
        {
            println("Opcion seleccionada no valida")
        }
        println("Si estaba en Grados y la quieres pasar a Farenheit pulsa 1" +
                "\nSi estaba en Fanrenheit y la quieres pasar a grados pulsa 2")
        n= DevolverIntONull(readln())
    }
    return n
}

fun DevolverIntONull(input: String):Int?
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



fun DevolverFloat():Float
{
    var  n :Float? = null
    while (n==null)
    {
        println("Por favor escribe la temperatura")
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