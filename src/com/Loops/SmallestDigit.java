package com.Loops;

public class SmallestDigit {
	 public static void main(String[] args) {

	        int n = 543;
	        int smallest = 9;

	        while (n != 0) {
	            int rem = n % 10;

	            if (rem < smallest) {
	                smallest = rem;
	            }

	            n = n / 10;
	        }

	        System.out.println(smallest);
	    }

}
