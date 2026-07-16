package Loops;

import java.util.Scanner;

public class StopNegativeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a number: ");
			int i = sc.nextInt();
			if(i<0)
				break;
				System.out.println(i);
			
			
		}
		System.out.println("Negative Number Entered");
		sc.close();
	}

}
