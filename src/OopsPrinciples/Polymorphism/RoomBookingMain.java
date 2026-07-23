package OopsPrinciples.Polymorphism;

public class RoomBookingMain {
	public static void main(String[] args) {
		
		RoomBooking r1 = new RoomBooking("Kushal");
		r1.display();
		r1.calculateBill();
		System.out.println();
		
		RoomBooking r2 = new RoomBooking("Rahul","Duluxe");
		r2.display();
		r2.calculateBill(1000);
		System.out.println();
		
		RoomBooking r3 = new RoomBooking("Arya","Suite",3);
		r3.display();
		r3.calculateBill(2500,15);
	}

}
