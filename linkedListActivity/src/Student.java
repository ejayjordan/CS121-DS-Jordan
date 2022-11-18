import java.util.LinkedList;

public class Student {
        public String firstName;
        public String lastName;
        public Integer ID;
        public String major;
        public String classStanding;
        LinkedList<Object> courseList = new LinkedList<>();

        public void constructor (String firstName, String lastName, Integer ID, String major, String
        classStanding){
            this.firstName = firstName;
            this.lastName = lastName;
            this.ID = ID;
            this.major = major;
            this.major = classStanding;
        }

        public void addCourse () {
            courseList.add("cs121");
            courseList.add("cs122");
            courseList.add("cs222");
            courseList.add("cs315");
        }
        public void removeCourse () {
            courseList.remove(0);
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
        private String getClassStanding () {
            return this.classStanding;
        }

        public void getStudentInfo(){
            System.out.printf("""
                    Student: %s %s
                    ID: %s
                    Major: %s
                    Class: %s
                    """, firstName, lastName, ID, major, classStanding);
        }
        public void displayStudentCourses () {
            System.out.printf("Courses\n" + "-----\n" + "%s\n", courseList);
        }
    }
