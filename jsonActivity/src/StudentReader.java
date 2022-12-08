import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class StudentReader {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader("student.json"));
            Student student = gson.fromJson(reader, Student.class);
            System.out.println("***Student Details***");
            System.out.printf("Student name: %s\nStudent ID: %s\nStudent department: %s", student.getName(), student.getID(), student.getDepartment());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
