package JustTrying;

public class Pattern {
	public static void main(String[] args) {
		int n = 5;
		for(int i=1;i<n;i++) {
			
			for(int l=1;l<i;l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int l=i;l<n;l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
