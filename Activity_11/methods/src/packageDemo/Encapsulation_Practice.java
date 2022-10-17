package packageDemo;

public class Encapsulation_Practice {
    //instance variables
    String name;
    String ID;
    double salary;
    double bonus;
    double totalPay;

    //constructor
    public Employee(String name, String ID, double salary, double bonus){
        this.name = name;
        this.ID = ID;
        this.salary = salary;
        this.bonus = bonus;
    }
    //method to calc. total pay
    void calculateTotalPay(){
        totalPay = salary + bonus;
    }
    void getEmployeeInfo(){
        System.out.print
    }
}
