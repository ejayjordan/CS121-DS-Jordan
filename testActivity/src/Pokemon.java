public class Pokemon {
    private String Pokename;
    private int Pokehp;
    private String Pokemove;
    private int Pokepower;
    private int Pokespeed;

    public Pokemon(String Pokename, int Pokehp, String Pokemove, int Pokepower, int Pokespeed) {
        this.Pokename = Pokename;
        this.Pokehp = Pokehp;
        this.Pokemove = Pokemove;
        this.Pokepower = Pokepower;
        this.Pokespeed = Pokespeed;
    }
        public String getPokename () {
            return Pokename;
        }
        public int getPokehp ()
        {
            return Pokehp;
        }
        public String getPokemove () {
            return Pokemove;
        }
        public int getPokepower () {
            return Pokepower;
        }
        public int getPokespeed () {
            return Pokespeed;
        }

        public void setPokename (String Pokename)
        {
            this.Pokename = Pokename;
        }
        public void setPokehp ( int Pokehp)
        {
            this.Pokehp = Pokehp;
        }
        public void setPokemove (String Pokemove){
            this.Pokemove = Pokemove;
        }
        public void setPokepower ( int Pokepower){
            this.Pokepower = Pokepower;
        }
        public void setPokespeed ( int Pokespeed){
            this.Pokespeed = Pokespeed;
        }

    public void displayPokemonStats() {
        System.out.println();
        System.out.print("Name: " + Pokename +"\n");
        System.out.print("Hit Points: " + Pokehp +"\n");
        System.out.print("Move: " + Pokemove +"\n");
        System.out.print("Move Power: " + Pokepower +"\n");
        System.out.print("Attack Speed: " + Pokespeed +"\n");
        System.out.println();
    }
}