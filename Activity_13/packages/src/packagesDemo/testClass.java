package packagesDemo;

public class testClass {
    public static void main(String[] args) {
        Main mainClass = new Main("Love is a Battle", "P.Willows", 10000, 150);

        System.out.printf("Book Tour: ");
        System.out.printf("\n--------------------");
        System.out.printf("\nTitle: %s\n"+"Author: %s\n"+"Prints: %s\n"+"Pages: %s\n",mainClass.title, mainClass.author, mainClass.copies, mainClass.pages);
        System.out.println();

    }
}
