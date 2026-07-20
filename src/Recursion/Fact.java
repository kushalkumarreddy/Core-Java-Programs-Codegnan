package Recursion;

public class Fact {
	static int fact(int n){
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		int res = fact(4);
		System.out.println(res);
	}

}
