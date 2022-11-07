import java.util.Scanner;
public class PokemonSelection {
    Scanner scanner = new Scanner(System.in);
    public Pokemon createPokemon()
    {
        System.out.println();
        System.out.println("Enter name:\n");
        // changes from Scanner to scanner lower case s
        String Pokename = scanner.nextLine();
        System.out.println("Enter HP:\n");
        int Pokehp = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter move:\n");
        String Pokemove = scanner.nextLine();
        System.out.println("Enter power:\n");
        int Pokepower = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter speed:\n");
        int Pokespeed = Integer.parseInt(scanner.nextLine());
        Pokemon pokemonX = new Pokemon(Pokename,Pokehp,Pokemove,Pokepower,Pokespeed);
        return pokemonX;
    }
    public void assignPokemon(){
        System.out.println();
        int i = 1;
        do {
            System.out.printf("Player %d: Select a Pokemon and enter its stats", i);

            Pokemon pokemon1 = createPokemon();
            i++;
            System.out.printf("Player %d: Select a Pokemon and enter its stats", i);
            Pokemon pokemon2 = createPokemon();
            System.out.println("Player " + (i - 1) + " Pokemon");
            System.out.println("------------------------------");
            pokemon1.displayPokemonStats();
            System.out.println("Player " + (i) + " Pokemon");
            System.out.println("------------------------------");
            pokemon2.displayPokemonStats();
        }while(i <2);
    }
}