class Coche {
    //Getters y setters personalizados:

    var marca: String = ""
        /*
            get(): Declara un métod accesorio llamado "getter", que se encarga de devolver el valor de un atributo.
            field: Indica que el getter devolverá el valor interno subyacente del atributo, que está almacenado en la
            variable especial field.
        * */
        get() = field
        set(value) {
            field = if (value.isNotBlank()) value else "Desconocida"
        }

    var modelo: String = "Genérico"

    var año: Int
        get() {
            val incrementado = field + 1
            val resultadoFinal = if (incrementado > 2025) 2025 else incrementado
            return resultadoFinal
        }

    var velocidadMaxima: Int = 0
        set(value) {
            field = if (value > 0) value else 120
        }

    var color: String = ""
        get() = field
        set(value) {
            field = if (value.isNotBlank()) value else "Blanco"
        }

    // Constructor secundario
    constructor(marca: String, modelo: String, año: Int, velocidadMaxima: Int, color: String ){
        this.marca = marca
        this.modelo = modelo
        this.año = año
        this.velocidadMaxima = velocidadMaxima
        this.color = color

    }

    fun acelerar() {
        println("$marca $modelo está acelerando a $velocidadMaxima km/h!")
    }

    override fun toString(): String {
        return "Coche(marca='$marca', modelo='$modelo', año=$año, velocidadMaxima=$velocidadMaxima, color='$color')"
    }
}
