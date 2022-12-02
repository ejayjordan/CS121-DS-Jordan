import java.util.ArrayList;

public class Customer
{
    private String firstName;
    private String lastName;
    private String pin;
    public Customer(String firstName, String lastName, String pin)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getPin()
    {
        return pin;
    }

    public void setPin(String pin)
    {
        this.pin = pin;
    }

    public String customerInfo()
    {
        return String.format("First Name: %s%n"
                        + "Last Name: %s%n"
                        + "PIN: %s%n",
                this.firstName, this.lastName, this.pin);
    }
}