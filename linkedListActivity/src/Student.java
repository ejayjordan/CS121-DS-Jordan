import java.util.LinkedList;

public class Student {
    private String firstName;
    private String lastName;
    private Integer ID;
    private String major;
    private String classStanding;
    private Double GPA;
    public LinkedList courseList = new LinkedList<>();

    public void constructor(String firstName, String lastName, Integer ID, String major, String classStanding, Double GPA){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.major = major;
        this.major = classStanding;
        this.GPA = GPA;
    }

    public void addCourse(){
        courseList.add("cs121");
        courseList.add("cs122");
        courseList.add("cs222");
        courseList.add("cs315");
    }
    public void removeCourse(){
        courseList.remove(0);
    }
    public String getStudentInfo(){
        return firstName;
        return lastName;
        return String.valueOf(this.ID);
        return major;
        return classStanding;
        return String.valueOf(this.GPA);
    }
    public void displayStudentCourses(){
        System.out.printf("Courses\n" + "-----\n" + "%s\n", courseList);
    }
}
