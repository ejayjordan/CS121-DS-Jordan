public class main {
    public static void main (String[] args) {
        sorting sorter = new sorting();

        int[] x = sorter.getArray();
        System.out.println("Unsorted: ");
        printArray(x);

        int[] y = sorter.sortArray();
        System.out.println("Sorted: ");
        printArray(y);

        System.out.println();
    }
        public static void printArray(int[] integers){
            for (int num: integers) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
