import kotlin.random.Random

fun main() {

    println("Introduce el numero de caras del dado");
    var n  = readln().toInt()
    println("El resultado ha sido ${devolverResultado(n)}")


}



fun devolverResultado(nCaras:Int):Int
{
    return (Random.nextFloat()*nCaras).toInt()
}