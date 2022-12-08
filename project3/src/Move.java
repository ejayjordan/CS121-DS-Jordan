public class Move {
    private String moveName;
    private int movePower;

    public Object Move(String moveName, int movePower){
        this.moveName = moveName;
        this.movePower = movePower;
        return null;
    }

    public String getMoveName(){ return moveName;}
    public Integer getMovePower(){ return movePower;}
}
