public class Main {
    public static Pokemon playerPokemon;
    public static Pokemon computerPokemon;
    public static void main(String[] args) {
        PokemonBattle pokemonBattle = new PokemonBattle();
        pokemonBattle.addPokemonToGame();
        pokemonBattle.selectPlayerPokemon();
        pokemonBattle.selectComputerPokemon(playerPokemon);
        pokemonBattle.battlePokemon(playerPokemon, computerPokemon);
    }
}
