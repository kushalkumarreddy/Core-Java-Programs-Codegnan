package Exceptions;

public class MultipleCatch {
	public static void main(String[] args) {
		
		int num = 10, div = 0,res = 0;
		String s = null;
		
		try {
			System.out.println(s.length());
			res = num/div;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(res);
		System.out.println("Bye");
	}

}
