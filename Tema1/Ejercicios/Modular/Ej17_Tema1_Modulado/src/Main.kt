import kotlin.math.pow

fun main() {

    var a = DevolverFloat("Introduce el primer valor de la ecuacion")
    var b = DevolverFloat("Introduce el segundo valor de la ecuacion")
    var c = DevolverFloat("Introduce el tercer valor de la ecuacion")

    var calculo: Float= CalculoDeMultiplesSolucuiones(a,b,c)
    if(calculo==0f)
    {
       println("la ecuacion $a*x^2 + $b*x +$c tiene solo una solucion que es ${Calculo(b,a,0f)}")
    }
    else if(calculo<0f)
    {
        println("La ecuacion $a*x^2 + $b*x +$c no tiene solucion real")
    }
    else
    {
           println("La ecuacion tiene dos soluciones: " +
                   "\n1. ${Calculo(b,a, calculo)}" +
                   "\n2. ${Calculo(b,a,(-calculo))}")
    }
}


fun Calculo(b:Float,a: Float, z:Float) : Float
{
    var y:Float
    if(z<0)
    {
        var x= z*-1
        y = ((Math.sqrt(x.toDouble()))*(-1)).toFloat()
    }
    else y = (Math.sqrt(z.toDouble())).toFloat()

    return (((-b)+y)/2*a)
}


fun CalculoDeMultiplesSolucuiones(a:Float,b:Float,c:Float) :Float
{
    var r = (b.pow(2))-(4.0f*a*c)
    return r
}


fun DevolverFloat(texto:String):Float
{
    var  n :Float? = null
    while (n==null)
    {
        println(texto)
        n= DevolverIntONull(readln())
    }
    return n
}

fun DevolverIntONull(input: String):Float? {
    return try {
        input.toFloat()
    } catch (e: NumberFormatException) {
        println("Numero no reconocido o no valido, por favor ingresa un entero")
        null
    }
}