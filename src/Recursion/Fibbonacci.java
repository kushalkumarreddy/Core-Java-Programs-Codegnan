package Recursion;

public class Fibbonacci {
	static int fib(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}
	
	public static void main(String[] args) {
		int digits = 10;
		
		for(int i=0;i<digits;i++) {
			System.out.print(fib(i)+" ");
		}
	}

}