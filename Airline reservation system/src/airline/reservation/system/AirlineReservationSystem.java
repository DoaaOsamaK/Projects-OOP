
package airline.reservation.system;


public class AirlineReservationSystem {

    public static void main(String[] args) {
        Passenger passenger1 = new Passenger("John Doe", 30, "A12345678");
        Flight flight1 = new Flight("XY123", 5);
        
        Booking booking1 = new Booking(passenger1, flight1);
        booking1.confirmBooking();
    }
}