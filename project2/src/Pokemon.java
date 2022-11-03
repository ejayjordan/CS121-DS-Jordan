public class Pokemon {
        String Pokename;
        int Pokehp;
        String Pokemove;
        int Pokepower;
        int Pokespeed;

        public Pokemon(String Pokename, int Pokehp, String Pokemove, int Pokepower, int Pokespeed){
            this.Pokename = Pokename;
            this.Pokehp = Pokehp;
            this.Pokemove = Pokemove;
            this.Pokepower = Pokepower;
            this.Pokespeed = Pokespeed;
        }

        public String Pokename(){ return Pokename;}
        public int Pokehp(){return Pokehp;}
        public String Pokemove(){return Pokemove;}
        public int Pokepower(){return Pokepower;}
        public int Pokespeed(){return Pokespeed;}

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
