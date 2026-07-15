package com.Loops;

public class StrongNum {
	public static void main(String[] args) {

        int n = 145;
        int original = n;
        int sum = 0;

        while (n != 0) {

            int rem = n % 10;

            int fact = 1;

            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }

            sum = sum + fact;

            n = n / 10;
        }

        if (sum == original) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }
    }

}
