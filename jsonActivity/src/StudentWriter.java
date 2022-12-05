import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class StudentWriter {
    public static Student main(String[] args){
        try{
            Gson gson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader("student.json"));
            Student student = gson.fromJson(reader, Student.class);

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
