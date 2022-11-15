import java.util.ArrayList;
import java.util.Arrays;

public class genericMethods {
    public <E> void printArrayList(ArrayList<E> inputArrayList) {
        for (E element : inputArrayList) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
