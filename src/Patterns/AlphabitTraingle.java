package Patterns;

public class AlphabitTraingle {

	public static void main(String[] args) {
		int n=5;
		int val=1;
		
		for(int i=1;i<=n;i++) {
			char ch='A';
			for(int j=1;j<=val;j++) {
				System.out.print(ch);
				ch++;
			}
			val++;
			System.out.println();
		}
	

	}

}
