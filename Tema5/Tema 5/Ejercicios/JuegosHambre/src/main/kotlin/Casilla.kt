class Casilla {
    var fila=-1
    var columna = -1
    var item: Item?=null
        set(value){
            field = value
            estado="I"
        }
    var tributo: Tributo?=null
        set(value){
            field = value
            estado="T"
        }
    var estado = "O" //I item , T tributo

    constructor(fila:Int, columna: Int){
        this.fila = fila
        this.columna = columna
    }

    fun  esvacia():Boolean{
        return (fila + columna) == -2
    }
    fun adyacente(filaTotal:Int):Int{
        var f: Int
        var c: Int
        var filaAux: Int
        var columnaAux: Int
        do {
           // do {
                f = (-1..1).random()
                c = (-1..1).random()
           // }while(f== 0 && c==0)
            filaAux = fila + f
            columnaAux = columna + c
        } while (filaAux < 0 || filaAux >= filaTotal || columnaAux < 0 || columnaAux >= filaTotal)
        return filaAux * filaTotal + columnaAux
    }
    override fun toString(): String {
        return estado
    }


}