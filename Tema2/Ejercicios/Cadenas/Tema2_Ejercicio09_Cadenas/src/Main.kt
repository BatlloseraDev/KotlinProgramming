fun main() {

    var cadena= PedirCadena("Escribe lo que quieras para contar cuantas palabras tiene la frase")
    println("El contador de palabras total es ${ContadorPalabras(cadena)}")
}

fun ContadorPalabras(cadena:String): Int
{
    var contador=0
    var contadorLetras= 0
    for(i in cadena)
    {
        if(i==' '||i == cadena[cadena.length-1])
        {
            if(i == cadena[cadena.length-1] && i!=' ')
            {
                contador++
            }else if(i==' ' && contadorLetras!=0)
            {
                contador++
                contadorLetras= 0
            }
        }
        else
        {
            contadorLetras++
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