package OopsPrinciples.Polymorphism;

public class ElectricityBill {
	
	
	public void calcualteBill(int units) {
		int bill = units*8;
		System.out.println("Total Bill = "+bill);
	}
	
	public void calculateBill(int units, double serviceCharge) {
		double bill = (units*8) + serviceCharge;
		System.out.println("TOtal Bill with service charge: "+bill);		
	}
	
	public void calculateBill(int units, double serviceCharge, double tax) {
		double bill = (units*8) + serviceCharge;
		double finalBill = bill + (bill * tax / 100);
		System.out.println("Final Bill: "+finalBill);
		
	}
	

}
