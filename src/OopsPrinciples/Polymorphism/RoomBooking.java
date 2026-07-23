package OopsPrinciples.Polymorphism;

public class RoomBooking {
	
	String CustomerName;
	String RoomType;
	int noofdays;
	
	RoomBooking(String CustomerName){
		this.CustomerName = CustomerName;
	}
	
	RoomBooking(String CustomerName, String RoomType){
		this.CustomerName = CustomerName;
		this.RoomType = RoomType;
	}
	
	RoomBooking(String CustomerName, String RoomType, int noofdays){
		this.CustomerName = CustomerName;
		this.RoomType = RoomType;
		this.noofdays = noofdays;
	}
	
	public void calculateBill() {
		double bill = noofdays*1000;
		if(bill != 0)
		System.out.println("Bill: "+bill);
	}
	
	public void calculateBill(double RoomRate) {
		double bill = noofdays*RoomRate;
		if(bill != 0)
		System.out.println("Bill: "+bill);
	}
	
	public void calculateBill(double RoomRate, double discount) {
		double bill = RoomRate*noofdays;
		bill = bill - (bill * discount / 100);
		System.out.println("Bill After Discount: "+bill+"\n");
	}
	
	public void display() {
		System.out.println("Customer name: "+CustomerName);
		
		if(RoomType != null)
		System.out.println("Room Type: "+RoomType);
		
		if(noofdays != 0)
		System.out.println("No of Days: "+noofdays);
	}

}
