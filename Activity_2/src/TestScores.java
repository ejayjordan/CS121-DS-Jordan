//Emma Jordan
import javax.swing.JOptionPane;
import java.util.Scanner;
public class TestScores {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int score1;
        int score2;
        int score3;
        int average;
        String grade;

        System.out.print("Enter first test score: ");
        score1 = in.nextInt();
        System.out.print("Enter second test score: ");
        score2 = in.nextInt();
        System.out.print("Enter third test score: ");
        score3 = in.nextInt();

        average = (score1 + score2 + score3)/3;
        if(average < 60) {
            grade = "F";
        }else if(average >= 60 && average <= 69) {
            grade = "D";
        }else if(average >= 70 && average <=79) {
            grade = "C";
        }else if(average >= 80 && average <=89) {
            grade = "B";
        }else if(average >= 90 && average <= 100) {
            grade = "A";
        }else{
            grade = "Inconclusive";
        }

        System.out.println("The average of your test scores is: " + average);
        System.out.println("Your test score average grade is: " + grade);

    }
}
