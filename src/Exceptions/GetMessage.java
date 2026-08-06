package Exceptions;

public class GetMessage {
	public static void main(String[] args) {
		
		int num = 10, div = 0,res = 0;
		
		try {
		res = num/div;
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		System.out.println(res);
		System.out.println("Bye");
		
	}

}
