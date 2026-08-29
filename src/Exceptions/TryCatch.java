package Exceptions;

public class TryCatch {
	public static void main(String[] args) {
		
		int num = 10, div = 0,res = 0;
		
		try {
		res = num/div;
		} catch (Exception e) {
			System.out.println(num + " Not divisible by Zero");
		}
		
		System.out.println(res);
		
	}

}