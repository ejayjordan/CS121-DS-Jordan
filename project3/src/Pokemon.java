import java.util.ArrayList;

public class Pokemon {
    private String name;
    private int hp;
    private int spd;
    private ArrayList<String> movesList = new ArrayList<>();

    public Pokemon(String name, int hp, int spd){
        this.name = name;
        this.hp = hp;
        this.spd = spd;
    }

    public void addMove(){
        movesList.add();
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
        return name;
        return String.valueOf(hp);
        return String.valueOf(spd);
    }
    public void getMoveByName(String moveName){

    }
}
