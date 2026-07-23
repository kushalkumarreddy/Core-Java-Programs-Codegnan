package OopsPrinciples.Polymorphism;

public class BankAccount {
	
	String name;
	String accounttype;
	double initaldeposit;
	
	public BankAccount(String name) {
		this.name = name;
	}
	
	public BankAccount(String name,String accounttype) {
		this.name = name;
		this.accounttype = accounttype;
	}
	
	public BankAccount(String name, String accounttype, double initaldeposit) {
		this.name = name;
		this.accounttype = accounttype;
		this.initaldeposit = initaldeposit;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		
		if(accounttype != null) {
			System.out.println("Account Type: "+accounttype);
		}
		
		if(initaldeposit != 0) {
			System.out.println("Inital Deposit: "+initaldeposit);
		}
		
		System.out.println();
	}

}
