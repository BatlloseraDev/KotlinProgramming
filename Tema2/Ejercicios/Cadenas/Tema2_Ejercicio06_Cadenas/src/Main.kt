fun main() {

    var cadena1 = PedirCadena("Escribeme una frase larga")
    var cadena2 = PedirCadena("Escribeme la palabra que quieres que compruebe si se repite")

    println("La frase tiene ${ComprobarPalabra(cadena1.lowercase(),cadena2.lowercase())} vez/veces" +
            " repertida la palabra $cadena2")



}

fun ComprobarPalabra(primordial: String, secundaria : String) :Int
{

    var longitud = primordial.length-1
    var contador = 0
    var palabra =""
    for(i in 0 ..longitud step 1)
    {
        //println("Es un espacio ? ${c[i].code}")
        if(primordial[i].code ==32 || i ==longitud)
        {
            if(i==longitud)
            {
                palabra+=primordial[i]
            }
            //espacio por lo tanto reset
            if(palabra==secundaria && palabra!="")
            {
                contador++
            }
            palabra=""
        }
        else
        {
            palabra+=primordial[i]
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
