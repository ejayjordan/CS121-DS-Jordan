import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class PokemonBattle {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private Pokedex pokedex = new Pokedex();

    public PokemonBattle() {return;}

    public String displayPokeList(){
        pokedex.getPokeList();
        for(pokedex.getPokeList().size();;){
            System.out.print(pokedex.getPokeList());
            System.out.print(pokemon.getMovesList());
        }
    }

    public Object selectPlayerPokemon(){
        Object playerPokemon = displayPokeList();
        System.out.println("Enter number of your selected Pokemon: ");
        int number = scanner.nextInt();
        pokedex.selectPokemon(number);
        return playerPokemon;
    }

    public Object selectComputerPokemon(){
        Object computerPokemon = pokedex.getRandomPokemon();
        return computerPokemon;
    }
        public void battlePokemon (Object playerPokemon, Object computerPokemon) {
            int playerwin = 0;
            int computerwin = 0;
            System.out.println("Enter an odd number of rounds: ");
            int round = Integer.parseInt(scanner.nextLine());
            System.out.println();

            int i;
            for (i = 1; i <= round; i++) {
                System.out.println();
                System.out.print("Round " + i + "\n-----");
                System.out.println();

                while (Poke1hp > 0 && Poke2hp > 0) {
                    if (Poke1power > Poke2power) {
                        int attack = Poke1power - Poke2hp;
                        Poke2hp = attack;
                        System.out.print("You won the round");
                        playerwin++;
                        if (Poke2hp < 0) {
                            break;
                        }
                    } else { (Poke1power<Poke2power)
                    int attack2 = Poke2power - Poke1hp;
                    Poke1hp = attack2;
                    System.out.print("The computer won the round");
                    computerwin++;
                    if (Poke1hp < 0) {
                        break;
                    }
                    }
                }
            }
            if (i == round) {
                System.out.print("\nFinal Scores\n" + "-----\n");
            } else {
                System.out.print("\nWins\n" + "-----\n");
            }
            System.out.print("You: " + playerwin + "\nComputer: " + computerwin);
            if (playerwin > computerwin) {
                System.out.print("\nYou won the game");
            } else {
                System.out.print("\nThe computer won the game");
            }
        }

        }
