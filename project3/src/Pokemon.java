import java.util.ArrayList;

public class Pokemon {
    private String name;
    private int hp;
    private int spd;
    private ArrayList<Move> movesList = new ArrayList<Move>();

    public Pokemon(String name, int hp, int spd){
        this.name = name;
        this.hp = hp;
        this.spd = spd;
    }

    public void addMove(Move move){
        movesList.add(move);
    }
    public void setHP(){

    }

    public String getName(){

    }
    public Integer getHP(){

    }
    public Integer getSPD(){

    }
    public ArrayList getMovesList(){ return movesList;}
    public String getPokemonInfo(){
        return String.format("Pokemon: %s\n"
                + "HP: %s\n"
                + "Speed: %s\n",
                name, hp, spd);
    }
    public void getMoveByName(Move move){

    }
}
