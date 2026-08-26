package Patterns;

public class UpperSTri {

	public static void main(String[] args) {
		 int n=4;
		 int star=1,space=n-star;
		 
		 //rows interation
		 for(int i=1;i<=n;i++){
		    for(int j=1;j<=space;j++){
			  System.out.print(" ");
			}
			
			//to print star
			for(int k=1;k<=star;k++){
				if(k==star) {
			System.out.print("*");
				}else {
					System.out.print("* ");
				}
				
			}
			System.out.println();
			star++;
			space--;
		 
		 }
	}

}
