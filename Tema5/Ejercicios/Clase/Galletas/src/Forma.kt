enum class Forma {
    DINOSARUIO(tiempoModelado = 10, dificultad = 3),
    PEZ(tiempoModelado = 2, dificultad = 1),
    HUESO(tiempoModelado = 4, dificultad = 5),
    PERSONA(tiempoModelado = 10, dificultad = 10),
    EDIFICIO(tiempoModelado = 6, dificultad = 2);

    var tiempoModelado = 0
    var dificultad = 0

    constructor(tiempoModelado: Int, dificultad: Int) {
        this.tiempoModelado = tiempoModelado
        this.dificultad = dificultad
    }
}