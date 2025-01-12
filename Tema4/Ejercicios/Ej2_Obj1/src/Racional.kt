class Racional(private var numerador: Int= 0, private  var denominador: Int= 1)
{
    init {
        require(denominador != 0){"El denominador no puede ser 0."}// he descubierto esto y me ha gustado
    }

    companion object
    {
        fun simplificar(fraccion:Racional):Racional
        {
            var resultado= Racional(fraccion.numerador, fraccion.denominador)
            resultado.simplificar()
            return resultado
        }
    }

    //Getter y Setter

    fun getNumerador()= numerador
    fun getDenominador() = denominador

    fun setNumerador(numerador: Int)
    {
        this.numerador=numerador
    }
    fun setDenominador(denominador: Int)
    {
        require(denominador!=0){"El denominador no puede ser 0."}
        this.denominador = denominador
    }


    override fun toString(): String {
        return "$numerador/$denominador"
    }

    fun leer()
    {
        var inputNumerador = pedirPorTecladoInt("Introduce el numerador:","Dato introducido no es un numero entero")
        var inputDenominador = pedirPorTecladoInt("Introduce el denominador:", "Dato introducido no es un numero entero")
        require(inputDenominador!=0){"El denominador no puede ser 0"}
        numerador = inputNumerador
        denominador = inputDenominador
    }

    fun simplificar()
    {
        var calculo = mcd(numerador,denominador)
        numerador /=calculo
        denominador /=calculo
        if(denominador<0)
        {
            numerador*=-1
            denominador*=-1
        }
    }
    fun mcd(a:Int, b:Int):Int //por el metodo de Euclides para calcular el MCD se convierte en una recursiva
    {
        return if(b==0) a else mcd(b,a%b)
    }

    fun sumar(a:Racional, b:Racional):Racional
    {
        var nNumerador = a.numerador * b.denominador + b.numerador * a.denominador
        var nDenominador = a.denominador * b.denominador
        return Racional(nNumerador,nDenominador)
    }

    fun multiplicar(a: Racional, b: Racional):Racional
    {
        var nNumerador = a.numerador * b.numerador
        var nDenominador = a.denominador * b.denominador
        return Racional(nNumerador,nDenominador)
    }



    fun pedirPorTecladoInt(texto:String, textoError: String):Int
    {
        var n:Int? = null
        while (n==null)
        {
            print(texto)
            n= devolverIntONull(readln(),textoError)
        }
        return n
    }

    fun devolverIntONull(input:String, textoError: String):Int?
    {
        return try {
            input.toInt()
        } catch (e:NumberFormatException)
        {
            println(textoError)
            null
        }
    }
}