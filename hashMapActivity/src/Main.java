import java.util.HashMap;
import java.util.Objects;
public class Main {
    public static void main(String[] args){
        hashMap demo = new hashMap();

        demo.addToGradesList("cs121", 98);
        demo.addToGradesList("cs124", 96);
        demo.addToGradesList("cs222", 89);

        demo.displayGrades();

        System.out.println(demo.getScore("cs121"));
        demo.removeFromGradesList("cs121");
        System.out.println(demo.getScore("cs121"));

        demo.displayGrades();
    }
}
