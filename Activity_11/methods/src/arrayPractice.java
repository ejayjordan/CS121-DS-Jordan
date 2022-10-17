import java.util.Scanner;
public class arrayPractice {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String [] firstNames = new String[2];
        String [] lastNames = new String[2];
        int [] ages = new int[2];

        for(int i = 0; i < 2; i++){
            System.out.println("First name: ");
            firstNames[i] = console.nextLine();
            System.out.println("Last Name: ");
            lastNames[i] = console.nextLine();
            System.out.println("Age: ");
            ages[i] = Integer.parseInt(console.nextLine());
            System.out.println();
        }
        System.out.printf("%-25s %s\n", "Name", "Age");
        for(int i = 0; i < firstNames.length; i++){
            System.out.printf("%-14s %d\n", firstNames[i] + " " + lastNames[i], ages[i]);
        }
        console.close(0);
    }
}
