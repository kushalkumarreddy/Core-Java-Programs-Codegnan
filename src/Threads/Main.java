package Threads;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Account ac=new Account();
		Customer c1= new Customer(ac);
		Thread t1=new Thread(c1,"ram");
		t1.start();
		Thread.sleep(1000);
		System.out.println("deposit money using main thread");
		ac.deposit(1000);
		
	}
}