import kotlin.random.Random

fun main() {

    //Primero Check
    //Luego Hacer

    //Inicializo
    var humedadSuelo= 0 // 1= baja, 2=Media, 3= Alta
    var radiacion = 0 // 1 = baja, 2 = alta
    var humedadAire = 0 // 1 = baja, 2 = alta
    var crecimiento = 0 // 1= baja, 2= alta
    var accion = 0 // 1= se rego, 2= se rego dos veces, 3= no se rego
    var accionPasada = 0 // 1= se rego, 2= se rego dos veces, 3= no se rego

    //bucle
    var n = DevolverInt("Introduce cuantas veces quiere que se repita")//veces que se va a hacer
    var contador = 0
    while(contador<n)
    {
        //Checks
        humedadSuelo = ObtenerRandom(1,4)
        radiacion = ObtenerRandom(1,3)
        humedadAire = ObtenerRandom(1,3)
        crecimiento = ObtenerRandom(1,3)

        println("Valores obtenidos: \nHumedad Suelo: $humedadSuelo\nRadiacion: $radiacion\nHumedad Aire: $humedadAire" +
                "\nCrecimiento: $crecimiento")
        //Condicionantes
        if(humedadSuelo==1 ||((radiacion==1 && humedadAire==1) ||crecimiento==1))
        {
            println("Activando regado")
            accion = 1
        }
        if(humedadSuelo==1 && radiacion==1 && humedadAire==2 && crecimiento==1)
        {
            println("Activando el regado 2 veces")
            accion = 2
        }
        if((humedadSuelo==2 || radiacion==2 || humedadAire ==2) && crecimiento==2)
        {
            println("No riego esta vez")
            accion = 3
        }
        if((humedadSuelo==3 || radiacion==2 )&& humedadAire ==2 || crecimiento==2)
        {
            println("Hago lo contario")
            if(accionPasada == 1 || accionPasada ==2)
            {
                accion= 3
            }
            else accion = 1
        }
        accionPasada = accion
        contador++
    }

}




fun ObtenerRandom(minimoIncluyente: Int, maximoExcluyente: Int): Int
{
    return Random.nextInt(from = minimoIncluyente, until = maximoExcluyente)
}



fun DevolverInt(cadena : String):Int
{
    var n : Int? = null
    while (n==null)
    {
        println(cadena)
        n = DevolverIntONull(readln())
    }

    return n
}


fun DevolverIntONull(string: String): Int?
{
    return try
    {
        string.toInt()
    }
    catch (e: NumberFormatException)
    {
        println("Numero no reconocido o no valido, por favor ingresa un entero")
        null
    }
}


