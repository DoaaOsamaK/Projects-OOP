
package hotelbookingsystem;


public abstract class Person {
 
  // 1. Attributes  
  private String name;
  private String ID;
  
  // 2. constructer
    public Person(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }
  
  // 3. getter & setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    // Abstract method to be overridden demonstrating abstraction. 
    public abstract void displayInfo();
  
}
