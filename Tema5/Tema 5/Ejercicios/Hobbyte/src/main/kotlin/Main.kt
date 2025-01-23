fun main(args: Array<String>) {

    //mirar en clase el || del while el final de pruebas
    //los to string
    //guardar en el historial
    //generar las pruebas a partir de cantidad de pruebas
    //mirar mensaje y si se puede mejorar?
    var gandal = Heroe("Gandal",Especialidad.Magia)
    var torin = Heroe("Torin",Especialidad.Fuerza)
    var bilbo = Heroe("Bilbo",Especialidad.Habilidad)

    var t = Tablero(20)

    var i=0
    do{
       when (t.pruebas[i].tipo) {
           Especialidad.Magia -> {
               t.pelear(gandal, i)
               gandal.aniadirPruebaalHistorial (t.pruebas[i])
            }
           Especialidad.Fuerza -> {
               t.pelear(torin, i)
               torin.aniadirPruebaalHistorial (t.pruebas[i])
           }
           Especialidad.Habilidad -> {
               t.pelear(bilbo, i)
               bilbo.aniadirPruebaalHistorial (t.pruebas[i])
           }
       }
        i++
    }while ((Heroe.perdidas<5) && (gandal.capacidad>0 || torin.capacidad>0 || bilbo.capacidad>0) && (i<t.cantidadPruebas))

    println(gandal)
    println(torin)
    println(bilbo)
    println(t)
}