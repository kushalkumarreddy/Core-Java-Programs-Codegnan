package Arrays;

import java.util.Scanner;

public class StringScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String arr[] = new String[5];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print("Enter "+i+"th position value: ");
			arr[i] = sc.next();
		}
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
	}

}
