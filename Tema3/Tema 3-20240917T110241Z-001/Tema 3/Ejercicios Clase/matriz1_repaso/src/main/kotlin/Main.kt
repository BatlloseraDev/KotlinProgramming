fun main(args: Array<String>) {
    var m = Array(5){Array<Int>(6){0}}
    var v = arrayOf(1,0,3,4,5)
    inicilizarMatriz(m,1)
    println(devolverValor(v,2))
    //println(m[0][0])
}
fun devolverValor(a:Array<Int>,posicion:Int):Int{
    var valor= posicion
    if (posicion < 0 || posicion >= a.size) {
        valor = 0
    }
    return a[valor]
/**
    if (posicion >= 0 && posicion < a.size) return a[valor]
    return a[0]

    if (posicion >= 0 && posicion < a.size) valor=posicion
    else valor=0

    return a[valor]**/
}
fun inicilizarMatriz(m:Array<Array<Int>>, valor:Int){
    for(i in m.indices){
        for (j in 0..<m[i].size){
            m[i][j]=valor
        }
    }
    for(k in m){
        for (l in k) {
            print(l)
        }
        println()
    }
    fun devolverAdyacentes(a:Array<Int>,posicion:Int) {
       // var valor = posicion
        if (posicion >= 0 && posicion < a.size) {
            if (posicion == 0) {
                print(a[posicion + 1])
            } else if (posicion == a.size - 1) {
                print(a[posicion - 1])
            } else {
                print(a[posicion - 1])
                print(a[posicion + 1])
            }
        }else {
            print("ERROR")
        }

    }
    fun devolverAdyacentes2(a:Array<Int>,posicion:Int):Array<String> {
        var s =Array<String>(2){"X"}
        if (posicion >= 0 && posicion < a.size) {
            if (posicion == 0) {
                print(a[posicion + 1])
                s[0] =a[posicion + 1].toString()
                //s[1] ="X"
            } else if (posicion == a.size - 1) {
                print(a[posicion - 1])
                s[1] =a[posicion - 1].toString()
                //s[0]="X"
            } else {
                print(a[posicion - 1])
                print(a[posicion + 1])
                s[0] =a[posicion + 1].toString()
                s[1] =a[posicion - 1].toString()
            }
        }else {
            print("ERROR")
        }
        return s
    }

}