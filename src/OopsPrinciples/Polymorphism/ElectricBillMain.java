//using Method Overloading


package OopsPrinciples.Polymorphism;

public class ElectricBillMain {
	public static void main(String[] args) {
		
		ElectricBill eb = new ElectricBill ();
		
		eb.calculateBill(100);
		eb.calculateBill(100,10);
		eb.calculateBill(100,10,20);
		
	}

}
