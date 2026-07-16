package Methods;

import java.util.Scanner;

public class ATMSystem {
	double balance = 20000;
	
	public void CheckBalance() {
		System.out.println("Current Balance: ₹"+balance);
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Amount deposited: ₹"+amount);
		System.out.println("Updated Balance: ₹"+balance);
	}
	
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance = balance - amount;
			System.out.println("Amount deposited: ₹"+amount);
			System.out.println("Current Balance: ₹"+balance);
		} else {
			System.out.println("Insufficient Balance!!!");
			System.out.println("Current Balance: ₹"+balance);
		}
	}
	
	public void displayMenu(){
		System.out.println("ATM MENU");
		System.out.println("1.Check Balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ATMSystem atm = new ATMSystem();
		
		atm.displayMenu();
		System.out.println("Enter Your Choice: ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			atm.CheckBalance();
			break;
			
		case 2:
			System.out.println("Enter Deposit Amount: ₹");
			double depositAmount = sc.nextDouble();
			atm.deposit(depositAmount);
			break;
			
		case 3:
			System.out.println("Enter withdraw Amount: ₹");
			double withdrawAmount = sc.nextDouble();
			atm.withdraw(withdrawAmount);
			break;
			
		default:
			System.out.println("Invalid Choice");
		}
		
		sc.close();
	}

}
