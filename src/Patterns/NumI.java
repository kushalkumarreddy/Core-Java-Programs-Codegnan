package Patterns;

public class NumI {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i++) {
			int num=i;
			int val=1;
			for(int j=1;j<=n;j++) {
				if(num<=n) {
					System.out.print(num);
					num++;
				}else {
					System.out.print(val);
					val++;
					
				}
			}
			System.out.println();
		}
		

	}

}
