fun main() {
    var cadena = PedirCadena("Escribe el mensaje a codificar")
    val CESAR = 5
    println("La cadena codificada es ${Codificacion(cadena.uppercase(),CESAR)}")

}

fun Codificacion(cadena:String, cod:Int):String
{
    var devolver = ""
    var longitud = cadena.length-1
    for(i in 0 ..longitud step 1 )
    {
        var ascii= cadena[i].code
        if(ascii!=32)
        {
            ascii+= cod
            if(ascii>90)
            {
                ascii-=25
            }
        }
        devolver+= "${ascii.toChar()}"
    }
    return devolver
}






fun PedirCadena(mensaje: String) :String
{
    println(mensaje)
    var c = readln()
    return c

}