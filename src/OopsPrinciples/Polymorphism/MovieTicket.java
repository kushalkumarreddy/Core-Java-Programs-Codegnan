package OopsPrinciples.Polymorphism;

public class MovieTicket {
	
	public void bookTicket(int tickets) {
		int total = tickets*200;
		System.out.println("Total Amount: "+total);
	}
	
	public void bookTicket(int tickets, boolean isPremium) {
		int price;
		if(isPremium == true) {
			price = 350;
		} else {
			price = 200;
		}
		
		int total = tickets*price;
		System.out.println("Total: "+total);
	}
	
	public void bookTicket(int tickets, boolean isPremium, double discount) {
		
		int price;
		if(isPremium == true) {
			price = 350;
		} else {
			price = 200;
		}
		
		int total = tickets*price;
		System.out.println("Total: "+total);
		
		double finalamount = total-(total*discount/100);
		System.out.println("Discount: "+discount+"%");
		System.out.println("Final Payable Amount: "+finalamount);
		
	}

}
