package com.Loops;

public class Palindrome {
	public static void main(String[] args) {
		int n=151;
		int temp = n;
		int rev =0;
		
		while(n!=0) {
			int rem = n%10;
			rev = (rev*10)+rem;
			n=n/10;
		}
		
		if(temp==rev) {
			System.out.println("Is Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		
		System.out.println(rev);
	}

}
