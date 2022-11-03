import java.util.Scanner;

public class Sorting {
    Scanner console = new Scanner(System.in);
    int[] integers;

    public int[] getArray() {
        int[] integers = new int[5];
        for (int i = 0; i < integers.length - 1; i++)
        {
            System.out.printf("Enter integer %d: \n", i + 1);
            int number = Integer.parseInt(console.nextLine());
            integers[i] = number;
        }
        return integers;
    }
    public int[] sortArray(int[] integers) {
        int temp;
        for (int i = 1; i < integers.length; i++) {
            for (int j = i; j > 0; j--){
                if (integers[j] < integers[j - 1]) {
                    temp = integers[j];
                    integers[j] = integers[j -1];
                    integers[j - 1] = temp;
                }
            }

        }
        return integers;
    }
}