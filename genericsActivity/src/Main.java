import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        genericMethods generic = new genericMethods();
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Double> doubleArrayList = new ArrayList<>(Arrays.asList(1.1,2.2,3.3,4.4,5.5));
        ArrayList<Character> characterArrayList = new ArrayList<>(Arrays.asList('A','B','C','D','E'));
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("Alpha", "Beta", "Gamma", "Delta", "Epsilon"));

        System.out.print("Integer array: ");
        generic.printArrayList(integerArrayList);
        System.out.print("Double array: ");
        generic.printArrayList(doubleArrayList);
        System.out.print("Character array: ");
        generic.printArrayList(characterArrayList);
        System.out.print("String array: ");
        generic.printArrayList(stringArrayList);
    }
}
