import kotlin.random.Random
import kotlin.random.nextInt

const val N = 5
const val PASOS= 60
const val NUSUARIOS= 10
const val VACIO= 0
const val TROZOMESA=5;
const val ALUMNO = 1;
fun main() {


    var claseMatrix = Array(N){IntArray(N){0}}
    var contadorPasos = 0;
    var historial = Array(PASOS){""}
    //seteoTodo
    ponerMesa(claseMatrix, 0,1)//5 mesa
    ponerMesa(claseMatrix,0,3 )
    ponerMesa(claseMatrix, 3,2)


    claseMatrix[2][0]= ALUMNO //seteo al usuario siempre en el centro de la puerta
    var posAlumnos = Array(NUSUARIOS){ intArrayOf(2,0) }
    var posAlumno = intArrayOf(2,0)
    imprimirMatriz(claseMatrix)


    while(contadorPasos<PASOS)
    {

        for(i in posAlumnos.indices)
        {
            nuevaPosAlumnno(claseMatrix, posAlumnos[i])
            moverAlumnos(claseMatrix,posAlumnos)
            //moverAlumno(claseMatrix,posAlumnos[i])
        }
        /*
        nuevaPosAlumnno(claseMatrix, posAlumno);
        moverAlumno(claseMatrix,posAlumno)

        println("Paso ${contadorPasos+1}: ")

         */
        imprimirMatriz(claseMatrix)

        contadorPasos++
        //historial[contadorPasos-1]= "Para el paso $contadorPasos se movio a la casilla (${posAlumno[0]},${posAlumno[1]})"

    }
    //imprimirHistorial(historial)
}



fun imprimirHistorial(array: Array<String>)
{
    for(i in array.indices)
    {
        println(array[i])
    }
}


fun moverAlumnos(m:Array<IntArray>, alumnos:Array<IntArray>){

    limpiarClase(m)
    for(a in alumnos.indices)
    {
        for(i in m.indices)
        {
            for(j in m[i].indices)
            {
                if(alumnos[a][0]== i && alumnos[a][1]==j)
                {
                    m[i][j]=ALUMNO
                }
            }
        }
    }



}

fun limpiarClase(m:Array<IntArray>)
{
    for(i in m.indices)
    {
        for(j in m[i].indices)
        {
            if(m[i][j]!=VACIO && m[i][j]!=TROZOMESA)
            {
                m[i][j]= VACIO
            }
        }
    }

}


fun moverAlumno(m:Array<IntArray>, alumno:IntArray)
{
    for(i in m.indices)
    {
        for(j in m[i].indices)
        {
            if(m[i][j]==1)
            {
                m[i][j]=0
            }
        }
    }

    m[alumno[0]][alumno[1]]= ALUMNO
}


fun nuevaPosAlumnno(m:Array<IntArray>, alumno:IntArray)
{


    var encontrado= false
    var contador=0

    while(!encontrado)
    {

        var nuevoPaso= Array(2){Random.nextInt(-1..1)}

        if(alumno[0]+nuevoPaso[0]<0 || alumno[1]+nuevoPaso[1]<0 || alumno[0]+nuevoPaso[0]>=N|| alumno[1]+nuevoPaso[1]>=N)
        {
            //En caso que quiera hacer algo si se sale de la matriz
        }
        else
        {
            if(m[alumno[0]+nuevoPaso[0]][alumno[1]+nuevoPaso[1]]!=TROZOMESA && m[alumno[0]+nuevoPaso[0]][alumno[1]+nuevoPaso[1]]!=ALUMNO)
            {
                //entoces se sale del bucle si no sigue en el bucle hasta que encuentre la posicion,
                alumno[0] +=nuevoPaso[0]
                alumno[1] +=nuevoPaso[1]
                encontrado= true
            }
        }
        contador++
        if(contador>10)
        {
            encontrado=true
        }
    }


}


fun ponerMesa(m:Array<IntArray>, posX: Int, posY:Int)
{

    //modo 1 seteo las mesas manualmente
    m[posX][posY] = TROZOMESA
    m[posX+1][posY] = TROZOMESA

}


fun imprimirMatriz(m:Array<IntArray>)
{
    for(i in m.indices) {
        for (j in m[i].indices)
        {
            print("|${m[i][j]}|")
        }
        println()
    }
    println()
}