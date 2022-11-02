import java.util.Scanner;
public class PokemonSelection {
    public createPokemon(String Pokename, int Pokehp, String Pokemove, int Pokepower, int Pokespeed){
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
    public assignPokemon(){
        
    }
}
