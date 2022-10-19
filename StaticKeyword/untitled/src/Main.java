public class Main {
    public static void main(String[] args){
        Enemy witch = new Enemy("Witch",13, 30);
        Enemy hunter = new Enemy("Hunter", 15, 15);
        System.out.printf("Witch enemy count: %d\n", witch.getEnemyCount());
        System.out.printf("Hunter enemy count: %d\n", hunter.getEnemyCount());
        System.out.printf("Enemy enemy count: %d\n", Enemy.getEnemyCount());


    }
}
