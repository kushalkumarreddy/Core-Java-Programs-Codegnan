package OopsPrinciples.Polymorphism;

public class RechargeMain {	
	public static void main(String[] args) {
	
	Recharge r1 = new Recharge("9876543210");
    r1.displayRechargeDetails();
    r1.recharge();
    System.out.println();

    Recharge r2 = new Recharge("9876543210", 299);
    r2.displayRechargeDetails();
    r2.recharge(56);
    System.out.println();

    Recharge r3 = new Recharge("9876543210", 599, "Jio");
    r3.displayRechargeDetails();
    r3.recharge(84, 50);
    
	}

}
