fun main() {


    println("La cadena invertida es ${InvertirCadena(PedirCadena("Porfavor Ingresa una cadea"))}")


}


fun PedirCadena(mensaje: String) :String
{
    println(mensaje)
    var c = readln()
    return c

}

fun InvertirCadena(cadena: String) :String
{
    var longitudCadena= cadena.length -1
    var devolver: String = ""

    for( char in longitudCadena downTo 0 step 1)
    {
        devolver+=cadena[char]
    }
    /*var contador= cadena.length-1
    while(contador>=0)
    {
        devolver += cadena[contador]
        contador--
    }*/

    return devolver.uppercase()
}