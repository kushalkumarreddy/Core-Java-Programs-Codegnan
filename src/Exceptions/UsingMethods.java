package Exceptions;

public class UsingMethods {
	public static int test() {
		try {
			System.out.println("It is try block");
			return 1;
		} catch(ArithmeticException e) {
			System.out.println("Catch block");
			return 2;
		} finally {
			System.out.println("Finally block");
		}
	}
	
	public static void main(String[] args) {
		System.out.println(test());
	}

}
