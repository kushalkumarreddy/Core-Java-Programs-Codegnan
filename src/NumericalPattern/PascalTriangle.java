package NumericalPattern;

public class PascalTriangle {
	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i <= n; i++) {

			// Print spaces
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}

			int num = 1;

			// Print Pascal Triangle values
			for (int k = 1; k <= i; k++) {
				System.out.print(num + " ");
				num = num * (i - k) / k;
			}

			System.out.println();
		}
	}
}