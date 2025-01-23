fun main(args: Array<String>) {
    var c = Capitolio()
    c.inicializarItem(100)

    var m = Mapa(5,5)
    m.colocarItem(2,c)
    m.colocarDistrito(1,4)

    println ("Inicio")
    println(m)
    var segundos = 0

    do {
        if (segundos % 2 == 0) {
            println(m)
            if (Tributo.quedaMasDeUno()) {
                m.moverTributos(c)
            }

        }

        if (segundos % 5 == 0) {
            //println(m)
            if (Tributo.quedaMasDeUno()){
                m.colocarItem(4, c)
            }


        }
        segundos++
    } while (Tributo.quedaMasDeUno())

    println ("Ultimo")
    println(m)


    /**
    var segundos =0
    do{
        if (segundos%2==0){
          for (i in m.ocupados){
              if (m.tablero[i].estado == "T"){
                  var valor=0
                  do{
                      valor = m.tablero[i].adyacente(m.filas)
                  }while (valor >= m.tablero.size)
                  when (m.tablero[valor].estado){
                      " " -> m.cambiarCasilla(valor,m.tablero[i].tributo!!)
                      "T" -> {
                          if (m.tablero[i].tributo!!.fuerza > m.tablero[valor].tributo!!.fuerza) {
                              c.alCementerio(m.tablero[valor].tributo!!)
                              m.tablero[valor].tributo = null
                              m.tablero[valor].estado = " "
                              m.libres.add(valor)
                              m.ocupados.removeAt(m.ocupados.indexOf(valor))

                          }else if ((m.tablero[i].tributo!!.fuerza < m.tablero[valor].tributo!!.fuerza)){
                              //gana el otro
                          }else{
                              //empate se mira la vida y sino la cara
                          }
                      }

                      "I" -> m.tablero[i].tributo!!.fuerza = m.tablero[i].tributo!!.fuerza + 1

                  }
              }
          }
        }
        if (segundos%5==0){
           m.colocarItem(4,c)
            println(m)
        }
        segundos++

    }while (Tributo.quedaMasDeUno())
    println(m)
    **/
}