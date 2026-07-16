package Loops;

public class OddDigit {
	public static void main(String[] args) {

        int n = 34216;

        while (n != 0) {
            int rem = n % 10;

            if (rem % 2 != 0) {
                System.out.print(rem + " ");
            }

            n = n / 10;
        }
    }
}
