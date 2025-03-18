
import Helpers.*
import java.io.File


fun main() {

    var nombreFichero= "./src/main/files/peliculas.txt"

    //comprobar que el fichero existe si no crearlo
    if (FileHelper.crearArchivo(nombreFichero)) println("${Colores.RED}Se tuvo que crear el fichero${Colores.RESET}")

    //Ya puede empezar el programa
    var ejecutar = true
    while(ejecutar)
    {

        when(ControlErrores.pedirPorTecladoInt("${Colores.YELLOW}Introduce${Colores.RESET} " +
                "\n${Colores.GREEN}(1)${Colores.RESET}.Añadir una peli" +
                "\n${Colores.GREEN}(2)${Colores.RESET}.Borrar una peli" +
                "\n${Colores.GREEN}(3)${Colores.RESET}.Mostrar todas las pelis" +
                "\n${Colores.GREEN}(4)${Colores.RESET}.Salir del programa","Dato introducido no númerico"))
        {
            1->{
                //Aniadir una peli
                println("Voy a añadir una peli")
                addFichero(nombreFichero,pedirPelicula(),false)//separarmelo
            }
            2->{
                //Eliminar una peli
                println("Voy a borrar una peli") //introducir pos de la pelicula que quiere borrar
                //pedir nombre o pos
                addFichero(nombreFichero,borrarPeliMenu(muestraFichero(nombreFichero)),true)

            }
            3->{
                //Mostrar todas las pelis
                println("Voy a mostrar todas las pelis")
                imprimirPelis(muestraFichero(nombreFichero))
            }
            4->{
                ejecutar=false
            }
            else->{
                println("Opción no válida")
            }
        }



    }

}

//

fun borrarPeliMenu(pelis: ArrayList<String>): ArrayList<String>
{
    var alterada = pelis
    when(ControlErrores.pedirPorTecladoInt("${Colores.YELLOW}Introduce${Colores.RESET} " +
            "\n${Colores.GREEN}(1)${Colores.RESET}.Eliminar por nombre" +
            "\n${Colores.GREEN}(2)${Colores.RESET}.Eliminar por numero","Introduce un valor de tipo numerico"))
    {
        1->{
            alterada = borrarPorNombre(ControlErrores.pedirPorTecladoString("Introduce el nombre de la peli", "No vale introducir un valor vacío"),alterada)
        }
        2->{
            alterada = borrarPorNumero( ControlErrores.pedirPorTecladoInt("Introduce el numero de la peli según el orden de la lista", "No vale introducir un valor vacío"), alterada)
        }
        else->{
            println("${Colores.RED}Opción no válida, no se borró ninguna pelicula, saliendo al menu anterior${Colores.RESET}")
        }
    }
    return alterada
}


fun borrarPorNombre(titulo:String, pelis: ArrayList<String> ): ArrayList<String>
{
    var alterada = ArrayList<String>()
    var encontrada = false
    var n = 0
    for(peli in pelis)
    {
        val valores = peli.split(",")
        if(valores[0].lowercase() == titulo.lowercase())
        {
            encontrada=true
            n++
        }
        else{
            alterada.add(peli)
        }
    }
    if (!encontrada) println("${Colores.YELLOW}No se encontró la peli buscando por titulo${Colores.RESET}")
    else println("${Colores.GREEN}Se han borrado $n pelis${Colores.RESET}")

    return alterada
}

fun borrarPorNumero(numero:Int, pelis: ArrayList<String>):ArrayList<String>
{
    var alterada = ArrayList<String>()
    var encontrada = false

    if(numero in 1 .. pelis.size){
        for(i in pelis.indices)
        {
            if(i+1 == numero)
            {
                encontrada=true
            }
            else{
                alterada.add(pelis[i])
            }
        }
        if (encontrada) println("${Colores.GREEN}Se ha borrado la peli${Colores.RESET}")
    }
    else{
        println("${Colores.YELLOW}El numero introducido es mas grande que el número de pelis existente${Colores.RESET}")
        alterada= pelis
    }

    return alterada
}




fun imprimirPelis(cadenaPelis: ArrayList<String>)
{
    var miembrosPelis = PeliculaAtrib.values()

    for(c in cadenaPelis)
    {
        var cadena= ""
        var valores = c.split(",");
        miembrosPelis.forEachIndexed { index, peliculaAtrib ->
           cadena+="${peliculaAtrib.name.lowercase()}: ${valores[index]}, "
        }
        println("Pelicula ${cadenaPelis.indexOf(c)+1}: $cadena")
    }

}





fun pedirPelicula():String{

    val miembrosPeli = PeliculaAtrib.values()
    var cadena= ""

    miembrosPeli.forEach{
          cadena+=when(it.value){
              is String->{
                  ControlErrores.pedirPorTecladoString("Introduce el nombre de: ${it.name.lowercase()}", "No vale introducir un valor vacío") +","
              }
              is Int ->{
                  ControlErrores.pedirPorTecladoInt("Introduce el valor de: ${it.name.lowercase()}","No vale introducir un valor vacío o letras").toString() +","
              }
              else->{
                    println("Error a la hora de leer el valor de ${it.name.lowercase()}")
              }
          }
    }
    cadena= cadena.dropLast(1)//Elimina la ultima coma
    return cadena
}
