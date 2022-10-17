import java.util.ArrayList;
import java.util.Scanner;
public class gradesArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<String> names= new ArrayList<>();
        ArrayList<Integer> credits= new ArrayList<>();
        ArrayList<Integer> score= new ArrayList<>();
        ArrayList<Character> grades= new ArrayList<>();
        int number = 1;
        String course;

        while(true) {
            System.out.printf("Enter course %d name or 'q' to quit:\n", number);
            course = console.nextLine();
            if (course.equalsIgnoreCase("q")) {
                break;
            }
            names.add(course);
            System.out.printf("Enter course %d credit hours:\n", number);
            credits.add(Integer.parseInt(console.nextLine()));
            System.out.printf("Enter course %d score:\n", number);
            score.add(Integer.parseInt(console.nextLine()));
            System.out.println();
            number++;
        }

        for (int scores : score) {
            if (scores >= 90) {
                grades.add('A');
            } else if (scores >= 80) {
                grades.add('B');
            } else if (scores >= 70) {
                grades.add('C');
            } else if (scores >= 60) {
                grades.add('D');
            } else {
                grades.add('F');
            }
        }

        System.out.printf("\n%-7s %-5s %-5s %-6s\n",
                "Course", "Hours", "Score", "Grade");
        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%-8s %-5d %-5d %-6c\n",
                    names.get(i), credits.get(i), score.get(i), grades.get(i));
        }
    }
}
