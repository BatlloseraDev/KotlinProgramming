fun main() {

    var dinero= DevolverFloat("Ingresa una cantidad para calcular la cantidad en monedas")

    println("${DevolverMonedas(dinero, "Las vueltas a devolver son")}")


}

fun DevolverMonedas(dinero: Float, texto:String) :String
{
    var dineroAux = dinero
    var monedas2Euros= 0
    var monedas1Euro= 0
    var monedas50Cent = 0
    var monedas20Cent = 0
    var monedas10Cent = 0
    var monedas5Cent = 0
    var monedas2Cent = 0
    var monedas1Cent = 0
    var cadena= texto
    //esto con un array seria mas corto
    monedas2Euros =  DevolerEuros(dineroAux, 2f )
    if(monedas2Euros!=0)
    {
        dineroAux -=(2*monedas2Euros)
        cadena+= "\n$monedas2Euros moneda/s de 2 euros "
    }
    monedas1Euro = DevolerEuros(dineroAux, 1f)
    if(monedas1Euro!=0)
    {
        dineroAux -=(monedas1Euro)
        cadena+="\n$monedas1Euro moneda/s de 1 euro"
    }
    monedas50Cent = DevolerEuros(dineroAux, 0.5f)
    if(monedas50Cent!=0)
    {
        dineroAux-=(0.5f * monedas50Cent)
        cadena+="\n$monedas50Cent moneda/s de 50 centimos"
    }
    monedas20Cent = DevolerEuros(dineroAux, 0.2f)
    if(monedas20Cent!=0)
    {
        dineroAux-=(0.2f * monedas20Cent)
        cadena+="\n$monedas20Cent moneda/s de 20 centimos"
    }
    monedas10Cent = DevolerEuros(dineroAux, 0.1f)
    if(monedas10Cent!=0)
    {
        dineroAux-=(0.1f * monedas10Cent)
        cadena+="\n$monedas10Cent moneda/s de 10 centimos"
    }
    monedas5Cent = DevolerEuros(dineroAux, 0.05f)
    if(monedas5Cent!=0)
    {
        dineroAux-=(0.05f * monedas5Cent)
        cadena+="\n$monedas5Cent moneda/s de 5 centimos"
    }
    monedas2Cent = DevolerEuros(dineroAux, 0.02f)
    if(monedas2Cent!=0)
    {
        dineroAux-=(0.02f * monedas2Cent)
        cadena+="\n$monedas2Cent moneda/s de 2 centimos"
    }
    monedas1Cent = DevolerEuros(dineroAux, 0.01f)
    if(monedas1Cent!=0)
    {
        dineroAux-=(0.01f * monedas1Cent)
        cadena+="\n$monedas1Cent moneda/s de 1 centimos"
    }

    return cadena
}

fun DevolerEuros(dineroAux: Float, monedaAux:Float ): Int {
    var dineroAux1 = dineroAux
    var contador=0
    while (dineroAux1 >= monedaAux) {
        dineroAux1 -= monedaAux
        contador++
    }

    return contador
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
        println("Numero no reconocido o no valido, por favor ingresa una entrada valida")
        null
    }
}