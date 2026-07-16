package If;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Grade: ");
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'A' : System.out.println("Excellent");
		break;
		case 'B': System.out.println("Vey Good");
		break;
		case 'C' : System.out.println("Good");
		break;
		case 'D' : System.out.println("Need Improvement");
		break;
		case 'F' : System.out.println("Fail");
		break;
		default: System.out.println("Invalid Grade\nGo and join in 1st class");
		
		}
		sc.close();
	}

}
