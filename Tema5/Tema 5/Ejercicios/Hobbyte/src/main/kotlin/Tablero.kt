class Tablero {
    var pruebas = ArrayList<Prueba>()
    var cantidadPruebas=0

    constructor(cantidadPruebas:Int){
        this.cantidadPruebas = cantidadPruebas
        for (i in 1..13){
            var n = ((1..4).random())*5
           /** var laprueba = Prueba(n)
            pruebas.add(laprueba)**/
            pruebas.add(Prueba(n))
        }
        for (i in 1..6){
            var n = ((5..8).random())*5
            var i =(0..< pruebas.size).random()
            pruebas.add(i,Prueba(n))
        }
        var n = ((9..10).random())*5
        var i =(0..< pruebas.size).random()
        pruebas.add(i,Prueba(n))
        // pruebas.add((0..< pruebas.size).random(),Prueba(((9..10).random())*5))
    }
    fun pelear (e:Heroe, pos:Int){
        var mensaje =""
        if (e.capacidad>0) {
                var r = (1..10).random()

                if (e.capacidad > this.pruebas[pos].esfuerzo) {
                    if (r <= 9) {
                        e.fuerza = e.fuerza - pruebas[pos].esfuerzo
                        Heroe.perdidas = 0
                        mensaje = "${pos+1}.- He ganado ${e.nombre} la prueba es ${pruebas[pos].esfuerzo}"
                    } else {
                        e.capacidad = 0
                        Heroe.perdidas++
                        mensaje = "${pos+1}.- He perdido ${e.nombre} la prueba es ${pruebas[pos].esfuerzo}  *************"
                    }
                } else if (e.capacidad == this.pruebas[pos].esfuerzo) {
                    if (r <= 7) {
                        e.fuerza = e.fuerza - pruebas[pos].esfuerzo
                        Heroe.perdidas = 0
                        mensaje = "${pos+1}.- He ganado ${e.nombre} la prueba es ${pruebas[pos].esfuerzo}"
                    } else {
                        e.capacidad = 0
                        Heroe.perdidas++
                        mensaje = "${pos+1}.- He perdido ${e.nombre} la prueba es ${pruebas[pos].esfuerzo}  *************"
                    }
                } else {
                    if (r <= 5) {
                        e.fuerza = e.fuerza - pruebas[pos].esfuerzo
                        Heroe.perdidas = 0
                        mensaje = "${pos+1}.- He ganado ${e.nombre} la prueba es ${pruebas[pos].esfuerzo}"
                    } else {
                        e.capacidad = 0
                        Heroe.perdidas++
                        mensaje = "${pos+1}.- He perdido ${e.nombre} la prueba es ${pruebas[pos].esfuerzo}  *************"
                    }
                }
            }else{
                Heroe.perdidas++
                mensaje = "${pos+1}.- No puedo pelear ${e.nombre} la prueba es ${pruebas[pos].esfuerzo} ---------------"
            }
        println(mensaje)
    }

    override fun toString(): String {
        return "Tablero(pruebas=$pruebas)"
    }

}