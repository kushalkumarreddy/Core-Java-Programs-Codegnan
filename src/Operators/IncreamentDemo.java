package Operators;

public class IncreamentDemo {
	public static void main(String[] args) {
		int a=10;
		int b=a++ + --a;
		int c=--a + a--;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
