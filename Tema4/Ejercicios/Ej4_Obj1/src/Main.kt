
val TEXTOERRORINT= "Numero no valido, vuelve a intentarlo"
val TEXTOERRORSTRING= "Este campo no puede estar vacio"

fun main() {
    var aula= Aula("212","DAW")

    var seguir= true
    while(seguir)
    {
        //println("Gestion de DAW\n1.Añadir ordenador\n2.Eliminar un ordenador\n3.Listar los ordenadores\n4.Mostrar informacion del aula\n5. Salir")

        when (ControlErrores.pedirPorTecladoInt("Gestion de DAW\n" +
                "1.Añadir ordenador\n" +
                "2.Eliminar un ordenador\n" +
                "3.Listar los ordenadores\n" +
                "4.Mostrar informacion del aula\n" +
                "5. Salir",
                TEXTOERRORINT))
        {
            1->{
                println("introduce los datos del ordenador:")
                var id= ControlErrores.pedirPorTecladoInt("ID unico",TEXTOERRORINT)
                var procesador = ControlErrores.pedirPorTecladoString("Procesador:",TEXTOERRORSTRING)
                var ram = ControlErrores.pedirPorTecladoInt("RAM (GB):", TEXTOERRORINT)
                var almacenamiento= ControlErrores.pedirPorTecladoInt("Almacenamiento (GB):", TEXTOERRORINT)
                var sistemaOperativo= ControlErrores.pedirPorTecladoString("Sistema Operativo:", TEXTOERRORSTRING)

                var ordenador= Ordenador(id, procesador, ram, almacenamiento, sistemaOperativo)
                aula.addOrdenador(ordenador)
            }
            2->{
                var id=ControlErrores.pedirPorTecladoInt("Introduce el ID del ordenador a eliminar",TEXTOERRORINT)
                aula.eliminarOrdenador(id)
            }
            3->{
                aula.imprimirOrdenadores()
            }
            4->{
                println(aula)
            }
            5->{
                println("Saliendo del programa")
                seguir=false
            }
            else ->{
                println("opcion no valida, intentalo de nuevo")
            }
        }
    }



}