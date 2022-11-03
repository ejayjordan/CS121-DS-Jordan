import java.util.Scanner;
public class PokemonSelection {
    int i;
    public createPokemon(String Pokename, int Pokehp, String Pokemove, int Pokepower, int Pokespeed){
        for (i = 0; i < 2; i++)
            System.out.println();
            System.out.println("Enter name:\n");
            Pokename = Scanner.nextLine();
            System.out.println("Enter HP:\n");
            Pokehp = Integer.parseInt(Scanner.nextLine());
            System.out.println("Enter move:\n");
            Pokemove = Scanner.nextLine();
            System.out.println("Enter power:\n");
            Pokepower = Integer.parseInt(Scanner.nextLine());
            System.out.println("Enter speed:\n");
            Pokespeed = Integer.parseInt(Scanner.nextLine());
    }
    public void assignPokemon(){
        System.out.println();
        System.out.printf("Player %d: Select a Pokemon and enter its stats", i);



    }
}
