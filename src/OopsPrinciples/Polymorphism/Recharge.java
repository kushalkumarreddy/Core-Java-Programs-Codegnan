package OopsPrinciples.Polymorphism;

public class Recharge {
	
	String mobileNumber;
    double rechargeAmount;
    String serviceProvider;

    
    Recharge(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    Recharge(String mobileNumber, double rechargeAmount) {
        this.mobileNumber = mobileNumber;
        this.rechargeAmount = rechargeAmount;
    }

    Recharge(String mobileNumber, double rechargeAmount, String serviceProvider) {
        this.mobileNumber = mobileNumber;
        this.rechargeAmount = rechargeAmount;
        this.serviceProvider = serviceProvider;
    }

    public void recharge() {
        if (rechargeAmount == 0) {
            System.out.println("Recharge amount not entered.");
            return;
        }

        System.out.println("Recharge Successful");
        System.out.println("Validity : 28 Days");
    }

    public void recharge(int validity) {
        if (rechargeAmount == 0) {
            System.out.println("Recharge amount not entered.");
            return;
        }

        System.out.println("Recharge Successful");
        System.out.println("Validity : " + validity + " Days");
    }

    public void recharge(int validity, double cashback) {
        if (rechargeAmount == 0) {
            System.out.println("Recharge amount not entered.");
            return;
        }

        System.out.println("Recharge Successful");
        System.out.println("Validity : " + validity + " Days");
        System.out.println("Cashback : ₹" + cashback);
    }

    public void displayRechargeDetails() {
        System.out.println("Mobile Number : " + mobileNumber);

        if (rechargeAmount != 0) {
            System.out.println("Recharge Amount : ₹" + rechargeAmount);
        }

        if (serviceProvider != null) {
            System.out.println("Service Provider : " + serviceProvider);
        }
    }


}
