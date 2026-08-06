package Exceptions;

public class FinallyDemo {
	public static void main(String[] args) {
		
		try {
			System.out.println("try block");
			int num = 10/0;
			System.out.println(num);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("It is finally block");
		}
	}

}
