class Tablero {
    var tamanio=0
    var m:Array<Array<String>>

    constructor(tamanio:Int){
        this.tamanio = tamanio
        m=Array(tamanio){Array(tamanio){"_"}}
    }
    fun escribirCasilla(letra:String, c:Casilla){
        m[c.fila][c.columna]=letra
    }
    fun imprimirTablero(){
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
    fun comprobarPosicion(c:Casilla):Boolean{
        return m[c.fila][c.columna]!="_"
    }
    fun tableroLLeno(turnos:Int):Boolean{
        return (tamanio*tamanio) == turnos * 2
    }
    fun tableroLLeno():Boolean{
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
        return lleno
    }
    fun puntuacion (c:Casilla):Int{
        var contar=0
        if (m[c.fila][c.columna]=="S"){
            var auxF = c.fila-1
            var auxC = c.columna-1
            var auxF1 = c.fila+1
            var auxC1 = c.columna+1
            if (auxF>=0 && auxC>=0 && auxF1< m.size && auxC1 < m.size ){
                if (m[auxF][auxC]=="O" && m[auxF1][auxC1]=="O") contar++
            }
            auxF = c.fila+1
            auxC = c.columna-1
            auxF1 = c.fila-1
            auxC1 = c.columna+1
            if (auxF<m.size && auxC>=0 && auxF1>=0 && auxC1 < m.size ) {
                if (m[auxF][auxC] == "O" && m[auxF1 ][auxC1 ] == "O") contar ++
            }
        }
        return contar
    }

}