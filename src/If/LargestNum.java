package If;

import java.util.Scanner;

public class LargestNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 Numbers: ");
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c = sc.nextInt();
		
		if( a>b && a>c) {
			System.out.println("A is Larger");
		} else if (b>a && b>c) {
			System.out.println("B is Larger");
		} else {
			System.out.println("C is Larger");
		}
		
		sc.close();	
		
	}

}
