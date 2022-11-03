import java.util.Scanner;

public class sorting {
    Scanner console = new Scanner(System.in);
    int[] integers;

    public int[] getArray() {
        int[] integers = new int[5];
        for (int i = 0; i < integers.length; i++)
        {
            System.out.printf("Enter integer %d: \n", i + 1);
            int number = Integer.parseInt(console.nextLine());
            integers[i] = number;
        }
        System.out.println();
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