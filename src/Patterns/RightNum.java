package jfs56.numarical;


/*1 
12 
123 
1234 
12345 */

public class RightNum {

	public static void main(String[] args) {
		int n=5;
		int val=1;
		int space=n-val;
		
		
		for(int i=1;i<=n;i++) {
			int num=1;
			for(int j=1;j<=val;j++) {
				System.out.print(num);
				num++;
			}
			System.out.println(" ");
			val++;
		}
		
		
	}

}
