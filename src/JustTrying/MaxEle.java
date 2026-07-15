package JustTrying;

public class MaxEle {
	public static void main(String[] args) {
		int arr[] = {4,5,3,6,1};
		int max = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("max="+max);
		
	}

}
