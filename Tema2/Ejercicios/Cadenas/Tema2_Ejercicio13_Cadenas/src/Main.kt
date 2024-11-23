fun main() {

    var palabra = CadenaLetras("Introduce una palabra de 5 letras", "Error, la palabra no contiene 5 letra", 5).lowercase()
    var intentos= 5
    var palabraIntento = "-----"
    var ganar= false
    repeat(50){ println() }

    println("Que empiece el juego!")

    while(intentos!=0)
    {
        //enseñar la pista
        println("Pista: ${DevolverPista(palabra,palabraIntento)}" )

        //ingresar intento
        palabraIntento = CadenaLetras("Introduce una palabra de 5 letras que quieras intentar", "introduce una palabra valida", 5 ).lowercase()

        //comprobar si ganó

        if(palabraIntento==palabra)
        {
            ganar = true
            intentos= 0

        }
        else
        {
            intentos--
        }

    }
    if(ganar)
    {
        println("Felicidades has ganado")
    }
    else
    {
        println("No pasada, espero que tengas mas suerte la proxima vez, la palabra era: $palabra")
    }

}





fun DevolverPista(palabra: String, intento:String): String
{
    var cadenaDevolver = ""


    for(i in intento.indices)
    {
        var mismaPos = 0 // 0 para no existe en la palabra, 1 para es contenida y posicion distinta 2 para es contenida y es la misma pos
        for(j in palabra.indices)
        {
            if(intento[i] == palabra[j] && i ==j) // es la misma palabra en posicion disintinta
            {
                mismaPos = 2
            }
            else if(intento[i] == palabra[j] && i!=j && mismaPos!=2) // por si se vuelve a repetir la letra que prevalezca la anterior.
            {
                mismaPos = 1
            }
        }

        //aqui genero la cadena del comprobante

        when(mismaPos)
        {
            0->{
                cadenaDevolver +="-"
            }
            1->{
                cadenaDevolver +="*"
            }
            2->{
                cadenaDevolver +="${intento[i]}"
            }
        }

    }


    return cadenaDevolver
}


fun CadenaLetras(mensaje: String, mensajeError :String, numLetras: Int): String
{
    var cadena= ""
    var contador= 0
    do{

        cadena= PedirCadena(mensaje)
        contador = cadena.length
        if(contador!=5)
        {
            println(mensajeError)
        }
    }while (contador!=5)

    return cadena
}




fun PedirCadena(mensaje: String) :String
{
    println(mensaje)
    var c = readln()
    return c

}