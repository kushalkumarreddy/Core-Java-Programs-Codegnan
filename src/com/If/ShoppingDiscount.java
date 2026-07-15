package com.If;

import java.util.Scanner;

public class ShoppingDiscount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Purchase Amount: ");
		int pa = sc.nextInt();
		System.out.println("Premium Member? (true or false)");
		boolean pm = sc.hasNextBoolean();
		
		double discount = 0;
		double total = 0;
		System.out.println("Your Amount: "+pa);
		if(pm) {
			if(pa >= 10000) {
				discount = pa*20/100;
				System.out.println("20% Discount: "+discount);
				total = pa-discount;
				System.out.println("Total: "+total);
			} else if (pa > 5000) {
				discount = pa*10/100;
				System.out.println("10% Discount");
				total = pa-discount;
				System.out.println("Total: "+total);
			} else {
				System.out.println("No Discount");
			}
		} else {
			if(pa >= 10000) {
				discount = pa*10/100;
				System.out.println("10% Discount");
				total = pa-discount;
				System.out.println("Total: "+total);
			} else if(pa >= 5000) {
				discount = pa*5/100;
				System.out.println("5% Discount");
				total = pa-discount;
				System.out.println("Total: "+total);
			} else {
				System.out.println("No Discount");
			}
		}
		sc.close();
	}

}
