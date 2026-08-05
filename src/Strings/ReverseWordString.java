package Strings;

public class ReverseWordString {
	public static void main(String[] args) {
		
		String s = "I am java developer";
		
		String arr[] = s.split(" ");
		String rev = "";
		
		for(int i=arr.length-1; i>=0; i--) {
			rev = rev + arr[i] + " ";
		}
		
		System.out.println(rev);
		
	}

}
