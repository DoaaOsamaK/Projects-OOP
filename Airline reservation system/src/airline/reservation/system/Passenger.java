
package airline.reservation.system;

// Passenger.java
public class Passenger extends Person {
    private String passportNumber;

    public Passenger(String name, int age, String passportNumber) {
        super(name, age); // Call to the base class constructor
        this.passportNumber = passportNumber;
    }

    // Getter and Setter Methods
    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}

