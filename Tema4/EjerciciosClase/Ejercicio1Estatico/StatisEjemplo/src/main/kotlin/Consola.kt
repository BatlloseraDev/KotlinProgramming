class Consola {
    companion object {
        fun leerTexto(mensaje: String): String {
            var t=""
            print(mensaje)
            t = readln()
            return  t
        }

        fun leerEntero(mensaje: String): Int? {
           // while (true) {
             //   try {
                    print(mensaje)
                    return readln().toIntOrNull()
               // } catch (e: NumberFormatException) {
               //     println("Por favor, ingresa un número entero válido.")
               // }
            //}
        }

        fun escribirTexto(texto: String) {
            println(texto)
        }

        fun escribirEntero(entero: Int) {
            println(entero)
        }
    }
}