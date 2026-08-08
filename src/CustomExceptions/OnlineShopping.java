package CustomExceptions;

class InsufficientStockException extends Exception {
 InsufficientStockException(String message) {
     super(message);
 }
}

public class OnlineShopping {

 static void placeOrder(int availableStock, int requestedQuantity)
         throws InsufficientStockException {

     if (requestedQuantity > availableStock) {
         throw new InsufficientStockException(
             "Insufficient stock. Only " + availableStock + " item(s) available."
         );
     } else {
         System.out.println("Order placed successfully.");
     }
 }

 public static void main(String[] args) {
     int availableStock = 20;
     int requestedQuantity = 25;

     try {
         placeOrder(availableStock, requestedQuantity);
     } catch (InsufficientStockException e) {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}