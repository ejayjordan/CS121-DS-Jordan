import java.util.ArrayList;
public class Pokemon {
    private String name;
    private int hp;
    private int spd;
    private ArrayList<Move> movesList = new ArrayList<>();
    public Pokemon(String name, int hp, int spd){
        this.name = name;
        this.hp = hp;
        this.spd = spd;
    }
    public void addMove(Move move){
        movesList.add(move);
    }
    public void setHP(int hp)
    {
        this.hp = hp;
    }
    public void setSpd(int spd){
        this.spd = spd;
    }
    public String getName()
    {
        return name;
    }
    public Integer getHP()
    {
        return hp;
    }
    public Integer getSPD()
    {
        return spd;
    }
    public ArrayList<Move> getMovesList()
    {
        return movesList;
    }
    public Move getMoveByName(String moveName){
        Move moveFound = null;
        for(Move move: movesList){
            if(move.getMoveName().equalsIgnoreCase(moveName))
            {
                moveFound = move;
            }
        }
        return moveFound;
    }

    public String getPokemonInfo()
    {
        return String.format("""
                        Pokemon: %s
                        HP: %s
                        Speed: %s
                        """,
                name, hp, spd);
    }

}