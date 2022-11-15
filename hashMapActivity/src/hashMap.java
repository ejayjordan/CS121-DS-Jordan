import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class hashMap {
    private Map<String, Integer> gradesMap = new HashMap<>();

    public void addToGradesList(String course, int score){
        gradesMap.put(course, score);
    }

    public void removeFromGradesList(String course) {
        gradesMap.remove(course);
    }

    public Object getScore(String course){
        Object score;
        if(gradesMap.containsKey(course)){
            score = gradesMap.get(course);
        } else {
            score = "Course not found.";
        }
        return score;
    }

    public void displayGrades(){
        gradesMap.forEach( (course, score) -> {
            System.out.printf("Course: %s | Grade: %d\n", course, score);
        });
    }
}
