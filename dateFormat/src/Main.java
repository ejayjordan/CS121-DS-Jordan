import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        TotalCalories totalCalories = new TotalCalories();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of calories allowed per day by diet:");
        double calories = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the start date of the diet (mm/dd/yyyy):");
        String startDate = scanner.nextLine();
        System.out.println("Enter the end date of the diet (mm/dd/yyyy):");
        String endDate = scanner.nextLine();

        double diet = totalCalories.calcTotalCalories(calories, startDate, endDate);
        System.out.printf("Total calories consumed during diet period = %f", diet);
    }
}
