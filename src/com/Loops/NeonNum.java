package com.Loops;

public class NeonNum {
	public static void main(String[] args) {

        int n = 9;
        int square = n * n;
        int sum = 0;

        while (square != 0) {
            int rem = square % 10;
            sum = sum + rem;
            square = square / 10;
        }

        if (sum == n) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not a Neon Number");
        }
    }

}
