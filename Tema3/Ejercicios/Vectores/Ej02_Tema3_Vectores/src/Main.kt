fun main() {



    var vectorPares: Array<Int> = Array(10){0}
    var vectorImpares: Array<Int> = Array(10){0}
    DevolverParesImpares(true,vectorPares)
    DevolverParesImpares(false,vectorImpares)

    ImprimirArray(vectorPares,"En la array par ")
    ImprimirArray(vectorImpares, "En la array impar ")


}

fun ImprimirArray(array: Array<Int>, texto: String)
{
    for(i in array.indices)
    {
        println(texto + "en la posicion $i es ${array[i]}")
    }
}



fun DevolverParesImpares(par: Boolean, array: Array<Int>)
{
    var contador = 1
    var i = 0
    while(i<array.size)
    {
        if(contador%2==0 && par)
        {
            array[i]=contador
            i++
            contador++
        }
        else if(contador%2!=0 && !par)
        {
            array[i]=contador
            i++
            contador++
        }
        else
        {
            contador++
        }

    }
}