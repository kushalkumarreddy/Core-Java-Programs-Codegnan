package PracticeSession;

public class TwoSum {
	public static void main(String[] args) {
		
		int arr[] = {9,3,6,2,1};
		int target = 7;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int sum = arr[i]+arr[j];
				if(target == sum) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
}