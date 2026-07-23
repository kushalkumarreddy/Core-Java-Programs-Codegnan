//using Method Overloading

package OopsPrinciples.Polymorphism;

public class ElectricBill {
	
	void calculateBill(int units) {
        int bill = units * 8;
        System.out.println("Bill Amount : ₹" + bill);
    }
	
	 void calculateBill(int units, double rate) {
	        double bill = units * rate;
	        System.out.println("Bill Amount : ₹" + bill);
	    }
	 
	 void calculateBill(int units, double rate, double tax) {
	        double bill = units * rate;
	        double finalBill = bill + (bill * tax / 100);

	        System.out.println("Final Bill (Including Tax) : ₹" + finalBill);
	    }

}
