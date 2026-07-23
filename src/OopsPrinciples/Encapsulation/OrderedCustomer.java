package OopsPrinciples.Encapsulation;

public class OrderedCustomer {
	public static void main(String[] args) {
		Order customer = new Order();
		
		customer.setorderid(101);
		customer.setcustomername("Kushal");
		customer.settotalamount(2500);
		customer.setorderstatus("Preparing");
		
		System.out.println("Order id: "+customer.getorderid());
		System.out.println("CustomerName: "+customer.getcustomername());
		System.out.println("Total Amount: "+customer.gettotalamount());
		System.out.println("Order Status: "+customer.getorderstatus());
		
	}

}
