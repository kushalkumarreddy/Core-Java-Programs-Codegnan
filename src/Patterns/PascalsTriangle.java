package Patterns;

public class PascalsTriangle {

	public static void main(String[] args) {
		int n=5;
		int val=1;
		int space=n-val;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			
			
			int num=1;
			for(int j=1;j<=val;j++) {
				System.out.print(num+" ");
				num=num*(i-j)/j;
			}
			System.out.println();
			val++;
			space--;
			
		}
	}

}
