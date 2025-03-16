package Helpers

class ControlErrores() {

    companion object
    {
        fun pedirPorTecladoInt(texto:String, textoError: String):Int
        {
            var n:Int? = null
            while (n==null)
            {
                println(texto)
                n= devolverIntONull(readln(),textoError)
            }
            return n
        }

        private fun devolverIntONull(input:String, textoError: String):Int?
        {
            return try {
                input.toInt()
            } catch (e:NumberFormatException)
            {
                println(textoError)
                null
            }
        }

        fun pedirPorTecladoString(texto:String, textoError: String):String
        {
            var s:String?=null
            while(s==null)
            {
                println(texto)
                s= devolverStringONull(readln(),textoError)
            }
            return s
        }
        private fun devolverStringONull(input: String, textoError: String):String?
        {
            return try {
                require(input.isNotEmpty()){"El texto no puede estar vacio"}
                input
            }
            catch (e:IllegalArgumentException)
            {
                println(textoError)
                null
            }
        }
        fun pedirPorTecladoChar(texto:String, textoError: String):Char
        {
            var s:Char?=null
            while(s==null)
            {
                println(texto)
                s= devolverCharONull(readln(),textoError)
            }
            return s
        }
        private fun devolverCharONull(input: String, textoError: String):Char?
        {
            return try {
                require(input.length==1){"Solo puede contener un character"}
                input[0]
                //if(input.length>1)

                /*  input[0]
                  require(input.isNotEmpty()){"El texto no puede estar vacio"}
                  input*/
            }
            catch (e:IllegalArgumentException)
            {
                println(textoError)
                null
            }
        }
    }
}