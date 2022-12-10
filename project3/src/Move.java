public class Move {
    private String moveName;
    private int movePower;

    public Move(String moveName, int movePower){
        this.moveName = moveName;
        this.movePower = movePower;
    }

    public String getMoveName(){ return moveName;}
    public Integer getMovePower(){ return movePower;}

}
