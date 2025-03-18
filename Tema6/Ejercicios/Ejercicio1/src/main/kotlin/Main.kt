package org.example

import org.example.DB.Database
import org.example.Helpers.Colores
import org.example.Modelo.Factoria

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    Database.cargarPeliculas()
    println("${Colores.GREEN}🟢 Registros cargados...${Colores.RESET}")

    do {
        mostrarMenu()
        print("❓${Colores.GREEN}Qué quieres hacer: ${Colores.RESET}")
        var opc = readlnOrNull()
        when(opc){
            "1" -> {
                val pel = Factoria.generarPelicula()
                //val pel = Factoria.pedirPelicula()
                Database.addPeli(pel)
                println("${Colores.CYAN}Peli añadida: ${Colores.YELLOW}$pel${Colores.RESET}")
            }
            "2" -> {
                print("❓${Colores.GREEN}Pos a borrar? ${Colores.RESET}")
                val pos = readln().toInt()
                if (Database.removePeli(pos)){
                    println("‼️ ${Colores.MAGENTA}Película borrada${Colores.RESET}")
                } else {
                    println("❌ ${Colores.RED}Película no encontrada${Colores.RESET}")
                }
            }
            "3" -> {
                println("‼️ ${Colores.MAGENTA}Películas actuales${Colores.RESET}")
                Database.listaPeliculas.forEachIndexed { i, pel->
                    println("${Colores.GREEN}\t$i -> $pel${Colores.RESET}")
                }
            }
            "4" -> {
                print("❓Título a buscar? ")
                val titulo = readln()
                val pelisEncontradas = Database.buscarPeli(titulo)
                if (pelisEncontradas.isNotEmpty()) {
                    println("‼️ ${Colores.MAGENTA}Películas encontradas${Colores.RESET}")
                    pelisEncontradas.forEach {
                        println("${Colores.GREEN}\t$it${Colores.RESET}")
                    }
                } else {
                    println("❌${Colores.RED} No encontrado ningún título con esas palabras${Colores.RESET}")
                }
            }
            "5" -> {
                Database.guardarPeliculas()
                println("${Colores.GREEN}🟢 Registros guardados...${Colores.RESET}")
            }
            else -> {
                println("❌${Colores.RED} Opción incorrecta.${Colores.RESET}")
            }
        }

    }while(opc != "5" )
}

fun mostrarMenu() {
    println("${Colores.BLUE}1.- Añadir una peli")
    println("2.- Borrar una peli por posición")
    println("3.- Listar pelis")
    println("4.- Buscar una peli")
    println("5.- Salir${Colores.RESET}")
}