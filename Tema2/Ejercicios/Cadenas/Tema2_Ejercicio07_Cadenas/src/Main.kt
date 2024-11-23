fun main() {

    var numero = PedirCadena("Introduce el numero telefonico")
    var nuevaCadena = CambiarFormaNumero(numero)
    println("La nueva cadena es $nuevaCadena")

}


fun CambiarFormaNumero(cadena: String) : String
{
    var longitud = cadena.length-1
    var nCadena= "(+"
    for(i in 0..longitud step 1)
    {
        nCadena+=cadena[i]
        if(i==1)
        {
            nCadena+=")-"
        }
        if(i==4)
        {
            nCadena+="-"
        }
    }
    return nCadena
}



fun PedirCadena(mensaje: String) :String
{
    println(mensaje)
    var c = readln()
    return c

}