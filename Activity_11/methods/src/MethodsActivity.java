import java.util.Scanner;


public class MethodsActivity {
    static Scanner scanner = new Scanner(System.in);
    static double length;
    static double width;
    static double area;
    private static double getLength() {
        System.out.println("Enter the length of the rectangle: \n");
        length = Double.parseDouble(scanner.nextLine());
        return length;
    }
    public static double getWidth() {
        System.out.println("Enter the width of the rectangle: \n");
        width = Double.parseDouble(scanner.nextLine());
        return width;
    }
    public static double getArea(double length, double width) {
        area = (length * width);
        return area;
    }
    public static void displayData(double length, double width, double area) {
        System.out.print("rectangle length: " + length + "\nrectangle width: " + width + "\nrectangle area: " + area);
    }
    public static void main(String[] args) {
        getLength();
        getWidth();
        getArea(length, width);
        displayData(length, width, area);


    scanner.close();
    }
}
