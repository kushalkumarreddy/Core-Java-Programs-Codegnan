package com.Loops;

public class LargestDigit {
	public static void main(String[] args) {

        int n = 342;
        int largest = 0;

        while (n != 0) {
            int rem = n % 10;

            if (rem > largest) {
                largest = rem;
            }

            n = n / 10;
        }

        System.out.println(largest);
    }

}
