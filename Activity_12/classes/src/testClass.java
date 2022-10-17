public class testClass {

    public static void main(String[] args) {
        class1 fallClass = new class1("CS121", 3, 100);
        class2 springClass = new class2("CS222", 3, 95);

        System.out.printf("Fall Semester Class: ");
        System.out.printf("\n--------------------");
        System.out.printf("\nCourse Name:%s\n"+"Course Credits:%s\n"+"Course Grade:%s\n",fallClass.className1, fallClass.classCredits1, fallClass.classGrade1);
        System.out.println();
        System.out.printf("Spring Semester Class: ");
        System.out.printf("\n--------------------");
        System.out.printf("\nCourse Name:%s\n"+"Course Credits:%s\n"+"Course Grade:%s\n",springClass.className2, springClass.classCredits2, springClass.classGrade2);
    }
}