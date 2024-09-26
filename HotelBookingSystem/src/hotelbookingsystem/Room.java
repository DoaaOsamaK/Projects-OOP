package hotelbookingsystem;

public class Room {

    private String roomNumber;
    private String roomType; // e.g., Single, Double, Suite
    private double price;
    private boolean isBooked;

    public Room(String roomNumber, String roomType, double price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
    }


    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isIsBooked() {
        return isBooked;
    }

    public void setIsBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    // Method to book the room.
    public void bookRoom() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Room " + roomNumber + " has been booked.");
        } else {
            System.out.println("Room " + roomNumber + " is already booked.");
        }
    }
    
    // Method to release the room.
    public void releaseRoom(){
        if(isBooked){
            isBooked=false;
            System.out.println("Room " + roomNumber + " has been released.");
        }else{
            System.out.println("Room " + roomNumber + " is already available.");
        }
    }


}
