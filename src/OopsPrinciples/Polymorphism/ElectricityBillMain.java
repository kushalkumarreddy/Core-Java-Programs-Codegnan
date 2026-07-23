package OopsPrinciples.Polymorphism;

public class ElectricityBillMain {
	
	public static void main(String[] args) {
		
		ElectricityBill eb = new ElectricityBill();
		
		eb.calcualteBill(100);
		
		eb.calculateBill(200, 10);
		
		eb.calculateBill(300, 20, 20);
		
	}

}
