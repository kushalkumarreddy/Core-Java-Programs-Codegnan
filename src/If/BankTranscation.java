package If;

import java.util.Scanner;

public class BankTranscation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Available Balance");
		int ab = sc.nextInt();
		System.out.println("Enter Transcation Amount");
		int ta = sc.nextInt();
		System.out.println("Account Status (true/false)");
		boolean as = sc.nextBoolean();
				
		 if (as) {
	            if (ab >= ta) {
	                System.out.println("Transaction Successful");
	            } else {
	                System.out.println("Insufficient Balance");
	            }
	        } else {
	            System.out.println("Account Blocked");
	        }
		 sc.close();
		 
		 }
	}
