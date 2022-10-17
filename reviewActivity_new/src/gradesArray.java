import java.util.ArrayList;
import java.util.Scanner;
public class gradesArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number of courses:");
        int num = Integer.parseInt(console.nextLine());
        System.out.println();

        ArrayList<String> names= new ArrayList<>();
        ArrayList<Integer> credits= new ArrayList<>();
        ArrayList<Integer> score= new ArrayList<>();
        ArrayList<Character> grades= new ArrayList<>();

        for (int i = 0; i < num; i++) {
            int j = i + 1;
            System.out.printf("Enter course %d name:\n", j);
            names.add(String.valueOf(i));
            System.out.printf("Enter course %d credit hours:\n", j);
            credits.add(i);
            System.out.printf("Enter course %d score:\n", j);
            score.add(i);
            System.out.println();
        }
        for (int i = 0; score < i; i++) {
            if (score >= 90) {
                grades.add(i);
            } else if (score >= 80) {
                grades.add(i);
            } else if (score >= 70) {
                grades.add(i);
            } else if (score >= 60) {
                grades.add(i);
            } else {
                grades.add(i);
            }
        }
        System.out.printf("\n%-7s %-5s %-5s %-6s\n",
                "Course", "Hours", "Score", "Grade");
        for (int i = 0; i < names; i++) {
            System.out.printf("%-8s %-5d %-5d %-6c\n",
                    names, credits, score, grades);
        }
    }
}
