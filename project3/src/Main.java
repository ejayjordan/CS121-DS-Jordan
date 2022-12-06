public class Main {
    public static void main(String[] args){
        PokemonBattle pokemonBattle = new PokemonBattle();
        pokemonBattle.addPokemon();
        pokemonBattle.selectPlayerPokemon();
        pokemonBattle.selectComputerPokemon();
        pokemonBattle.battlePokemon();
    }
}
