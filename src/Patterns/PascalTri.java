package Patterns;

public class PascalTri {

	public static void main(String[] args) {
		int n=5;
		int val=1;
		int space=n-val;

		for(int i=1;i<=n;i++){
		//to print space
		 for(int j=1;j<=space;j++){
		   System.out.print(" ");
		 }
		 int num=1;
		 for(int k=1;k<=val;k++){
		   System.out.print(num+" ");
		   num=num*(i-k)/k;
		 
		 }
		 System.out.println();
		 val++;
		 space--;
		 
		}
	}

}
