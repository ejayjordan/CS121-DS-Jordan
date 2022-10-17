import java.util.Scanner;
public class recursionTest {
    public static void main(String[] args){
        recursionDemo demo = new recursionDemo();
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        System.out.println(demo.calcFactorial(number));
        System.out.println();
        demo.countDown(4);

        int x = 10;
        int y = 20;
        System.out.printf("Print result of x + 1 = %d\n", x + 1);
        System.out.printf("Print result of y - 1 = %d\n", y - 1);
        System.out.println();
        x = 10;
        y = 20;

        System.out.printf("Printing postfix x = %d\n", x++);
        System.out.printf("Print postfix y = %d\n", y--);
        System.out.printf("Printing x after postfix increment: %d\n", x);
        System.out.printf("Printing y after postfix increment: %d\n", y);

        x = 10;
        y = 20;

        System.out.printf("Printing prefix x = %d\n", ++x);
        System.out.printf("Print prefix y = %d\n", --y);
    }
}
