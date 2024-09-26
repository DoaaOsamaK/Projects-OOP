
package hotelbookingsystem;

import java.util.Date;


public class HotelBookingSystem {

    
    public static void main(String[] args) {
        // Create guests.
        Guest guest1 = new Guest("John Doe", "123456789", "G001", "john@example.com");
        Guest guest2 = new Guest("Jane Smith", "987654321", "G002", "jane@example.com");

        // Create rooms.
        Room room1 = new Room("101", "Single", 100.0);
        Room room2 = new Room("102", "Double", 150.0);

        // Create bookings.
        Booking booking1 = new Booking("B001", room1, guest1, new Date(2024, 9, 1), new Date(2024, 9, 5));
        Booking booking2 = new Booking("B002", room2, guest2, new Date(2024, 9, 10), new Date(2024, 9, 12));

        // Display booking details.
        booking1.displayBookingInfo();
        System.out.println();
        booking2.displayBookingInfo();
        
        // Process payments.
        Payments payment1 = new Payments("P001", booking1.calculateTotal(), new Date(), "Credit Card");
        payment1.processPayment();
        
        Payments payment2 = new Payments("P002", booking2.calculateTotal(), new Date(), "PayPal");
        payment2.processPayment();
    }
    }
    

