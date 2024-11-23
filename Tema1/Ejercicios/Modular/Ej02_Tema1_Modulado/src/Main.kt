fun main() {

    var r = devolverNum()
    println("El area del ciruclo es ${AreaCirculo(r)} y la circuferencia es ${CircunferenciaCirculo(r)}")

}

fun AreaCirculo(radio: Float):Double
{
    var c = radio* radio * Math.PI
    return c
}
fun CircunferenciaCirculo(radio: Float):Double
{
    var c = radio * 2 * Math.PI
    return c
}

fun devolverNum():Float
{
    var  n :Float? = null
    while (n==null)
    {
        println("Porfavor Escribe el radio del circulo para calcular el area y la circuferencia")
        n= devolverNumONull(readln())
    }
    return n
}

fun devolverNumONull(input: String):Float?
{

    return try {
        input.toFloat()
    }
    catch (e: NumberFormatException)
    {
        println("Numero no reconocido o no valido, por favor ingresa un numero valido")
        null
    }

}