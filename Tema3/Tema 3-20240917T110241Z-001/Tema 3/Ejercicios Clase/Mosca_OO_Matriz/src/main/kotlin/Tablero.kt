class Tablero {
    var m:Array<Array<String>>

    constructor(fila:Int,columna:Int){
        this.m = Array(fila){Array(columna){"_"}}
    }

    fun imprimirTablero(){
        print("   ")
        for (i in 1..m[0].size){
            print(" $i ")
        }
        println()
        for (i in m.indices){
            print(" ${i+1} ")
            for (j in 0..< m[i].size){
                print("[${m[i][j]}]")
            }
            println()
        }
    }
}