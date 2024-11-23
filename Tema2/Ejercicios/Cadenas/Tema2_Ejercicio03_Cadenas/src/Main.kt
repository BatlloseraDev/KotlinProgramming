fun main() {

    println("La frase introducida tiene ${ContadorVocales(PedirCadena("Ingresa las vocales").uppercase())} vocales")

}


fun ContadorVocales(cadena: String): Int
{
    var longitud= cadena.length-1
    var contador = 0
    for (char in longitud downTo 0 step 1)
    {
        if(EsVocal(cadena[char]))
        {
            contador++
        }
    }
    return contador
}

fun EsVocal(char:Char): Boolean
{
    var bool = false
    when(char.code)
    {
        65,69,73,79,85 -> bool = true
    }

    return bool
}


fun PedirCadena(mensaje: String) :String
{
    println(mensaje)
    var c = readln()
    return c

}
