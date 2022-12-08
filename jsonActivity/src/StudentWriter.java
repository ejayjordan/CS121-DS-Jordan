import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
public class StudentWriter {
    public static void main(String[] args){
        try{
            Student student = new Student("Jason Dean", 25, "CompSci");

            Gson gson = new Gson();
            String jsonString = gson.toJson(student);

            FileWriter fileWriter = new FileWriter("student.json");
            fileWriter.write(jsonString);
            fileWriter.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
