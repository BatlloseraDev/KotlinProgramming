import javax.naming.ldap.Control

fun main() {
   //Dado que el enunciado del ejercicio presenta errores logicos de realización procederé a hacer el ejercicio de la mejor manera.

    //generar tablero
    //generar heroes -> registro, nombre y tpo
    //generar pruebas
    var tablero= Factoria.generarTablero()
    var personajes= arrayListOf(Factoria.generarPersonaje("Gandalf",TipoHabilidad.MAGIA),
                            Factoria.generarPersonaje("Thorin",TipoHabilidad.FUERZA),
                            Factoria.generarPersonaje("Bilbo", TipoHabilidad.HABILIDAD))
    var jugar=true
    var contadorPerdidasSeguidas= 0
    //juego
    while (jugar){
        //mostrar casillas
        tablero.mostrarTablero()

        //seleccionar casillas
        var n= 0
        var destapada= true
        while (n !in 1..20 ||destapada)
        {
            n=ControlErrores.pedirPorTecladoInt("Por favor ingresa un número del 1-20","Eso no es numero")

            if(n !in 1..20) println("Eso no fue un número entre 1 y 20")
            else
            {
                if(!tablero.checkMisionTapada(n-1)){
                    destapada= false
                }
                else{
                    println("Mision ya realizada, no disponible")
                }
            }
        }
        //mostrar resultados
        var resultado= tablero.pelear(n-1, personajes);
        tablero.pruebaPasada(n-1)
        if(resultado)
        {

            contadorPerdidasSeguidas= 0
        }
        else
        {
            contadorPerdidasSeguidas++
            //println("La prueba en la ficha ${n} ha sido fallida los datos de esta prueba son:\n"+tablero.quests[n-1])
        }

        //comprobar si terminó la partida
        var p= 0
        for(personaje in personajes)
        {
            if(personaje.activo)p++
        }
        if(p==0)
        {
            println("Te quedaste sin personajes activos, perdiste la partida")
            jugar=false
        }
        if(contadorPerdidasSeguidas>=5)
        {
            println("Has fallado 5 pruebas seguidas, has fallado")
            jugar=false
        }
        if(tablero.comprobarMisiones())
        {
            println("Felicidades has ganado")
            jugar =false
        }
    }
    println("Resultado de los personajes:")
    imprimirPersonajes(personajes)
}


fun imprimirPersonajes(personajes: ArrayList<Personaje>)
{
    for (p in personajes)
    {
        println(p)
    }
}