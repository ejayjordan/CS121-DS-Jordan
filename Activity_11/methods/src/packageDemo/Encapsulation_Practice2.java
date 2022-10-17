package packageDemo;

public class Encapsulation_Practice2 {
    package packageDemo.Encapsulation_Practice2;

    public class Student {
        // Variables declared
        public String name;
        private String id;
        public String classStanding;
        public String major;
        private double gpa;

        //constructor
        public Student(String name, String id, String classStanding, String major, double gpa)
        {
            this.name = name;
            this.id = id;
            this.classStanding = classStanding;
            this.major = major;
            this.gpa = gpa;

        }
        //public visibility means that this method can be accessed anywhere in the program
        // so long as you have an instance of this class to call it from
        public void getStudentInfo()
        {
            System.out.printf("Name: %s%n Class Standing: %s%nMajor: %s%n", name,classStanding, major);
        }
        //private visibility means that this method can't be accessed anywhere other than inside of the class
        private void getStudentId(){
            System.out.printf("Name: %s%n ID: %s%n",name, id);
        }

        //protected visibility means that this method can only be accessed inside of this package
        //and from subclasses of this class
        protected void getStudentRecord()
        {
            System.out.printf("Name: %s%n ID: %s%nClass Standing: %s%nMajor: %s%nGPA: %.1f%n",name, id, classStanding,major,gpa);
        }
        //default Visibility means that this method can only be accessed inside of this package
        void getStudent(){
            System.out.printf("Name: %s%n",name);
        }
    }
}
