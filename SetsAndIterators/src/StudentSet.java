import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentSet {
    Scanner console = new Scanner(System.in);
    public Set<String> students = new HashSet<String>();
    public ArrayList<String> intArray = new ArrayList<>();

    public void addStudents() {
        while (true) {
            System.out.println("Enter any number of students to the set or press 'q' to quit");
            String student = console.nextLine();
            if (student.equals("q")) {
                break;
            } else {
                for (String num : intArray) {
                    students.add(student);
                }
            }
        }
    }
    public void displayStudents () {
        Iterator<String> studentsIter = students.iterator();
        while (studentsIter.hasNext()) {
            System.out.println(studentsIter.next());
        }
        System.out.println();
    }
}
