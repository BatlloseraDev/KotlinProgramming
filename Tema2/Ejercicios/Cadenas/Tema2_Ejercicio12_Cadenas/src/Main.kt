fun main() {

    var  palabra = PedirCadena("Ingresa la palabra que el siguiente usuario tendra que advinar").lowercase()
    repeat(50){ println() } // limpiar la consola
    var intentos= 0
    var letrasEncontradas = ""
    var letraEvaluar = ""
    var win = false
    var salir= false
    var letrasQueNoPertenecen= ""

    println("¡Que empiece el juego!")
    while (intentos<7 && !salir)
    {
        println(PrintIntentos(intentos) +" \n ${MostrarLetrasEncontradas(letrasEncontradas,palabra)} " +
                "\n Letras que no pertecen: $letrasQueNoPertenecen")

        var opc = DevolverInt("¿Que desea intentar? " +
                "\n(1). Adivinar letra" +
                "\n(2). Adivinar palabra" +
                "\n(3). Rendirse/Salir")

        when(opc)
        {
            1->{
                letraEvaluar= pedirSoloUnaLetra("Ingresa la letra que crees que esta en la palabra").lowercase()
                if(ComprobarSiHay(letraEvaluar,palabra))
                {
                    //encontro una letra por ende lo agrego
                    letrasEncontradas+= letraEvaluar
                    //Contar las letras por encontrar
                    var faltan= ContarPalabrasPorEncontrar(letrasEncontradas,palabra)
                    if(faltan==0)
                    {
                        win = true
                        salir = true
                    }
                    else
                    {
                        println("Te falan $faltan letras por encontrar")
                    }

                }
                else
                {
                    letrasQueNoPertenecen+="$letraEvaluar, "
                    intentos++
                }
            }
            2->{
                var intento = PedirCadena("Ingresa la palabra que crees que es").lowercase()
                if(intento==palabra)
                {
                    win=true
                    println("¡ES LA PALABRA!")
                    salir=true
                }
                else
                {
                    println("No es la palabra, ¡Sigue intentandolo!")
                    intentos++
                }


            }
            3->{
                println("Saliendo del programa")
                salir= true
            }
        }



    }
    if(win)
    {
        println("Has ganado felicidades has conseguido adivinar la palabra")
    }
    else
    {
        println("La palabra era: $palabra \nNo pasa nada buena suerte la próxima vez")
    }


}



fun ContarPalabrasPorEncontrar(letras:String, palabra: String):Int
{

    var contador = 0

    for (i in palabra)
    {
        var checkTemp = false
        if(letras.length!=0)
        {
            for(j in letras)
            {
                if(j == i)
                {
                    checkTemp= true
                }
            }
        }
        if(!checkTemp)
        {
            contador++
        }

    }
    return contador
}




fun MostrarLetrasEncontradas(letras:String,palabra:String):String
{
    var cadenaDevolver = ""

    for (i in palabra)
    {
        var checkTemp = false
        if(letras.length!=0)
        {
            for(j in letras)
            {
                if(j == i)
                {
                    checkTemp= true
                }
            }
        }
        if(checkTemp)
        {
            cadenaDevolver+=i
        }
        else
        {
            cadenaDevolver+="_"
        }
    }
    return cadenaDevolver
}



fun pedirSoloUnaLetra(texto:String):String
{

    var cantidadLetras=0
    var letra = ""
    do
    {   println(texto)
        letra= readln()
        cantidadLetras= letra.length
        if(cantidadLetras!=1)
        {
            println("Cantidad de letras erronea")
        }

    }while (cantidadLetras!=1)
    return letra
}


fun ComprobarSiHay(letra:String, palabra:String):Boolean
{
    var esta = false

    for(i in palabra)
    {
        if(i==letra[0])
        {
            esta=true
        }
    }

    return esta
}





fun PrintIntentos(num:Int):String
{
    var dibujo = """ """
    when(num)
    {
        0-> dibujo="""
            
  +---+
      |
      |
      |
      |
      |
=========            
            
        """.trimIndent()
        1-> dibujo="""           
  +---+
  |   |
      |
      |
      |
      |
=========
        """.trimIndent()
        2-> dibujo="""   
  +---+
  |   |
  O   |
      |
      |
      |
=========
            
        """.trimIndent()
        3->dibujo="""
  +---+
  |   |
  O   |
  |   |
      |
      |
=========
            
        """.trimIndent()
        4->dibujo="""
  +---+
  |   |
  O   |
 /|   |
      |
      |
=========      
            
        """.trimIndent()
        5->dibujo="""
  +---+
  |   |
  O   |
 /|\  |
      |
      |
=========            
                       
        """.trimIndent()
        6->dibujo="""       
  +---+
  |   |
  O   |
 /|\  |
 /    |
      |
=========
            
        """.trimIndent()
        7->dibujo="""
  +---+
  |   |
  O   |
 /|\  |
 / \  |
      |
=========

        """.trimIndent()
    }



    return dibujo
}

fun PedirCadena(mensaje: String) :String
{
    println(mensaje)
    var c = readln()
    return c

}

fun DevolverInt(texto:String):Int
{
    var  n :Int? = null
    while (n==null)
    {
        println(texto)
        n= DevolverIntONull(readln())
    }
    return n
}

fun DevolverIntONull(input: String):Int? {
    return try {
        input.toInt()
    } catch (e: NumberFormatException) {
        println("Numero no reconocido o no valido, por favor ingresa una entrada valida")
        null
    }
}