import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class PokemonBattle {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private Pokedex pokedex = new Pokedex();

    public PokemonBattle() {
        return;
    }

    public Pokemon addPokemonToGame(ArrayList<Objects> pokemon,ArrayList<Move> movesList) {
        /*this is most likely, all wrong!!
        String move;
        String name;
        int power;
        int hp;
        int spd;
        while (true) {
            System.out.println("Add a Pokemon\n");
            System.out.println("----------\n");
            System.out.println();
            System.out.println("Enter new Pokemon name\nOr press 'q' to quit\n");
            System.out.println("----------\n");
            if (name.equals("q")) {
                break;
            } else {
                name = scanner.nextLine();
                System.out.printf("Enter %s hp: \n", name);
                hp = Integer.parseInt(scanner.nextLine());
                System.out.printf("Enter %s speed: \n", name);
                spd = Integer.parseInt(scanner.nextLine());

                System.out.println("********\n");
                System.out.printf("Enter a %s move\nOr press 'q' to quit\n", name);
                System.out.println("********\n");
                if (move.equals("q")) {
                    break;
                } else {
                    move = scanner.nextLine();
                    System.out.printf("Enter %s's power: \n", move);
                    power = Integer.parseInt(scanner.nextLine());

                }
                movesList.add(move, power);
            }
            pokemon.add(name, hp, spd);*/
        }

        public void displayPokemonList(){
            pokedex.getPokeList();
            for (pokemon.size()){
                System.out.println(Pokemon.getPokemonInfo);
                System.out.println(Move.getMoveName);
                System.out.print(Move.getMovePower);
            }
        }

        public void selectPlayerPokemon(){
            pokedex.selectPokemon();
            return playerPokemon;
        }
        public void selectComputerPokemon(){
            pokedex.getRandomPokemon();
            return computerPokemon;
        }
        public void battlePokemon (Pokemon playerPokemon, Pokemon computerPokemon) {
        }
    }
}