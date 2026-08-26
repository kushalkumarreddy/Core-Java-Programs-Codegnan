package Patterns;

public class UperTriangle {

	public static void main(String[] args) {
		int n=5;
		
		int star=1;
		int space=n-star;

		for(int i=1;i<=n;i++){

		   //to print spaces
		   for(int j=1;j<=space;j++){
		     System.out.print(" ");
		   }
		   
		   //to print stars
		   for(int k=1;k<=star;k++){
		     System.out.print("*");
		   }
		   
		   System.out.println();
		   star+=2;//star=star+2
		   space--;


		}


		
	}

}
