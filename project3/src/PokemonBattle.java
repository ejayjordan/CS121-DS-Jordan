import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PokemonBattle {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private Pokedex pokedex = new Pokedex();
    private ArrayList<Pokemon> pokeList;
    public void addPokemonToGame() {
        String name;
        int hitPoints;
        int speed;
        String moveName;
        int movePower;

        while (true) {
            System.out.println("Add a Pokemon");
            System.out.printf("%s\n", "-".repeat(30));
            System.out.println("Enter new Pokemon name\nOr press q to quit");
            System.out.printf("%s\n", "-".repeat(30));
            System.out.print(">> ");
            name = scanner.nextLine();
            if (name.equals("q")) {
                break;
            }
            System.out.printf("Enter %s hit points: >> ", name);
            hitPoints = Integer.parseInt(scanner.nextLine());
            System.out.printf("Enter %s speed: >> ", name);
            speed = Integer.parseInt(scanner.nextLine());
            Pokemon pokemon = new Pokemon(name, hitPoints, speed);
            while (true) {
                System.out.printf("\t%s\n", "*".repeat(29));
                System.out.printf("\t Enter a %s move \n\t Or press q to quit\n", name);
                System.out.printf("\t%s\n", "*".repeat(29));
                System.out.print("\t>> ");
                moveName = scanner.nextLine();
                if (moveName.equals("q")) {
                    break;
                }
                System.out.printf("\tEnter %s's power: >> ", moveName);
                movePower = Integer.parseInt(scanner.nextLine());
                Move move = new Move(moveName, movePower);
                pokemon.addMove(move);
            }
            pokedex.addPokemon(pokemon);
            System.out.println();
        }
        System.out.println();
    }
    public void displayPokeList()
    {
        pokeList = pokedex.getPokeList();
        for (int i = 0; i < pokeList.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, pokeList.get(i).getPokemonInfo());
            System.out.printf("\t%-20s%s\n", "Move", "Power");
            System.out.printf("\t%s\n", "-".repeat(25));
            for (Move move : pokeList.get(i).getMovesList()) {
                System.out.printf("\t%-20s%d\n",
                        move.getMoveName(), move.getMovePower());
            }
            System.out.println();
        }
    }
    public Pokemon selectPlayerPokemon()
    {
        displayPokeList();
        System.out.println("Enter number of your selected Pokemon: ");
        int number = Integer.parseInt(scanner.nextLine());
        Pokemon playerPokemon = pokedex.selectPokemon(number);
        System.out.println(playerPokemon.getName());
        return playerPokemon;
    }
    public Pokemon selectComputerPokemon(Pokemon playerPokemon)
    {
        return pokedex.getRandomPokemon(playerPokemon);
    }
    public void updateHitPoints(Pokemon p, int power)
    {
        p.setHP(p.getHP() - power);
    }

    public void battlePokemon(Pokemon playerPokemon, Pokemon computerPokemon)
    {
        System.out.println("Select your Pokemon's move:");
        String playerMove = scanner.nextLine();
        int playerPower = playerPokemon.getMoveByName(playerMove).getMovePower();
        String computerMove = pokedex.getRandomMove(computerPokemon);
        int computerPower = computerPokemon.getMoveByName(computerMove).getMovePower();
        while (playerPokemon.getHP() > 0 && computerPokemon.getHP() > 0) {
            if (playerPokemon.getSPD() == computerPokemon.getSPD()) {
                int num = random.nextInt(1);
                if (num == 1) {
                    playerPokemon.setSpd(playerPokemon.getSPD() + 1);
                } else {
                    computerPokemon.setSpd(computerPokemon.getSPD() + 1);
                }
            }

            if (playerPokemon.getSPD() > computerPokemon.getSPD()) {
                updateHitPoints(computerPokemon, playerPower);
                if (computerPokemon.getHP() < 0) {
                    System.out.println("Player wins!");
                    break;
                }
                updateHitPoints(playerPokemon, computerPower);
                if (playerPokemon.getHP() < 0) {
                    System.out.println("Computer wins!");
                    break;
                }
            } else {
                updateHitPoints(playerPokemon, computerPower);
                if (playerPokemon.getHP() < 0) {
                    System.out.println("Computer wins!");
                    break;
                }
                updateHitPoints(computerPokemon, playerPower);
                if (computerPokemon.getHP() < 0) {
                    System.out.println("Player wins!");
                    break;
                }
            }
        }
    }

}