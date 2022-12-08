import java.util.ArrayList;
import java.util.Random;

public class Pokedex {
    private Random random = new Random();
    private ArrayList<Pokemon> pokeList = new ArrayList<Pokemon>();

    public Pokedex(){return;}

    public void addPokemon(){
        Pokemon pokemon = new Pokemon();
        pokeList.add(pokemon);
    }
    public ArrayList<Pokemon> getPokeList(){ return pokeList;}
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
    public Move getRandomMove(Move move){
    }
}
