package Patterns;

public class ChPyramid {

	public static void main(String[] args) {
		int n=4;
		int val=1;
		int space=n-1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			
			char ch='A';
			for(int j=1;j<=val;j++) {
				System.out.print(ch);
				ch++;
			}
			ch-=2;
			for(int j=1;j<val;j++) {
				System.out.print(ch);
				ch--;
			}
			System.out.println();
			val++;
			space--;
			
		}
		
	}

}
