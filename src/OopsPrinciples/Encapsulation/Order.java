package OopsPrinciples.Encapsulation;

public class Order {
	private int OrderId;
	private String CustomerName;
	private int TotalAmount;
	private String OrderStatus;
	
	
	public int getorderid() {
		return OrderId;
	}
	
	public void setorderid(int OrderId) {
		this.OrderId = OrderId;
	}
	
	
	public String getcustomername() {
		return CustomerName;
	}
	
	public void setcustomername(String CustomerName) {
		this.CustomerName = CustomerName;
	}
	
	
	public int gettotalamount() {
		return TotalAmount;
	}
	
	public void settotalamount(int TotalAmount) {
		if(TotalAmount >=0) {
			this.TotalAmount = TotalAmount;
		} else {
			System.out.println("Total Amount cannot be Negative");
		}
	}
	
	public String getorderstatus() {
		return OrderStatus;
	}
	
	public void setorderstatus(String OrderStatus) {
		if(OrderStatus.equals("Pending") ||
            OrderStatus.equals("Preparing") ||
            OrderStatus.equals("Delivered") ||
            OrderStatus.equals("Cancelled")) {
			this.OrderStatus = OrderStatus;
		} else {
			System.out.println("Invalid Order Status");
		}
	}
	
	
}
