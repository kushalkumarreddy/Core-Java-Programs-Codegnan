package Methods;

import java.util.Scanner;

public class FoodOrder {

    double bill;
    double discount;
    double finalBill;

    public void displayMenu() {
        System.out.println("===== FOOD MENU =====");
        System.out.println("1. Pizza      - ₹250");
        System.out.println("2. Burger     - ₹150");
        System.out.println("3. Sandwich   - ₹120");
        System.out.println("4. Biryani    - ₹300");
        System.out.println("5. Pasta      - ₹200");
    }

    public void calculateBill(int quantity, double price) {
        bill = quantity * price;
    }

    public void calculateDiscount(double bill) {
        if (bill > 1000) {
            discount = bill * 0.10;
        } else {
            discount = 0;
        }

        finalBill = bill - discount;
    }

    public void printBill() {
        System.out.println("\n----- BILL -----");
        System.out.println("Total Bill : ₹" + bill);
        System.out.println("Discount   : ₹" + discount);
        System.out.println("Final Bill : ₹" + finalBill);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FoodOrder f = new FoodOrder();

        f.displayMenu();

        System.out.print("Enter Item Number: ");
        int choice = sc.nextInt();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        double price = 0;

        if (choice == 1) {
            price = 250;
        } else if (choice == 2) {
            price = 150;
        } else if (choice == 3) {
            price = 120;
        } else if (choice == 4) {
            price = 300;
        } else if (choice == 5) {
            price = 200;
        } else {
            System.out.println("Invalid Choice");
            return;
        }

        f.calculateBill(quantity, price);
        f.calculateDiscount(f.bill);
        f.printBill();

        sc.close();
    }
}