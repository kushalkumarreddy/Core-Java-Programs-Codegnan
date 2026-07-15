package com.Loops;

public class SumOfPrime {
	  public static void main(String[] args) {

	        int sum = 0;

	        for (int n = 2; n <= 100; n++) {

	            boolean isPrime = true;

	            for (int i = 2; i * i <= n; i++) {
	                if (n % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }

	            if (isPrime) {
	                sum = sum + n;
	            }
	        }

	        System.out.println(sum);
	    }
}
