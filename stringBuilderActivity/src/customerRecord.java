import java.util.ArrayList;
public class customerRecord {
    StringBuilder stringBuilder = new StringBuilder();
    ArrayList<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer userInput)
    {
        customers.add(userInput);
    }
    public StringBuilder getAllCustomers()
    {
        for(Customer customer: customers)
        {
            stringBuilder.append(customer);

        }
        return stringBuilder;
    }
}