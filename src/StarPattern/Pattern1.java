package StarPattern;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		int star = 1;
		int space = n-star;
		
		for(int i=1;i<=n;i++) {  //row control
			
			//to print stars
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
			}
			
			star++;
			space--;
			System.out.println();
			
		}
		sc.close();
	}

}
