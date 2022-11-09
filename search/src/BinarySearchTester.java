import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearchTester {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        BinarySearchDemo demo = new BinarySearchDemo();
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(5, 4, 3, 1, 2));
        System.out.print("unsorted: ");
        for (int num: array){
            System.out.print(num + " ");
        }
        System.out.println();
        ArrayList<Integer> sortedArray = selectionSort(array);
        System.out.print("sorted: ");
        for (int num: sortedArray){
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("What number would you like to search for?");
        int key = Integer.parseInt(console.nextLine());

        int found = demo.binarySearch(key, sortedArray);
        if (found == 1){
            System.out.println("Item not found.");
        }else{
            System.out.printf("Item found at index %d, position %d", found, found +1);
        }
    }
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> unsortedArray){
        ArrayList<Integer> sortedArray = unsortedArray;
        for (int i = 0; i < sortedArray.size() - 1; i++){
            int min = i;
            for (int j = i +1; j < sortedArray.size(); j++){
                if(sortedArray.get(j) <sortedArray.get(min)){
                    min = j;
                }
            }
            int temp = sortedArray.get(i);
            sortedArray.set(i, sortedArray.get(min));
            sortedArray.set(min, temp);
        }
        return sortedArray;
    }
}
