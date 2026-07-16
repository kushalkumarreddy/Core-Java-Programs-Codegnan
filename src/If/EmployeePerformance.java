package If;

import java.util.Scanner;

public class EmployeePerformance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Performance");
		int ps = sc.nextInt();
		
		if(ps>=90 &&ps<=100) {
			System.out.println("Outstanding");
		} else if(ps>=80 && ps<=89){
			System.out.println("Excellent");
		} else if(ps>=70 && ps<=79) {
			System.out.println("Good");
		} else if(ps>=60 && ps<=69) {
			System.out.println("Average");
		} else {
			System.out.println("Need Improvement");
		}
		sc.close();
	}

}
