fun main() {

    var num = DevolverInt("Ingresa un numero para ver cuantos pares e impares contiene")
    println(CalculoParesImapres(num))

}

fun CalculoParesImapres(num: Int):String
{
    var numAux= num
    var contadorPar= 0
    var contadorImpar= 0
    while(numAux>0)
    {
        var temp = numAux%10
        if(temp%2==0) contadorPar++
        else contadorImpar++
        numAux/=10
    }

    return "El numero $num tiene $contadorPar pares y $contadorImpar imapres"

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

