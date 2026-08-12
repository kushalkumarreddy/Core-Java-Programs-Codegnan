package Threads;

public class Account {
	int balance=1000;
	
	
	/*
	 * void withDraw(int amount) {
	 * System.out.println("wait for withdraw..................");
	 *
	 * synchronized(this) { if(balance>amount) {
	 * System.out.println("with draw successfully :"+Thread.currentThread().getName(
	 * )); balance=balance-amount;
	 * System.out.println("remaining balance is "+balance); }else {
	 * System.out.println("insufficient balance :"+Thread.currentThread().getName())
	 * ; } } }
	 */
	
	synchronized void withDraw(int amount) throws InterruptedException {
		if(amount>balance) {
			System.out.println("insufficient balance "+Thread.currentThread().getName());
			System.out.println("wiating for deposit..........");
			wait();
		}
		System.out.println("with draw successfully...");
		balance=balance-amount;
		System.out.println("remaining balance :"+balance);
		
	}
	
	synchronized void deposit(int amount) {
		balance=balance+amount;
		System.out.println("withdraw is available");
		notify();
		
	}
	
	
}
