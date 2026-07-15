package Scanner;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Principal: ");
		double principal = sc.nextDouble();
		
		System.out.println("Rate: ");
		double rate = sc.nextDouble();
		
		System.out.println("Time: ");
		double time = sc.nextDouble();
		
		double si = principal*rate*time;
		
		System.out.println("Simple Interest: "+si);
		
		sc.close();
	}

}
