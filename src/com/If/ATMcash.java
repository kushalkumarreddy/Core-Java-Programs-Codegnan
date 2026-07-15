package com.If;

import java.util.Scanner;

public class ATMcash {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter PIN");
		int pin = sc.nextInt();
		System.out.println("Correct PIN");
		int cpin = sc.nextInt();
		System.out.println("Balance");
		int bal = sc.nextInt();
		System.out.println("Withdrawl Amount");
		int wa = sc.nextInt();
		
		if(pin == cpin) {
			if(wa <= bal) {
				System.out.println("Collect your Cash");
			}
		} else {
			System.out.println("Invalid Details");
		}
		sc.close();
	}

}
