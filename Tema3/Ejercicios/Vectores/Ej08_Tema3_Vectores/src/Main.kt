fun main() {

    var array1: Array<Int> = arrayOf(1,2,3,4,5)
    var array2 : Array<Int> = Array(5){0}

    InvertirArray(array1,array2)
    array2.forEach { println(it) }
}


fun InvertirArray(arrayBase:Array<Int>, arrayACambiar: Array<Int>)
{
    var cont= 0

    for(i in arrayBase.size-1 downTo 0 step 1 )
    {
        arrayACambiar[cont]= arrayBase[i]
        cont++
    }
}