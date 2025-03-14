import Helpers.Colores
import java.io.File


fun main(args: Array<String>) {


//Comenta y descomenta los bloques de Opción A / Opción B, para probar las dos formas de acceder a los archivos según su ubicación.
//Opción A) Usando la referencia relativa del archivo a una carpeta.

    var nombreFichero = "./src/main/files/ejemplo.txt" //Usando una referencia relativa a una carpeta

    var resp = 's'
    var fichero = File(nombreFichero)
    var info = ""


    if (fichero.exists()) {
        print("❓El fichero existe ¿desea sobreescribirlo? (s/n) ")
        resp = readln()[0]
    }
    println("‼️ Escriba el texto que desea almacenar en el fichero:")
    info = readln()
    if (resp == 's') {
        addFichero(nombreFichero, info, true)
//        addFichero2(nombreFichero, info, true)
    } else {
        addFichero(nombreFichero, info, false)
//        addFichero2(nombreFichero, info, false)
    }

    println("${Colores.BLUE}------- Mostrando con el método 1: -------${Colores.RESET}")
    muestraFichero(nombreFichero).forEach{
        println("\t${Colores.GREEN}$it${Colores.RESET}")
    }
    println("${Colores.BLUE}------- Mostrando con el método 2: -------${Colores.RESET}")
    muestraFichero2(nombreFichero).forEach{
        println("\t${Colores.GREEN}$it${Colores.RESET}")
    }
    println("${Colores.BLUE}------- Mostrando con el método 3: -------${Colores.RESET}")
    muestraFichero3(nombreFichero).forEach{
        println("\t${Colores.GREEN}$it${Colores.RESET}")
    }





//Opción B) Accedeiendo a los archivos almacenados en resources de la app.
    //Este archivo hace referencia al guardado en /src/resources.
    //Pero no puedes escribir directamente en resources porque IntelliJ lo trata como un directorio de solo lectura en tiempo de ejecución.
    //Sin embargo, al ejecutar el programa, IntelliJ usa una carpeta temporal de compilación, que puedes encontrar aquí: /out/production/
    //Pero el archivo debe existir para que no dé guerra.

//    var nombreFichero = "ejemploResource.txt"  //Usando la carpeta resources.
//
//    var resp = 's'
//    var fichero = File(nombreFichero)
//    var info = ""
//
//    val url = object {}.javaClass.getResource("/$nombreFichero")
//
//    if (url != null) {
//        println("📂 El archivo se encuentra en: ${url.path}")
//        print("❓El fichero existe ¿desea sobreescribirlo? (s/n) ")
//        resp = readln()[0]
//    } else {
//        println("❌ No se encontró el archivo \"$nombreFichero\" en resources.")
//    }
//
//    println("‼️ Escriba el texto que desea almacenar en el fichero:")
//    info = readln()
//
//    if (resp == 's') {
//        //addFichero3(nombreFichero, info, true)
//        addFichero4(nombreFichero, info, true)
//    } else {
//        //addFichero3(nombreFichero, info, false)
//        addFichero4(nombreFichero, info, false)
//    }
//    println("${Colores.BLUE}------- Mostrando con el método 4: -------${Colores.RESET}")
//    muestraFichero4(nombreFichero).forEach{
//        println("\t${Colores.GREEN}$it${Colores.RESET}")
//    }
//    println("${Colores.BLUE}------- Mostrando con el método 5: -------${Colores.RESET}")
//    muestraFichero5(nombreFichero).forEach{
//        println("\t${Colores.GREEN}$it${Colores.RESET}")
//    }
//    println("${Colores.BLUE}------- Mostrando con el método 6: -------${Colores.RESET}")
//    muestraFichero6(nombreFichero).forEach{
//        println("\t${Colores.GREEN}$it${Colores.RESET}")
//    }
}



