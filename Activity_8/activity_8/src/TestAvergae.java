//Emma Jordan
import java.util.Scanner;
public class TestAvergae {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double average;
        int students;
        int scores;
        int totalscore = 0;
        average = 0;

        System.out.println("Enter number of students: ");
        students = Integer.parseInt(input.nextLine());
        System.out.println("Enter number of test scores (per student): ");
        scores = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= students; i++) {
            System.out.printf("Student %d\n" + "-----\n", i);
            for (int j = 1; j <= scores; j++) {
                System.out.printf("Enter score %d\n: ", j);
                int ts = Integer.parseInt(input.nextLine());
                totalscore += ts;
                average = (double) totalscore / j;
            }
            System.out.printf("The average for the student %d is: %f\n", i, average);
            average = 0;
            totalscore = 0;
        }

    }
}
