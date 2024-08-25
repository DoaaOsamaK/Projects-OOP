
package schoolmanagementsystem;

public class Teacher extends Person {
    
    private String subject;
    private int yearsOfExperience;
    
     public Teacher(String name, int age, String address, String subject, int yearsOfExperience) {
        super(name, age, address);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
    }
    
    
    public void teach(){
        System.out.println(getName() + " is teaching " + subject);
    }
    
    String role(){
       return "Teacher";
    }
}
