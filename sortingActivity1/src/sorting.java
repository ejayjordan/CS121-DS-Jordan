import java.util.Scanner;
public class sorting {
    Scanner console = new Scanner(System.in);
    int[] integers;
    int number = 1;

    public int[] getArray() {
        System.out.printf("Enter integer %d:\n", number);
        int integer = console.nextInt();
        integers.add(integer);
        System.out.println();
        number++;
        return integers;
    }

    public int[] sortArray() {
        int temp;
        for (int i = 0; i < integers.length - 1; i++) {
            for (int index = 0; index < integers.length - i - 1; index++) {
                if (integers[index] > integers[index + 1]) {
                    temp = integers[index];
                    integers[index] = integers[index + 1];
                    integers[index + 1] = temp;
                }
            }
        }
        return integers;
    }
}
