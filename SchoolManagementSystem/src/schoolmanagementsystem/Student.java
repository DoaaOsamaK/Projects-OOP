
package schoolmanagementsystem;

public class Student extends Person {
//It should include a study() method that prints a message indicating the student is studying.
    private String grade;
    private String studentID;

    public Student(String name, int age, String address, String grade, String studentID) {
        super(name, age, address);
        this.grade = grade;
        this.studentID = studentID;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    public void study(){
         System.out.println(getName() + " is studying in grade " + grade);
    }
    
    String role(){
        return "Student";
    }
    
}
