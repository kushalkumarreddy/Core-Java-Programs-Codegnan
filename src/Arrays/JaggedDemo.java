package Arrays;

import java.util.Scanner;

public class JaggedDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the jagged array size: ");  //Array Rows
		int n = sc.nextInt();
		
		int arr[][] = new int[n][];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter no of cols: "+i+"th row"); // if 2 then 0 row 2 cols 
			int col = sc.nextInt();
			arr[i] = new int[col]; // arr[0] = new int[2];
			
			for(int j=0;j<col;j++) {
				System.out.println("Enter value"+i+" "+j);
				arr[i][j] = sc.nextInt(); //arr[0][0]=15;
			}
		}
		
		for(int i=0;i<arr.length;i++) { //arr.length Returns the number of rows.
			for(int j=0;j<arr[i].length;j++) { // arr[i].length Returns the number of columns in the current row.
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
		sc.close();
	}

}
