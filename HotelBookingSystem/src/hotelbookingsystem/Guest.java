
package hotelbookingsystem;


public class Guest extends Person {
    
    // Attributes
    private String guestId;
    private String email;

    
    
    // Constructor for Guest.
    public Guest(String name, String ID, String guestId, String email) {
        super(name, ID);
        this.guestId = guestId;
        this.email = email;
    }
    
    // Getters & Setters 

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
 // Overridden method demonstrating polymorphism.
    @Override
    public void displayInfo() {
        System.out.println("Guest Name: " + getName());
        System.out.println("ID Number: " + getID());
        System.out.println("Guest ID: " + guestId);
        System.out.println("Email: " + email);
    }
        
        
        
    
    
    
   
}
