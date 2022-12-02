import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {
    private Pokemon pokemon = new Pokemon("Squirtle", 10,"Tackle", 60, 30);

    @org.junit.jupiter.api.Test
    void getPokename() {
        //assertEquals("Charmander", pokemon.getPokename());
        assertEquals("Squirtle", pokemon.getPokename());
    }

    @org.junit.jupiter.api.Test
    void getPokemove() {
        //assertEquals("Water Beam", pokemon.getPokemove());
        assertEquals("Tackle", pokemon.getPokemove());
    }
}