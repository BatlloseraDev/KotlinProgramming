fun main() {

    var cadena= PedirCadena("Escribe una minuscula")
    println("La letra en mayus es ${DevolverMayus(cadena[0])}")

}


fun DevolverMayus(cadena: Char) :String
{
    //var nuevaLetra = (cadena.toInt()-32).toChar()
    var nuevaLetra = (cadena.code-32).toChar()
    //cadena.code
    return nuevaLetra.toString()
}




fun PedirCadena(mensaje: String) :String
{
    println(mensaje)
    var c = readln()
    return c

}
