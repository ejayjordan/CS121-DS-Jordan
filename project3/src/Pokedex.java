import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Pokedex {
    private Random random = new Random();
    int number;
    private ArrayList<Objects> pokeList = new ArrayList<Objects>();

    public Pokedex(){return;}

    public void addPokemon(Objects pokemon){
        pokeList.add(pokemon);
    }
    public ArrayList getPokeList(){ return pokeList;}
    public void selectPokemon(int number){
        int index = number;


    }

    public Pokemon getRandomPokemon(Pokemon randomPokemon){
        return randomPokemon;
    }
    public Move getRandomMove(Pokemon randomPokemon){
        return moveName;
    }
}
