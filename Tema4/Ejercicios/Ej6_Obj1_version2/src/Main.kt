import kotlin.random.Random

val MAXTIME= 300 //5mins
val MAXNUEVASSERPIENTES = 3

/*Para modular solo tendria que hacer desaparecer las clases
  Serpiente pasaria como una matriz de arrayList en la que la arrayList seria el tamaño de la serpiente
  Y el nido seria la longitud de la array, si no hay serpientes el hueco pondria h o alguna letra
  El resto de funciones se modularian. dentro.

  Estructurado seria pasar todas las funciones dentro del codigo obligando a generar mucho codigo repetido.

* */
fun main() {

    var nido= Nido()
    var segundos=0

    while (segundos<MAXTIME)
    {
        segundos++
        println("Segundo $segundos pasa lo siguiente: ")

        if(segundos%5 ==0)
        {
            var nuevasSerpientes = Random.nextInt(1,MAXNUEVASSERPIENTES)
            nido.addSerpientes(nuevasSerpientes)
            println("Han nacido $nuevasSerpientes nueva/s serpiente/s")
        }
        if(segundos%10 == 0 && Random.nextDouble(.0,1.0)<=.2 ) nido.mangostaAtaca()  //depnde de si la mangosta ataca antes o despues de la generacion de serpientes.


        var s= nido.serpientes

        for(i in s){
            vivirUnAnio(i)
        }

        nido.limpiarSerpientes()
        //nido.vivirUnSegundo()

        println("$nido\n")


    }

}


fun vivirUnAnio(serpiente: Serpiente)//funcion de vivir un año propia del sistema no de la serpient
{
    var prob =Random.nextDouble(.0,1.0)//para cada serpiente tiene una probabilidad distinta
    if(serpiente.edad<10)
    {
        if (prob<.8) serpiente.crecer()
        else serpiente.mudar()
    }
    else
    {
        if (prob<.9) serpiente.decrecer()
        else serpiente.mudar()
    }
    if (prob<.1)//el 10% de que una serpiente muera al pasar de año
    {
        serpiente.viva=false
        println("Serpiente murio intentando pasar de año")
    }
    serpiente.edad++
}