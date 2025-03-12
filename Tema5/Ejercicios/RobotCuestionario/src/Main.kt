
fun main() {

    val listaEntidades = ArrayList<Entidad>()
    listaEntidades.add(Entidad("Entidad1", 1, 1))
    listaEntidades.add(Robot("Robot1", 2, 2))
    listaEntidades.add(Robot("Robot2"))

    for (entidad in listaEntidades) {
        entidad.mostrarPosicion()
    }

    val matriz = Array(5) { Array(5) { "-" } }
    val robot = Robot("Explorador", 2, 2)
    matriz[robot.y][robot.x] = "R"

    fun moverRobot(mov: String) {
        matriz[robot.y][robot.x] = "-"
        robot.mover(mov)
        matriz[robot.y][robot.x] = "R"
    }
    moverRobot("arriba")
    moverRobot("izquierda")

    for (fila in matriz) {
        println(fila.joinToString(" "))
    }

}