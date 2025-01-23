class Mapa {
    var filas=0
    var columnas=0
    var tablero = ArrayList<Casilla>()
   // var distrito = ArrayList<Tributo>()

    var libres = ArrayList<Int>()
    var ocupados = ArrayList<Int>()

    constructor(filas: Int, columnas:Int){
        this.filas = filas
        this.columnas = columnas
        for (f in 0..< (this.filas)){
            for (c in 0..< this.columnas)
            tablero.add(Casilla(f,c))
        }
        for (i in 0..<(this.filas*this.columnas)){
            libres.add(i)
        }
    }
    fun cambiarCasilla(posicion:Int, tributo:Tributo){
        if (libres.contains(posicion)) {
            libres.removeAt(libres.indexOf(posicion))
            ocupados.add(posicion)
            tablero[posicion].tributo = tributo

       }
    }
    fun colocarItem(cantidad:Int, capitolio:Capitolio){
        for (i in 0 until cantidad){
            if (libres.isNotEmpty()) {
                //tablero[posicion].fila = posicion % this.filas
                //tablero[posicion].columna = posicion - ((posicion % this.filas) * this.filas)
                var posicion = libres.random()
                tablero[posicion].item = capitolio.item()
                libres.removeAt(libres.indexOf(posicion))
                ocupados.add(posicion)
            }
        }
    }

    fun colocarDistrito(cantidad:Int, tamanio:Int){
        for (c in 0 until cantidad) {
            for (t in 0 until tamanio) {
                if (libres.isNotEmpty()) {
                    var posicion = libres.random()
                    libres.removeAt(libres.indexOf(posicion))
                    var tri = Tributo(c)
                    tablero[posicion].tributo = tri
                    ocupados.add(posicion)
                }
            }
        }
    }
    fun moverTributos(capitolio:Capitolio) {
        val ocupadosCopia = ArrayList(ocupados)
        for (i in ocupadosCopia) {
            if (tablero[i].estado == "T") {
                var valor: Int
                do {
                    valor = tablero[i].adyacente(filas)
                } while (valor >= tablero.size)
                when (tablero[valor].estado) {
                    "O" -> {
                        cambiarCasilla(valor, tablero[i].tributo!!)
                        tablero[i].tributo = null
                        tablero[i].estado = "O"
                        println ("cambio")
                    }
                    "T" -> {
                        resolverConfrontacion(i, valor, capitolio)
                        println ("muerto")
                    }
                    "I" -> {
                        tablero[i].tributo!!.fuerza += tablero[valor].item!!.nivel
                        tablero[valor].item = null
                        tablero[valor].estado = "T"
                        tablero[valor].tributo = tablero[i].tributo!!
                        // Mover el tributo a la nueva casilla
                        //cambiarCasilla(valor, tablero[i].tributo!!)

                        tablero[i].tributo = null
                        tablero[i].estado = "O"
                        println ("item")
                    }
                }
            }
        }
    }

    fun resolverConfrontacion(i: Int, valor: Int, capitolio:Capitolio) {
        val tributo1 = tablero[i].tributo!!
        val tributo2 = tablero[valor].tributo!!
        when {
            tributo1.vida > tributo2.vida -> {
                capitolio.alCementerio(tributo2)
                tributo2.muerto()
                eliminarTributo(valor)

            }
            tributo1.vida < tributo2.vida -> {
                capitolio.alCementerio(tributo1)
                tributo1.muerto()
                eliminarTributo(i)
            }
            else -> {
                if ((0..1).random() == 0) {
                    capitolio.alCementerio(tributo1)
                    tributo1.muerto()
                    eliminarTributo(i)
                }
                else {
                    capitolio.alCementerio(tributo2)
                    tributo2.muerto()
                    eliminarTributo(valor)
                }
            }
        }
        //println("Tributo muerto")
    }
    fun eliminarTributo(posicion: Int) {
        tablero[posicion].tributo = null
        tablero[posicion].estado = "O"
        libres.add(posicion)
        ocupados.removeAt(ocupados.indexOf(posicion))

    }
    override fun toString(): String {
        var mensaje = ""
        for (i in 0 until (this.filas * this.columnas)) {
            mensaje += tablero[i].estado
            if ((i + 1) % this.filas == 0) {
                mensaje += "\n"
            }
        }
        return mensaje
    }


}