import java.io.DataInput

fun main() {

    //1º Realiza un programa modular que calcule la superficie y el perímetro de un
    //cuadrado cuyo lado pediremos por teclado.

    var num = devolverNum()
    Operacion("La superficie es",num, num)
    Operacion("El perimetro es", num,4f)
    println("La superficie es ${SuperficieCuadrado(num)} y el perimetro es ${PerimetroCuadrado(num)} ")

}

fun Operacion(opcion:String, num: Float, num2:Float)
{
    var calculo= num *num2
    println(opcion+""+calculo)
}




fun Operacion(opcion:String, num: Float)
{
    if(opcion=="Perimetro")
    {
        println("El perimetro es ${PerimetroCuadrado(num)}")
    }
    else if(opcion=="Superficie")
    {
        println("La superficie es ${SuperficieCuadrado(num)}")
    }
    else println("Opcion seleccionada erronea")
}





fun PerimetroCuadrado(lado: Float):Float
{
    var c = 4*lado
    return c
}

fun SuperficieCuadrado(lado:Float):Float
{
    var c = lado*lado
    return c
}

fun devolverNum():Float
{
    var  n :Float? = null
    while (n==null)
    {
        println("Porfavor Escribe el lado de un cuadrado para calcualar la superficie y el perimetro")
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
        println("Numero no reconocido o no valido, por favor ingresa un Entero")
        null
    }

}