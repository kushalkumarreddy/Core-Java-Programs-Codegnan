package Threads;

public class Customer implements Runnable{
	Account ac;
	Customer(Account ac){
		this.ac = ac;
	}
	
	@Override
	public void run() {
		ac.withDraw(900);
	}

}
