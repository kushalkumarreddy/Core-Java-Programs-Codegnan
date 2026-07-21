package OopsPrinciples.Encapsulation;

public class Banking {
	public static void main(String[] args) {
	Customer c1 = new Customer();
	
	c1.setCid(101);
	c1.setCname("sai");
	c1.setBal(100000);
	c1.setWithdrawamt(10000);
	
	System.out.println(c1.getCid()+" "+c1.getCname()+" "+c1.getBal()+" "+c1.getWithdrawamt());
	
	
	
	}
}
