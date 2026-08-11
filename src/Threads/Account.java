package Threads;

public class Account {
	int balance = 1000;
	
	void withDraw(int amount) {
		if(balance > amount) {
			System.out.println("Withdraw Sucessful: "+Thread.currentThread().getName());
			balance = balance-amount;
			System.out.println("Remaining Balance is: "+balance);
		} else {
			System.out.println("Insufficient Balance: "+Thread.currentThread().getName());
		}
	}

}
