public class Test {
    public static void main(String[] args) {
        customerRecord newCustomer = new customerRecord();
        StringBuilder allCustomers = newCustomer.getAllCustomers();
        System.out.println(allCustomers);

    }
}