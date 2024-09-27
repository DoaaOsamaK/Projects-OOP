# Airline Reservation System
![image](https://github.com/user-attachments/assets/b9f2e5eb-5d43-4936-8aa1-0110362de181)
## Objective:
Design and implement an Airline Reservation System using Object-Oriented Programming principles in Java. Your system should demonstrate the use of classes, inheritance, encapsulation, and other OOP concepts.

## Requirements:

## Classes and Relationships:

### Person Class: Define a Person class that contains basic attributes like name, age, and gender.
Passenger Class: Extend the Person class to create a Passenger class with additional attributes like passportNumber, contactDetails, and ticketDetails.
Flight Class: Create a Flight class that represents a flight. It should have attributes such as flightNumber, destination, departureTime, availableSeats, and methods to manage flight details.
Booking Class: Implement a Booking class to handle reservations. This class should link a Passenger to a Flight and manage booking details such as bookingID, seatNumber, and status (e.g., confirmed, canceled).
AirlineReservationSystem Class: This should be the main class that integrates all the other classes. It should provide an interface for adding passengers, booking flights, checking seat availability, and managing reservations.
Features to Implement:

### Create and Manage Passengers: Allow the system to create new passengers, view passenger details, and update their information.
Flight Management: Include functionalities to add new flights, view available flights, and update flight details like departure time and seat availability.
Booking Management: Enable the creation of new bookings, checking available seats, confirming or canceling a booking, and printing booking details.
Error Handling: Include error checking for scenarios like booking a flight that is full or trying to cancel a non-existent booking.
Encapsulation and Access Modifiers:

### Ensure proper use of access modifiers (private, protected, public) to encapsulate data within classes.
Use getter and setter methods to access and modify class properties when necessary.
Inheritance and Method Overriding:

#### Demonstrate inheritance by extending the Person class to create the Passenger class.
Override methods where applicable to customize behavior in subclasses.
Polymorphism:

#### Use polymorphism to handle different booking statuses or actions within the system (e.g., using a common interface for managing different types of flights).
Data Storage:

#### Implement basic file handling or data structures to store flight and booking information temporarily during the program's execution.
Submission:

#### Submit the source code files (AirlineReservationSystem.java, Booking.java, Flight.java, Passenger.java, and Person.java) along with a README.md file explaining the system's structure and how to run the program.
Bonus Challenge:

#### Add additional functionality such as seat selection, flight cancellation policies, or a basic user interface for interacting with the system.
Evaluation Criteria:

### Correctness of implementation and adherence to OOP principles.
Code readability, including comments, naming conventions, and proper use of access modifiers.
Error handling and robustness of the system.
Completeness of the system according to the requirements.
