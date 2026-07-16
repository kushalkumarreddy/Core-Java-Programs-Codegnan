package If;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 Numbers: ");
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c = sc.nextInt();
		
		 if (a > b && a < c) {
	            System.out.println("A is the 2nd Largest");
	        } 
	        else if (b > a && b < c) {
	            System.out.println("B is the 2nd Largest");
	        } 
	        else {
	            System.out.println("C is the 2nd Largest");
	        }

	        sc.close();
	}

}
