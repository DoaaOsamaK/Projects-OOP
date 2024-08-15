
package airline.reservation.system;

// Flight.java
public class Flight {
    private String flightNumber;
    private int availableSeats;

    public Flight(String flightNumber, int availableSeats) {
        this.flightNumber = flightNumber;
        this.availableSeats = availableSeats;
    }

    public String getFlightDetails() {
        return "Flight Number: " + flightNumber + ", Available Seats: " + availableSeats;
    }

    public void bookSeat() {
        if (availableSeats > 0) {
            availableSeats--;
            System.out.println("Seat booked successfully!");
        } else {
            System.out.println("No available seats!");
        }
    }
}

