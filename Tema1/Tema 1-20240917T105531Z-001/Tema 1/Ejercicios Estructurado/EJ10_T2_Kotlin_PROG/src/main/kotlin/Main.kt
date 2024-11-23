fun main(args: Array<String>) {
    var farenheit : Double?
    var centigrados : Double?
    var opcion : Int?

    do {
        println("CONVEROSR DE GRADOS. \n" +
                "1. Pasar de Centigrados a Farenheit. \n" +
                "2. Pasar de Farenheit a Centigrados. \n" +
                "0. Finalizar programa.")

        print("Por favor selecciona una opcion: ")
        opcion = readln().toInt()

        when(opcion){
            1 -> {
                println("Dime cuantos grados Centigrados son: ")
                centigrados = readln().toDouble()

                farenheit = ((9/5)*centigrados ) + 32

                println("Se ha realizado la conversion.\n" +
                        "$centigrados grados centigrados son $farenheit grados farenheit")
            }

            2 -> {
                println("Dime cuantos grados Farenheit son: ")
                farenheit = readln().toDouble()

                centigrados = ((farenheit * 5)/9) - 32

                println("Se ha realizado la conversion.\n" +
                        "$farenheit grados farenheit son $centigrados grados centigrados")
            }
            0 -> {
                println("El programa va a finalizar.")

            }
            else -> println("Por favor introduzca una opcion valida")

        }
    }while (opcion != 0)

}