public class Main {
    public static void main(String[] args){
        Student studentOne = new Student();
        Student studentTwo = new Student();

        studentOne.constructor("Lily","Parson",1,"CompSci","Freshman");
        studentOne.addCourse();
        studentOne.getStudentInfo();
        studentOne.displayStudentCourses();

        studentOne.removeCourse();

        studentTwo.constructor("Lily","Parson",1,"CompSci","Senior");
        studentTwo.addCourse();
        studentTwo.getStudentInfo();
        studentTwo.displayStudentCourses();



    }
}
