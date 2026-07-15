package com.Loops;

public class PrimeCheck {
	public static void main(String[] args) {
		int n = 5;
		boolean isPrime=true;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				isPrime=false;
			}
			}
		if(isPrime) {
			System.out.println("P");
		} else {
			System.out.println("NP");
		}
	}

}
