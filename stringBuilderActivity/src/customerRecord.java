import java.util.ArrayList;
public class customerRecord {
    StringBuilder stringBuilder = new StringBuilder();
    ArrayList<String> customers = new ArrayList<>();

    public void addCustomers() {

    }

    public String getAllCustomers() {
        String allCustomers = "";
        for (String customer : customers) {
            System.out.println(stringBuilder.capacity());
            System.out.println(stringBuilder);
        }
        return allCustomers;
    }
}

