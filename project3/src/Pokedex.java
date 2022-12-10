import java.util.ArrayList;
import java.util.Random;

public class Pokedex
{
    Random random = new Random();
    private ArrayList<Pokemon> pokeList = new ArrayList<Pokemon>();
    public void addPokemon(Pokemon pokemon)
    {
        pokeList.add(pokemon);
    }

    public ArrayList<Pokemon> getPokeList()
    {
        return pokeList;
    }

    public Pokemon selectPokemon(int index){
        return pokeList.get(index);
    }

    public Pokemon getRandomPokemon(Pokemon randomPokemon){
        int randomPokemonIndex = pokeList.indexOf(randomPokemon);
        int randomNumber = random.nextInt(pokeList.size());
        if (randomNumber == randomPokemonIndex){
            if (randomNumber == pokeList.size() - 1){
                randomNumber = 0;
            }else{
                randomNumber += 1;
            }
        }
        return pokeList.get(randomNumber);
    }
    public String getRandomMove(Pokemon pokemon)
    {
        int randomNumber = random.nextInt(pokemon.getMovesList().size());
        return pokemon.getMovesList().get(randomNumber).getMoveName();
    }
}