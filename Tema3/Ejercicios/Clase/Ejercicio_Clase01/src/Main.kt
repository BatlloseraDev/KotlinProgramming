fun main() {
    var arrayNumeros: Array<Int> = Array(5) {0}


    for(i in 0 .. (arrayNumeros.size-1) step 1)
    {
        arrayNumeros[i]= PedirNumero("Ingresa un numero que quieras guardar en la posicion ${i+1}")
    }

    println("Los numeros son:")
    for(i in 0 .. (arrayNumeros.size-1) step 1)
    {
        println("El numero en la posicion ${i+1} es ${arrayNumeros[i]}")
    }

}


fun PedirNumero(texto: String): Int
{
    println(texto)
    var num = readln().toInt()
    return num
}