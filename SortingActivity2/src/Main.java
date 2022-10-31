public class Main {
    public static void main(String[] args){
        Sorting sorter = new Sorting();

        int[] x = sorter.getArray();
        System.out.println("Unsorted: ");
        printArray(x);

        int[] y = sorter.sortArray(printArray(x));
        System.out.println("Sorted: ");
        printArray(y);

        System.out.println();
    }
    public static int[] printArray(int[] integers){
        for (int number: integers) {
            System.out.print(number + " ");
        }
        System.out.println();
        return integers;
    }
}