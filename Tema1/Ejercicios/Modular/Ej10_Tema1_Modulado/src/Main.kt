fun main() {


    var dias= DevolverInt("¿Cuantos dias has trabajado?")
    var domingos = DevolverInt("Cuantos domingos has trabajado?")
    if(domingos>dias)
    {
        println("No puede haber trabajado mas domingos que dias")
    }
    else
    {
        Calcular(dias, domingos)
    }


}


fun Calcular(dias: Int, domingos: Int)
{
    var diasSinDomingos= dias-domingos
    var n = DevolverInt("De los siguientes dias $diasSinDomingos (no domingos) cuantos fueron en el turno de noche")
    if(n>diasSinDomingos)
    {
        println("No puedes poner mas dias de noche que dias que has hecho")
    }
    else
    {
        var n2 = DevolverInt("¿Y de cuantos domingos (de los $domingos que has ingresado) has trabajado de noche ? ")
        if(n2>domingos)
        {
            println("No puedes haber trabajado mas noches de domingo que domingos ")
        }
        else
        {
            //calcular el total.
            var total =  CalcularSalarioTotal(diasSinDomingos-n, n, domingos-n2,n2 )
            var porDia = CalcularPrecioPorDia(dias,total)
            println("El salario total es $total y el salario por dia es $porDia")

        }
    }



}
fun  CalcularPrecioPorDia(diasTotales: Int, SalarioTotal: Int) :Double
{
    var total: Double= SalarioTotal.toDouble()/diasTotales
    return total
}

fun CalcularSalarioTotal(dias: Int, diasNoche:Int, domingos:Int, domingosNoche:Int) :Int
{

    var total= (dias * 8/* horas*/* 20/*Precio hora*/)+(diasNoche *8*35) +(domingos * 8* 30) +(domingosNoche*8*50)
    return total

}

fun DevolverInt(num:String):Int
{
    var  n :Int? = null
    while (n==null)
    {

        println(num)
        n= DevolverIntONull(readln())
    }
    return n
}

fun DevolverIntONull(input: String):Int? {
    return try {
        input.toInt()
    } catch (e: NumberFormatException) {
        println("Numero no reconocido o no valido, por favor ingresa un entero")
        null
    }
}