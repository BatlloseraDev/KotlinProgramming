fun main() {


    var v = CrearArray(7, 9,false)
   ImprimirArray(v)
    println()
    v = CrearArray(7, 2, true)
    ImprimirArray(v)
}


fun ImprimirArray(imp: Array<Int>)
{
    for(i in imp.indices)
    {
        print("${imp[i]} ")
    }
}


fun CrearArray(tamanio: Int,numeroBase: Int, version2: Boolean): Array<Int>
{
    var array:  Array<Int> = Array(tamanio){0}
    for(i in array.indices)
    {
        if(!version2) array[i] = numeroBase+i
        else{
            if(i==0) array[i]= numeroBase
            else{
                array[i] = array[i-1]+i
            }
        }
    }
    return  array
}