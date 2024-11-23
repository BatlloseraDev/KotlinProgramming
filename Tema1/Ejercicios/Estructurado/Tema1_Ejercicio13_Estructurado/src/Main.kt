//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Ingresa dos numeros enteros para hacer la division" +
            "\nIngresa el dividendo")
    val DIVIDENDO= readln().toInt()
    println("Ingresa el divisor")
    val DIVISOR = readln().toInt()
    var cociente= 0.0
    var auxiliarDividendo= DIVIDENDO
    println("¿Quieres decimales? (true) Si , (false) No")
    var QuiereDecimales = readln().toBoolean()
    var decimales:String = "0"

    if(DIVISOR==0)
    {
        println("No se puede dividir entre 0")
    }
    else if(DIVIDENDO==0)
    {
        println("Cualquier numero que divida a 0 el resultado es 0")
    }
    else
    {
        if(QuiereDecimales)
        {
            var contadorDec = 0
            var entrarDecimales = false
            println("Introduzca cuantos decimales quiere")
            var decimalesDeseados = readln().toInt()

            while (auxiliarDividendo!=0 && contadorDec<decimalesDeseados)
            {
                if (auxiliarDividendo<DIVISOR && !entrarDecimales)
                {

                    decimales= cociente.toInt().toString() +"."
                    entrarDecimales= true
                }
                if(!entrarDecimales)
                {
                    while(auxiliarDividendo>=DIVISOR)
                    {
                        auxiliarDividendo-=DIVISOR
                        cociente++;
                    }
                }
                else
                {
                    if(auxiliarDividendo<DIVISOR)
                    {
                        while(auxiliarDividendo<DIVISOR)
                        {
                            auxiliarDividendo*=10
                            if(auxiliarDividendo<DIVISOR)
                            {
                                decimales +="0"
                            }
                            contadorDec++
                            cociente=0.0
                        }
                    }
                    else
                    {
                        while(auxiliarDividendo>=DIVISOR)
                        {
                            auxiliarDividendo-=DIVISOR
                            cociente++;
                        }
                        decimales+="${cociente.toInt()}"
                    }



                }
            }

            if(decimalesDeseados==0)
            {
                //aqui me encantaria hacer la programacion modular
                while(auxiliarDividendo>=DIVISOR)
                {
                    auxiliarDividendo-=DIVISOR
                    cociente++;
                }
                println("El resultado de dividir $DIVIDENDO entre $DIVISOR es cociente $cociente y de resto $auxiliarDividendo")
            }
            else
            {
                println("El resultado de dividir $DIVIDENDO entre $DIVISOR es cociente $decimales y de resto $auxiliarDividendo")
            }

        }
        else
        {
            while(auxiliarDividendo>=DIVISOR)
            {
                auxiliarDividendo-=DIVISOR
                cociente++;
            }

            println("El resultado de dividir $DIVIDENDO entre $DIVISOR es cociente ${cociente.toInt()} y de resto $auxiliarDividendo")
        }
    }







}