package schoolmanagementsystem;

public class Administrator extends Person {

    private String position;
    private int yearsOfExperience;

    public Administrator(String name, int age, String address, String position, int yearsOfExperience) {
        super(name, age, address);
        this.position = position;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void manage() {
        System.out.println(getName() + " is managing the school as " + position);

    }
    
    String role(){
        return "Administrator";
    }

}
