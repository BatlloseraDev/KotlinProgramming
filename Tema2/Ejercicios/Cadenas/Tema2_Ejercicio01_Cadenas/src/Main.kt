fun main() {

    //Ejercicio 1

    var s1 = pedirStringPorTeclado("Ingresa cadena 1")

    var s2 = pedirStringPorTeclado("Ingresa cadena 2")


    CompararTamanioCadenas(s1,s2)
    println("Hay una diferencia en las dos cadenas alfabeticamente de " + CompararCadenaAlfabeticamente(s1,s2))

    if(CompararCadenasSinSonIguales(s1,s2)) println("Son exactamente iguales")
    else println("No son exactamente iguales")






}


fun CompararTamanioCadenas(cadena1 : String, cadena2: String)
{
    if(cadena1.length != cadena2.length)
    {
        if(cadena1.length> cadena2.length) println("La cade 1 es mas larga que la cadena 2")
        else println("La cadena 2 es mas larga que la cadena 1")
    }
    else println("La dos cadenas son igual de largas")
}


fun CompararCadenaAlfabeticamente(cadena1 : String, cadena2: String): Int
{
    return cadena1.compareTo(cadena2)
}

fun CompararCadenasSinSonIguales(cadena1 : String, cadena2: String) :Boolean
{
    var bool = false
    if (cadena1.equals(cadena2)) bool= true

    return bool
}

fun pedirStringPorTeclado(pregunta: String): String
{
    println(pregunta)
    var c = readln()
    return c
}