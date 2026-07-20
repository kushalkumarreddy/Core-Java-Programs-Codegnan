package Recursion;

public class PrimeNum {
	static boolean prime(int n, int divn) {
		if(n==divn) {
			return true;
		}
		if(n%divn==0) {
			return false;
		}
		
		return prime(n,divn+1);
	}
	
	public static void main(String[] args) {
		boolean res = prime(4,2);
		if(res) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not Prime");
		}
	}

}