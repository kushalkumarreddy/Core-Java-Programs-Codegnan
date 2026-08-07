package Exceptions;

public class ThrowException {
	
	static void chackAge(int age) {
		if(age<18) {
			throw new IllegalArgumentException("Invalid Age");
		}
		System.out.println("Eligible for vote");
	}
	
	public static void main(String[] args) {
		try {
			chackAge(10);
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		System.out.println("Program completed");
	}

}
