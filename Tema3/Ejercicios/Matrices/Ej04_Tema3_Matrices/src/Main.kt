const val N = 3

fun main() {

    var matriz= Array(N){IntArray(N){(0..10).random()}}
    imprimirParesOImpares(matriz,false, false)//modo false =  numeros
    imprimirParesOImpares(matriz,true,false)// modo true = posiciones
    imprimirParesOImpares(matriz,false, true )
    imprimirParesOImpares(matriz, true, true)

}





fun imprimirParesOImpares(m:Array<IntArray>, Impar:Boolean, modo:Boolean)
{
    var sumatorio = 0
    var contador= 0
    for(i in m.indices)
    {
        for(j in m[i].indices)
        {


            if(modo)
            {
                var pos=((i*N)+j)
                if(!Impar)
                {
                    if(pos%2==0)
                    {
                        sumatorio+= m[i][j]
                        contador++
                    }
                }
                else
                {
                    if(pos%2!=0)
                    {
                        sumatorio+=m[i][j]
                        contador++
                    }
                }
            }
            else
            {
                if(!Impar)
                {
                    if(m[i][j]%2==0)
                    {
                        sumatorio+= m[i][j]
                        contador++
                    }
                }
                else
                {
                    if(m[i][j]%2!=0)
                    {
                        sumatorio+=m[i][j]
                        contador++
                    }
                }
            }


        }
    }

    println("El sumatorio es ${sumatorio} y la media es ${sumatorio/contador}")

}