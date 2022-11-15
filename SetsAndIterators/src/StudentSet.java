import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentSet {
    Scanner console = new Scanner(System.in);
    Set<Integer> students = new HashSet<>();
    ArrayList<Integer> intArray = new ArrayList<>();

    public void addStudents() {
        for (Integer num : intArray) {
            System.out.println("Enter any number of students to the set or press 'q' to quit");
            String student = console.nextLine();
            if (student == "q") {
                break;
            }
        }
    }
        public void displayStudents () {
            Iterator<Integer> studentsIter = students.iterator();
            while (studentsIter.hasNext()) {
                Integer students = studentsIter.next();
                System.out.println(students);
            }
        }
    }
