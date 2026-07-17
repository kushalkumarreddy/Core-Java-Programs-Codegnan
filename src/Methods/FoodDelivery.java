package Methods;

public class FoodDelivery {

    int orderId;
    String customerName;
    String restaurantName;
    String foodItem;
    int quantity;
    double pricePerItem;

    FoodDelivery(int orderId, String customerName, String restaurantName,
                 String foodItem, int quantity, double pricePerItem) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.restaurantName = restaurantName;
        this.foodItem = foodItem;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    double calculateBill() {
        return quantity * pricePerItem;
    }

    double applyDiscount(double bill) {
        if (bill > 1000) {
            return bill - (bill * 0.15);
        }
        return bill;
    }

    double deliveryCharge(double bill) {
        if (bill < 500) {
            return 50;
        }
        return 0;
    }

    void displayBill() {

        double bill = calculateBill();
        double finalBill = applyDiscount(bill);
        double delivery = deliveryCharge(finalBill);
        finalBill = finalBill + delivery;

        System.out.println("Order ID        : " + orderId);
        System.out.println("Customer Name   : " + customerName);
        System.out.println("Restaurant Name : " + restaurantName);
        System.out.println("Food Item       : " + foodItem);
        System.out.println("Quantity        : " + quantity);
        System.out.println("Price per Item  : ₹" + pricePerItem);
        System.out.println("Total Bill      : ₹" + bill);

        if (bill > 1000) {
            System.out.println("Discount (15%)  : ₹" + (bill * 0.15));
        } else {
            System.out.println("Discount (15%)  : ₹0");
        }

        System.out.println("Delivery Charge : ₹" + delivery);
        System.out.println("Final Bill      : ₹" + finalBill);
        System.out.println();
    }

    public static void main(String[] args) {

        FoodDelivery c1 = new FoodDelivery(101, "Rahul", "Domino's", "Pizza", 2, 600);
        FoodDelivery c2 = new FoodDelivery(102, "Priya", "KFC", "Burger", 2, 200);
        FoodDelivery c3 = new FoodDelivery(103, "Arjun", "Biryani House", "Chicken Biryani", 3, 250);

        c1.displayBill();
        c2.displayBill();
        c3.displayBill();
    }
}