fun main(args: Array<String>) {
    val N=3
    val TURNOS = N*N
    var contadorTurnos = 1
    var m= Array(N){Array(N){"_"}}

    imprimirTablero(m)
    do {
        movimientoHumano(m)
        contadorTurnos++
        imprimirTablero(m)
        if (contadorTurnos<TURNOS) {
            movimientoPC(m)
            contadorTurnos++
            imprimirTablero(m)
        }
    }while(contadorTurnos<=TURNOS)

}
fun puntuacion (m:Array<Array<String>>, f:Int, c:Int){
        if (m[f][c]=="S"){
            var auxF = f-1
            var auxC = c-1
            var auxF1 = f+1
            var auxC1 = c+1
            if (auxF>=0 && auxC>=0 && auxF1< m.size && auxC1 < m.size ){
                if (m[auxF][auxC]=="O" && m[f+1][c+1]=="O") print ("Tienes un punto")
            }
            auxF = f+1
            auxC = c-1
            auxF1 = f-1
            auxC1 = c+1
            if (auxF<m.size && auxC>=0 && auxF1>=0 && auxC1 < m.size ) {
                if (m[f + 1][c - 1] == "O" && m[f - 1][c + 1] == "O") print("Tienes un punto")
            }
        }
}
fun tableroLLeno(m:Array<Array<String>>):Boolean{
    var lleno = true
    var i=0
    var j = 0
    while(i<m.size && lleno){
        while(j<m.size && lleno){
            if (m[i][j]=="_"){
                lleno = false
            }
            j++
        }
        j=0
        i++
    }
    for(i in m.indices){
        for (j in m.indices){

        }
    }
    return lleno
}
fun movimientoPC(m:Array<Array<String>>){
    var f:Int =0
    var c: Int = 0
    var l:String=""
    do {
        f= m.indices.random()
        c=(0..<m.size).random()
        l= "OS".random().toString()
    }while(m[f][c]!="_")
    m[f][c]=l
    puntuacion(m,f,c);
}
fun movimientoHumano(m:Array<Array<String>>){
    var f:Int? =0
    var c: Int? = 0
    var l:String=""
    do {
        do {
            print("Dime la Fila: ")
            f = readln().toIntOrNull()
        } while (f == null || f !in 1..m.size)

        do {
            print("Dime la Columna: ")
            c = readln().toIntOrNull()
        } while (c == null || c < 1 || c > m.size)
    }while(m[f!!-1][c!!-1]!="_")

    do {
        print("Dame la letra (O / S): ")
        l = readln().uppercase()
    } while (!(l=="O" || l=="S")) // (l!="O" && l!="S")
    m[f-1][c-1]=l
    puntuacion(m,f-1,c-1);
}
fun imprimirTablero(m:Array<Array<String>>){
    print("   ")
    for (i in 1..m.size){
        print(" $i ")
    }
    println()
    var n=1
    for (i in m){
        print(" $n ")
        for (j in i){
            print("[$j]")
        }
        n++
        println()
    }
}