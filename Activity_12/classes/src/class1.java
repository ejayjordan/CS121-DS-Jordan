public class class1 {
    String className1;
    int classCredits1;
    int classGrade1;

    public class1(String name, int credits, int grade) {
        this.className1 = name;
        this.classCredits1 = credits;
        this.classGrade1 = grade;
    }

    public void setclass1(String name, int credits, int grade) {
        System.out.printf("Fall Class: %d\n" + "Fall Class Credits: %d\n" + "Fall Class Grade: %d\n", name, credits, grade);
    }
}