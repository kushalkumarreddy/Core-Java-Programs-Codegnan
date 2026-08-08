package CustomExceptions;

class CardExpiredException extends Exception {
 CardExpiredException(String message) {
     super(message);
 }
}

public class ATMTransaction {

 static void validateCard(boolean isExpired) throws CardExpiredException {

     if (isExpired) {
         throw new CardExpiredException(
             "ATM card has expired. Please contact your bank for a new card."
         );
     } else {
         System.out.println("Card is valid. Transaction allowed.");
     }
 }

 public static void main(String[] args) {
     boolean isExpired = true;

     try {
         validateCard(isExpired);
     } catch (CardExpiredException e) {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}