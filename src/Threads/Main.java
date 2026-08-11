package Threads;

public class Main {
	public static void main(String[] args) {
		Account ac = new Account();
		Customer c1 = new Customer(ac);
		
		Thread t1 = new Thread(c1,"ram");
		t1.start();
	}

}
