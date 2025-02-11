import kotlin.random.Random

fun main() {
    val losGuias = ArrayList<Guia>()

    var guia1: Guia

    var lugarTuristico1= LugaresTuristicos()
    var rutaTuristica1: RutaTuristica


    var ayudaCreacion=1
    var eleccionLugaraCrear:Int
    var n = 0
    while (n<2) {
        guia1 = Guia(Random.nextInt(1, 5))
        while (guia1.creandose()) {
            rutaTuristica1 = RutaTuristica(Random.nextInt(1, 5), "RUT_" + ayudaCreacion)
            while (rutaTuristica1.creandose()) {
                //creamos los lurares turisticos de forma aleatoria
                eleccionLugaraCrear = Random.nextInt(1, 3)
                when (eleccionLugaraCrear) {
                    1 ->
                        lugarTuristico1 = Museo(
                            "AIR" + ayudaCreacion,
                            Random.nextInt(0, 100),
                            Random.nextInt(0, 10),
                            "TEM" + ayudaCreacion,
                            Random.nextInt(1, 8)
                        )

                    2 ->
                        lugarTuristico1 = Parques(
                            "AGU" + ayudaCreacion,
                            Random.nextInt(0, 100),
                            Random.nextInt(0, 10),
                            Random.nextInt(1, 15),
                            Random.nextInt(1, 20)
                        )

                    3 ->
                        lugarTuristico1 = Monumentos(
                            "TIE" + ayudaCreacion,
                            Random.nextInt(0, 100),
                            Random.nextInt(0, 10),
                            "FECH" + ayudaCreacion,
                            "COST" + ayudaCreacion
                        )

                }
                //println(lugarTuristico1)
                rutaTuristica1.aniadirLugar(lugarTuristico1)
                ayudaCreacion++
            }
            guia1.aniadirRuta(rutaTuristica1)
        }
        println(guia1)
        losGuias.add(guia1)
        n++
    }
}
