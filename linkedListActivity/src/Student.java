import java.util.LinkedList;
public class Student {
        public String firstName;
        public String lastName;
        public Integer ID;
        public String major;
        public String grade;
        public Double GPA;
        public String course;
        LinkedList<Object> courseList = new LinkedList<>();

        public void setStudent (String firstName, String lastName, Integer ID, String major, String grade, Double GPA){
            this.firstName = firstName;
            this.lastName = lastName;
            this.ID = ID;
            this.major = major;
            this.grade = grade;
            this.GPA = GPA;
        }

        public void addCourse (String course) {
            this.course = course;
            courseList.add(course);
        }
        public void removeCourse (String course) {

            courseList.remove(course);
    }
        public String getCourse(){
            return this.course;
        }

        public String getFirstName () {
            return this.firstName;
        }
        public String getLastName () {
            return this.lastName;
        }
        private String getID () {
            return String.valueOf(this.ID);
        }
        private String getMajor () {
            return this.major;
        }
        private String getGrade () {
            return this.grade;
        }
        private Double getGPA(){
            return this.GPA;
        }

        public void getStudentInfo(){
            System.out.printf("""
                    Student: %s %s
                    ID: %s
                    Major: %s
                    Class: %s
                    GPA: %s
                    """, firstName, lastName, ID, major, grade, GPA);
        }
        public void displayStudentCourses () {
            System.out.printf("\nCourses\n" + "-----\n" + "%s\n\n", courseList);
        }
    }
