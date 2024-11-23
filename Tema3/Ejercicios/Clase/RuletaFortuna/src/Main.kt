import kotlin.random.Random

fun main() {
    var intento= 0
    var dinero= 0
    while(intento<5)
    {
        var numero= pedirNumero("Ingresa numero entre 1y 35", 1, 35)
        var color= pedirNumero("Ingresa (0) rojo o (1) negro",0,1)
        var num_ganador= Random.nextInt(1,36)
        var col_ganador= Random.nextInt(0,1)
        var dinAux = check(numero,color, num_ganador,col_ganador)
        println("El numero de la ruleta es $num_ganador y el color $col_ganador y has" +
                " ganado/perdido $dinAux")
        dinero+= dinAux
        intento++
    }
    println("El dineor final es $dinero")
}


fun check(num: Int, color:Int, numGan:Int, colGan:Int):Int
{
    var dinero = 0
    if(num==numGan&&color== colGan) dinero= 100
    else if (num==numGan && color!=colGan) dinero=70
    else if(num!=numGan && color==colGan) dinero= 2
    else dinero= -2
    return dinero
}

fun pedirNumero(texto: String, min:Int, max:Int): Int
{
    var n = 0-min-1
    while(n<min||n>max)
    {
        println(texto)
        n= readln().toInt()
    }
    return n
}