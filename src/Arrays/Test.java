package Arrays;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,4,1,5};
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int smin=Integer.MAX_VALUE;
		for(int i=0; i< arr.length;i++) {
			if(arr[i]>max) {
				smax = max;
				max = arr[i];
			}
			else if(arr[i]>max && arr[i]!=0) {
				smax=arr[i];
			}
			
			if(arr[i]<min) {
				smin = min;
				min =arr[i];
			}
			else if(arr[i]<min && arr[i]!=min) {
				smin = arr[i];
			}
			}
		System.out.println(smax);
		System.out.println(smin);
	}
}
