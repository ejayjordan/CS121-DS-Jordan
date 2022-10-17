public class class2 {
    String className2;
    int classCredits2;
    int classGrade2;
    // constructor
    public class2(String name, int credits, int grade) {
        this.className2 = name;
        this.classCredits2 = credits;
        this.classGrade2 = grade;
    }
    // method
    public void setclass2(String name, int credits, int grade) {
        System.out.printf("Spring Class: %d\n" + "Spring Class Credits: %d\n" + "Spring Class Grade: %d\n", name, credits, grade);
    }
}