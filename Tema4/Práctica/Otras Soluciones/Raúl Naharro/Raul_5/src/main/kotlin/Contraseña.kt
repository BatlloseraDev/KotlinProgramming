import kotlin.random.Random
class Password {
    private var longitud = 8
    private var contrasenia = ""
    private var fuerte = true

    constructor(longitud : Int, contrasenia : String, fuerte : Boolean){
        this.longitud = longitud
        this.contrasenia = contrasenia
        this.fuerte = fuerte
    }

    constructor(longitud : Int) {
        this.longitud = longitud
    }

    constructor()

    fun generar() : String {
        if (fuerte) {
            var mayusc = "QWER"
            var minusc = "asd"
            var nums = "3456789"
            // Genera secuencias de caracteres aleatorios con tantos valores como se le pasen en el .take, tomando los valores permitidos de las variables para las mayúsculas, minúsculas, etc.
            contrasenia += generateSequence { mayusc[Random.nextInt(mayusc.length)] }
                    .take(3)
                    .joinToString("") +
                    generateSequence { minusc[Random.nextInt(minusc.length)] }
                    .take(2)
                    .joinToString("") +
                    generateSequence { nums[Random.nextInt(nums.length)] }
                    .take(3)
                    .joinToString("")

        }
        else {
            contrasenia = ""
                for(i in 1..longitud) {
                    contrasenia += (1..9).random().toString()
                }
        }

        println("Contraseña generada: $contrasenia")
        return contrasenia
    }
}