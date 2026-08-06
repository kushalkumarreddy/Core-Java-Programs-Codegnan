package Exceptions;

public class ExceptionPropogation {
	
	public static void m1() {
		m2();
	}
	
	public static void m2() {
		try {
		m3();
		} catch (ArithmeticException e) {
			System.out.println("m2 Method handled");
		}
	}
	
	public static void m3() {
		int num = 10/0;
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		try {
		m1();
		} catch(ArithmeticException e) {
			System.out.println("Main Method Handle");
		}
		System.out.println("It is main method");
	}

}
