fun main() {
    var a: Array<Int> = Array(5){0}
    var b: Array<Int>


    //println(a)
    a= pedirTeclado()
    b = pedirTeclado()
    imprimirArray(a)
    imprimirArray(b)
    a[4]=9
    a[0]=1
    //imprimirArray(a)

    Intercambiar(a,b)
    imprimirArray(a)
    imprimirArray(b)

}

fun Intercambiar(a: Array<Int>, b:Array<Int>)
{
    var aux: Array<Int> = Array(5){0}
    var cont= 0
    while (cont<a.size)
    {
        aux[cont]= a[cont]
        a[cont]= b[cont]
        b[cont]= aux[cont]
        cont++
    }


}



fun pedirTeclado():Array<Int>
{
    var a: Array<Int> = Array(5){0}
    var cont = 0
    do {
        a[cont] = readln().toInt()
        cont++
    }while (cont<a.size)
    return a
}


fun imprimirArray(a:Array<Int>)
{
    var cont = 0
    println()
    while (cont<a.size)
    {
        //print(""+ a[cont] + ",")
        print("${a[cont]}, ")
        cont ++//cont = cont+1

    }
}