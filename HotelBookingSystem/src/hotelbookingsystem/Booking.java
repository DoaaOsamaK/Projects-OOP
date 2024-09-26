
package hotelbookingsystem;

import java.util.Date;


public class Booking {
    
    private String bookingId;
    private Room room;
    private Guest guest;
    private Date checkInDate;
    private Date checkOutDate; 

    public Booking(String bookingId, Room room, Guest guest, Date checkInDate, Date checkOutDate) {
        this.bookingId = bookingId;
        this.room = room;
        this.guest = guest;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
    
    // Method to calculate the total cost of the stay.
   public double calculateTotal() {
        long duration = checkOutDate.getTime() - checkInDate.getTime();
        int days = (int) (duration / (1000 * 60 * 60 * 24));
        return days * room.getPrice();
    }
    
   
    // Display booking details.
    public void displayBookingInfo() {
        System.out.println("Booking ID: " + bookingId);
        guest.displayInfo();
        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Check-In Date: " + checkInDate);
        System.out.println("Check-Out Date: " + checkOutDate);
        System.out.println("Total Cost: " + calculateTotal());
    }
    
}
