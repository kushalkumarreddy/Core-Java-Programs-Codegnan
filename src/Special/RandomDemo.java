package Special;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random rm = new Random();
		int val = rm.nextInt();
		System.out.print(val);
	}
}