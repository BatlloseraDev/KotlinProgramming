fun main() {

    var cadena = PedirCadena("Escribe la oracion para calcular cuantas vocales hay en un texto")
    println("a ${ContarVocales(cadena,'a')} ${GenerarHistograma(ContarVocales(cadena,'a'))}\n" +
            "e ${ContarVocales(cadena,'e')} ${GenerarHistograma(ContarVocales(cadena,'e'))}\n" +
            "i ${ContarVocales(cadena, 'i')} ${GenerarHistograma(ContarVocales(cadena, 'i'))}\n" +
            "o ${ContarVocales(cadena, 'o')} ${GenerarHistograma(ContarVocales(cadena, 'o'))}\n" +
            "u ${ContarVocales(cadena, 'u')} ${GenerarHistograma(ContarVocales(cadena, 'u'))}\n")

}

fun GenerarHistograma(num:Int):String
{
    var cadena= ""
    for(i in 0 .. (num-1) step 1)
    {
        cadena+="*"
    }
    return cadena
}

fun ContarVocales(c : String, vocal: Char):Int
{
    var cadena= c.lowercase()
    var contador = 0
    for(i in cadena)
    {
        if(vocal == i)
        {
            contador++
        }
    }

    return contador
}





fun PedirCadena(mensaje: String) :String
{
    println(mensaje)
    var c = readln()
    return c

}