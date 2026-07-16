package If;

import java.util.Scanner;

public class ATMMenu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== ATM MENU =====\n1.Check Balance\n2. Deposit Money\n3.Withdraw Money\n4. Mini Statement\n5. Exit");
		System.out.println("Enter your choice");
		int n = sc.nextInt();
		
		switch(n) {
		case 1 : System.out.println("Your balance is ₹2500000000");
		break;
		case 2: System.out.println("Enter amount to deposit");
		break;
		case 3: System.out.println("Enter amount to withdraw");
		break;
		case 4: System.out.println("Hello");
		break;
		case 5: System.out.println("Thank you for using our ATM.");
		break;
		default: System.out.println("Invalid Choice");
		}
		sc.close();
	}

}
