fun main() {

    var vectorValoresReales: Array<Int> = Array(10){0}
    for(i in vectorValoresReales.indices)
    {

        vectorValoresReales[i] = DevolverInt("Escribe un numero entero y real para el valor $i")
    }

    println("La media del array es ${CalcularMedia(vectorValoresReales)}")




}


fun CalcularMedia(array: Array<Int>): Double
{
    var sumatorio = 0.0

    for (i in array.indices)
    {
        sumatorio+=array[i]
    }
    sumatorio/=array.size

    return sumatorio
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
        println("Numero no reconocido o no valido, por favor ingresa una entrada valida")
        null
    }
}
