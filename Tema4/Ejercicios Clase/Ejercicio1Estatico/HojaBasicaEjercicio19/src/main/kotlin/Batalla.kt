class Batalla {

    companion object {
        fun batallaPokemon(atacante: Pokemon, defensor: Pokemon) {
            var efectividad = calcularEfectividad(atacante.tipo, defensor.tipo)
            var danio: Double = 50 * (atacante.ataque / defensor.defensa) * efectividad.valor
            println(danio)
        }

        fun calcularEfectividad(a: TipoPokemon, d: TipoPokemon): Efectividad {
            var e: Efectividad = Efectividad.NEUTRAL

            if (a.name == d.name) {
                e = Efectividad.POCOEFECTIVO
            } else {
                if ((a == TipoPokemon.AGUA) && (d == TipoPokemon.FUEGO || d == TipoPokemon.ELECTRICO)) {
                    e = Efectividad.SUPEREFECTIVO
                } else if ((a == TipoPokemon.PLANTA || a == TipoPokemon.FUEGO) && d == TipoPokemon.AGUA) {
                    e = Efectividad.SUPEREFECTIVO
                }
            }
            return e
        }
    }
}