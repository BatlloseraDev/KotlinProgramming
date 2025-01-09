class Pokemon {
    var ataque = (1..100).random()
    var defensa = (1..100).random()
    var tipo:TipoPokemon

    constructor(t: TipoPokemon){
       tipo=t
    }
}