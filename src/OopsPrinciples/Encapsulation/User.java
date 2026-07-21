package OopsPrinciples.Encapsulation;

public class User {
	public static void main(String[] args) {
		Recharge r = new Recharge();
		
		r.setMobilenum("1234567890");
		r.setOpeName("Jio");
		r.setRechargeamt(1000);
		
		System.out.println("Mobile Number: "+r.getMobilenum());
		System.out.println("Operator Name: "+r.getOpeName());
		System.out.println("Recharge Amount: "+r.getRechargeamt());
	}

}
