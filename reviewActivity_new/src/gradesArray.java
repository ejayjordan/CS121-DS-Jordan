import java.util.ArrayList;
import java.util.Scanner;
public class gradesArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number of courses:");
        int num = Integer.parseInt(console.nextLine());
        System.out.println();

        ArrayList<String> names= new ArrayList<>(num);
        ArrayList<Integer> credits= new ArrayList<>(num);
        ArrayList<Integer> score= new ArrayList<>(num);
        ArrayList<Character> grades= new ArrayList<>(num);

        for (int i = 0; i < names; i++) {
            int j = i + 1;
            System.out.printf("Enter course %d name:\n", j);
            names.set(i, console.nextLine());
            System.out.printf("Enter course %d credit hours:\n", j);
            names.set(i, Integer.parseInt(console.nextLine()));
            System.out.printf("Enter course %d score:\n", j);
            names.set(i, Integer.parseInt(console.nextLine()));
            System.out.println();
        }
        for (int i = 0; i < score; i++) {
            if (score.get(i) >= 90) {
                grades.set(i, 'A');
            } else if (score.get(i) >= 80) {
                grades.set(i, 'B');
            } else if (score.get(i) >= 70) {
                grades.set(i, 'C');
            } else if (score.get(i) >= 60) {
                grades.set(i, 'D');
            } else {
                grades.set(i, 'F');
            }
        }
        System.out.printf("\n%-7s %-5s %-5s %-6s\n",
                "Course", "Hours", "Score", "Grade");
        for (int i = 0; i < names; i++) {
            System.out.printf("%-8s %-5d %-5d %-6c\n",
                    names.get(i), credits.get(i), score.get(i), grades.get(i));
        }
    }
}