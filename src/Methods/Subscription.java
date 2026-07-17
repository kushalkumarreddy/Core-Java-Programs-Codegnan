package Methods;

public class Subscription {

    int userId;
    String userName;
    String platformName;
    String subscriptionPlan;
    double monthlyPrice;
    int numberOfMonths;

    Subscription(int userId, String userName, String platformName,
                 String subscriptionPlan, double monthlyPrice, int numberOfMonths) {

        this.userId = userId;
        this.userName = userName;
        this.platformName = platformName;
        this.subscriptionPlan = subscriptionPlan;
        this.monthlyPrice = monthlyPrice;
        this.numberOfMonths = numberOfMonths;
    }

    double calculateAmount() {
        return monthlyPrice * numberOfMonths;
    }

    double applyDiscount(double amount) {
        if (numberOfMonths == 12) {
            return amount - (amount * 0.20);
        }
        return amount;
    }

    double calculateGST(double amount) {
        return amount * 0.18;
    }

    void displayDetails() {

        double amount = calculateAmount();
        double discountedAmount = applyDiscount(amount);
        double gst = calculateGST(discountedAmount);
        double finalAmount = discountedAmount + gst;

        System.out.println("User ID            : " + userId);
        System.out.println("User Name          : " + userName);
        System.out.println("Platform Name      : " + platformName);
        System.out.println("Subscription Plan  : " + subscriptionPlan);
        System.out.println("Monthly Price      : ₹" + monthlyPrice);
        System.out.println("Number of Months   : " + numberOfMonths);
        System.out.println("Subscription Amount: ₹" + amount);

        if (numberOfMonths == 12) {
            System.out.println("Discount (20%)     : ₹" + (amount * 0.20));
        } else {
            System.out.println("Discount (20%)     : ₹0");
        }

        System.out.println("GST (18%)          : ₹" + gst);
        System.out.println("Final Amount       : ₹" + finalAmount);
        System.out.println();
    }

    public static void main(String[] args) {

        Subscription s1 = new Subscription(101, "Rahul", "Netflix", "Premium", 649, 12);
        Subscription s2 = new Subscription(102, "Priya", "Amazon Prime", "Standard", 299, 6);
        Subscription s3 = new Subscription(103, "Arjun", "Disney+ Hotstar", "Super", 149, 12);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}