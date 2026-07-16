package Arrays;

public class MultiDimArray {
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6}};
		
		System.out.println(arr.length);  //rows
		System.out.println(arr[0].length); // specific row
		System.out.println(arr[1].length); 
		System.out.println(arr[0][0]); // specific place
		System.out.println("\n--------------\n");
		
		for(int i=0;i<arr.length;i++) { 
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]); //both rows and cols
			}
			System.out.println("");
		}
	}

}
