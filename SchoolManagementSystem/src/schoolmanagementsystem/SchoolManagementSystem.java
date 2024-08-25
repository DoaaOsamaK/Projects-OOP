
package schoolmanagementsystem;

public class SchoolManagementSystem {

   
    public static void main(String[] args) {
        Person teacher = new Teacher("Alice", 30, "123 Main St", "Math", 5);
        Person student = new Student("Bob", 15, "456 Elm St", "10th", "S12345");
        Person admin = new Administrator("Charlie", 40, "789 Oak St", "Principal", 10);

        System.out.println(teacher.getName() + " is a " + teacher.role());
        ((Teacher) teacher).teach();

        System.out.println(student.getName() + " is a " + student.role());
        ((Student) student).study();

        System.out.println(admin.getName() + " is a " + admin.role());
        ((Administrator) admin).manage();
    }
    
}
