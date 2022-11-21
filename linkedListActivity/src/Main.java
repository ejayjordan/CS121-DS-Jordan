public class Main {
    public static void main(String[] args){
        Student studentOne = new Student();
        Student studentTwo = new Student();

        studentOne.setStudent("Lily", "Qwan",1, "CompSci", "Senior", 3.98);
        studentOne.addCourse("cs121");
        studentOne.addCourse("cs122");
        studentOne.addCourse("cs222");
        studentOne.getStudentInfo();
        studentOne.displayStudentCourses();

        studentOne.removeCourse("cs222");
        studentOne.displayStudentCourses();

        studentTwo.setStudent("Hanna", "Wong", 2, "CompSci", "Freshman", 3.78);
        studentTwo.addCourse("cs121");
        studentTwo.addCourse("cs122");
        studentTwo.addCourse("cs222");
        studentTwo.addCourse("cs315");
        studentTwo.getStudentInfo();
        studentTwo.displayStudentCourses();

        studentTwo.removeCourse("cs315");
        studentTwo.displayStudentCourses();



    }
}
