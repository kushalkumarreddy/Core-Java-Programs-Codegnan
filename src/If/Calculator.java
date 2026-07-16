package If;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		System.out.println("Enter operator: ");
		char o = sc.next().charAt(0);
		
		switch(o) {
		case '+' : System.out.println("Result: "+(a+b));
		break;
		case '-' : System.out.println("Result: "+(a-b));
		break;
		case '*' : System.out.println("Result: "+(a*b));
		break;
		case '/' : System.out.println("Result: "+(a/b));
		break;
		case '%' : System.out.println("Result: "+(a%b));
		break;
		default: System.out.println("Invalid Operator");
		}
		sc.close();
	}

}
