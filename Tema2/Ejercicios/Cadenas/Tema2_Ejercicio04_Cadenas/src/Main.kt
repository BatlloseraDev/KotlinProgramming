fun main() {
    var c = PedirCadena("Escribe una oración").uppercase()
    var vocal = PedirCadena("Escribe que vocal quieres contar").uppercase()
    println("la vocal en la frase se repite ${ContarVocal(c,vocal[0])} vez/veces")
    println("hashCode ${c.hashCode()} y la vocal ${vocal.hashCode()}")


}

fun ContarVocal(cadena:String,vocal: Char):Int
{
    var longitudCadena = cadena.length -1
    var contador = 0
    for(i in longitudCadena downTo 0 step 1)
    {
        if (EsLaVocal(cadena[i], vocal))
        {
            contador++
        }
    }
    return contador
}



fun EsLaVocal(char:Char,charComprobante:Char): Boolean
{
    var bool = false
   if(char.code == charComprobante.code)
   {
       bool= true
   }

    return bool
}


fun PedirCadena(mensaje: String) :String
{
    println(mensaje)
    var c = readln()
    return c

}