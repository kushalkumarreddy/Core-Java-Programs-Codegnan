package Strings;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word to reverse: ");
		String s = sc.nextLine();
		String rev = "";
		
		for(int i=s.length()-1; i>=0;i--) {
			rev = rev + s.charAt(i);
		}
		
		System.out.println(rev);
		
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palndrome");
		}
		
		sc.close();
		
	}

}
