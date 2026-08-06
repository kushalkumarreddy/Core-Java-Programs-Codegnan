package Exceptions;

public class ExceptionHirarchy {
	public static void main(String[] args) {
		
		try {
			int num = 10/0;
			System.out.println(num);
		} catch(NullPointerException e) {
			System.out.println("Null pointer exception");
		} catch(Exception e) {
			System.out.println("Exception block");
		}
	}

}
