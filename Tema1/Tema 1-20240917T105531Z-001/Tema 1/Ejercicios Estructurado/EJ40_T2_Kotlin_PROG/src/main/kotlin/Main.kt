fun main(args: Array<String>) {
    var select: Int = 0
    var exit: Int = 0

    println("Seleccione numericamente el ejercicio que desea realizar")
    println("________________________________________________________")
    println("1 - Número factorial")
    println("2 - Notas con medias")
    println("3 - Divisores de un número")
    select = readln().toInt()


    do {
        when (select) {
            1 -> {
                var i: Int = 0
                var total: Int = 1
                var n: Int = 0

                println("Introduzca su número")
                n = readln().toInt()

                for (i in 1..n) {
                    total *= i //total=total*i
                }
                println("Resultado ${total}")
            }

            2 -> {
                var nota: Float = 0f
                var suma: Float = 0f
                var media: Double = 0.0
                var cont: Int = 0
                var sino: String = "SI"
                var suspenso: Int = 0
                var aprobado: Int = 0
                var suficiente: Int = 0
                var bien: Int = 0
                var notable: Int = 0
                var sobresaliente: Int = 0

                do {
                    println("Introduzca su nota")
                    nota = readln().toFloat()
                    suma = suma + nota
                    cont++
                    println("¿Quiere añadir una nota mas?")
                    sino = readln()

                    if (nota <= 4.9) {
                        suspenso++
                    } else
                        aprobado++
                    if (nota in (5.0..5.9)) {
                        suficiente++
                    }
                    if (nota in (6.0..6.9)) {
                        bien++
                    }
                    if (nota in (7.0..8.9)) {
                        notable++
                    }
                    if (nota in (9.0..10.0)) {
                        sobresaliente++
                    }

                } while (sino.uppercase() != "NO")
                media = suma.toDouble() / cont

                println("la media de todos los exámenes ha sido de:${media}")
                println("Los examenes suspensos han sido: ${suspenso}")
                println("Los examenes aprobados han sido: ${aprobado}")
                println("Suficientes=${suficiente}\nBienes=${bien}\nNotables=${notable}\nSobresaliente=${sobresaliente} ")
            }

            3 -> {
                var num: Int = 0
                var i: Int = 0
                var resultado: Int = 0
                var ninguno: Boolean = true

                println("Introduzca su número para conocer sus divisores")
                num = readln().toInt()

                for (i in 2..num) {
                    resultado = (num % i)
                    if (resultado == 0) {
                        if (num != i) {
                            println(i)
                            ninguno = false
                        }
                        if (ninguno) {
                            println("No tiene divisores")
                        }
                    }
                }
            }
        }
    }while(true) //modificar para solucionar error
}