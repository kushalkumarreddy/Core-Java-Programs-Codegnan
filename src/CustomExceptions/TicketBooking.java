package CustomExceptions;

class NoSeatsAvailableException extends Exception {
 NoSeatsAvailableException(String message) {
     super(message);
 }
}

public class TicketBooking {

 static void bookTicket(int availableSeats) throws NoSeatsAvailableException {

     if (availableSeats <= 0) {
         throw new NoSeatsAvailableException(
             "No seats available in the selected class."
         );
     } else {
         System.out.println("Ticket booked successfully.");
     }
 }

 public static void main(String[] args) {
     int availableSeats = 0;

     try {
         bookTicket(availableSeats);
     } catch (NoSeatsAvailableException e) {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}