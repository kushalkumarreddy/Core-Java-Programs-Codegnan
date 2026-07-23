package OopsPrinciples.Polymorphism;

public class BankAccountMain {
	public static void main(String[] args) {
		
		BankAccount a1 = new BankAccount("Kushal");
		BankAccount a2 = new BankAccount("Pavan","Savings");
		BankAccount a3 = new BankAccount("sai","Salary Account",500);
		
		a1.display();
		a2.display();
		a3.display();
	}

}
