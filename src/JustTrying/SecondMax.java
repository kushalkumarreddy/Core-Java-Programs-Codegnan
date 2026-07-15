package JustTrying;

public class SecondMax {
	public static void main(String[] args) {
		
		int arr[] = {14,5,13,1};
		int max = arr[0];
		int smax = arr[1];
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]>max) {
				smax = max;
				max = arr[i];
			} else if(arr[i]>smax && max>arr[i]) {
				smax = arr[i];
			}
		}
		
		System.out.println(smax);
	}

}
