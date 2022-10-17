//Emma Jordan
import java.util.Scanner;

public class NumberClass {
    public static void main (String[] args)
    {
        double A1;
        double A2;
        double A3;
        double A4;
        double A5;
        double A6;
        double A7;
        double A8;
        double A9;
        int num1;
        int num2;
        try (Scanner console = new Scanner(System.in)) {

            System.out.println("Enter a number");
            num1 = Integer.parseInt(console.nextLine());
            System.out.println("Enter a second number");
            num2 = Integer.parseInt(console.nextLine());

            A1 = num1 + num2;
            A2 = num1 - num2;
            A3 = num1 * num2;
            A4 = num1 % num2;
            A5 = Math.sqrt(num1);
            A6 = Math.sqrt(num2);
            A7 = Math.pow(num1, num2);
            A8 = Math.log(num1);
            A9 = Math.log(num2);

            System.out.println("Number 1:" + num1);
            System.out.println("Number 2:" + num2);
            System.out.println(A1 + "\n" + A2 + "\n" + A3 + "\n" + A4 + "\n" + A5 + "\n" + A6 + "\n" + A7 + "\n" + A8 + "\n" + A9);

            System.exit(0);
        }
    }
}