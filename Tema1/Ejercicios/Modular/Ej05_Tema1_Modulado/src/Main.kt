fun main() {
    ComprobarSiEsBisiesto()
}

fun ComprobarSiEsBisiesto()
{
    var n= DevolverNum()
    if(EsBisiesto(n)) println("El año introducido ($n) es bisieto")
    else println("El año introducido ($n) no es bisiesto")
}

fun EsBisiesto(anio : Int):Boolean
{
    if(anio%4==0 && anio%100==0 || anio%400==0 ) return true
    else return false
}



fun DevolverNum():Int
{
    var  n :Int? = null
    while (n==null)
    {
        println("Porfavor Escribe un numero para calcular si es un año bisiesto o no")
        n= DevolverNumONull(readln())
    }
    return n
}


fun DevolverNumONull(input: String):Int? {

    return try {
        input.toInt()
    } catch (e: NumberFormatException) {
        println("Numero no reconocido o no valido, por favor ingresa un Entero")
        null
    }

}
