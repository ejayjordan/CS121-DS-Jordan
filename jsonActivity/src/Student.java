public class Student {
    public String name;
    public int id;
    public String department;

    public Student(String name, int id, String department){
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public String getName(){ return name;}
    public Integer getID(){ return id;}
    public String getDepartment(){ return department;}
}
