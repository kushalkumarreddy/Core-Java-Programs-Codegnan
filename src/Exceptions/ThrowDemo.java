package Exceptions;

public class ThrowDemo {
	
	public static void check(int age) {
		if(age<18) {
			throw new IllegalArgumentException("Not Valid age");
		}
		System.out.println("Elligable for vote");
	}
	
	public static void main(String[] args) {
		try {			
		check(12);
		} catch(Exception e) {
			System.out.println("It is main catch block");
		}
		System.out.println("It is Sucessfully executed");
	}

}
