fun main() {


    var num= DevolverInt("Escribe un numero para saber la suma de sus digitos")
    println("La suma de los digitos es ${DevolerSuma(num)}")
    println("El mayor es ${DevolverMayor(DevolverInt("Escribe el primer numero"),DevolverInt("Escribe el segundo numero"))}")


}

fun DevolverMayor(n1:Int, n2:Int): String
{
    var cadena= ""
    var nC1 = DevolerSuma(n1)
    var nC2 = DevolerSuma(n2)
    if(nC1>nC2) cadena= "El numero $n1 es mayor en la suma de sus numero con un restultado de" +
            " $nC1"
    else cadena= "El numero $n2 es mayor en la suma de sus digitos con un resultado de" +
            " $nC2"

    return cadena
}

fun DevolerSuma(n: Int):Int
{
    var nAux= n
    var sumatorio= 0
    while(nAux>0)
    {
        var temp= nAux%10
        sumatorio+= temp
        nAux/=10
    }

    return sumatorio
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